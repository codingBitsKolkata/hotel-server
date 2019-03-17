package com.hotelserver.helper;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.hotelserver.config.BookingClient;
import com.hotelserver.config.SearchClient;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.search.AvailRequestSegmentsType;
import com.hotelserver.model.search.CountryNameType;
import com.hotelserver.model.search.DateTimeSpanType;
import com.hotelserver.model.search.GuestCountType;
import com.hotelserver.model.search.HotelSearchCriteriaType;
import com.hotelserver.model.search.HotelSearchCriterionType;
import com.hotelserver.model.search.ItemSearchCriterionType;
import com.hotelserver.model.search.OTAHotelAvailRQ;
import com.hotelserver.model.search.OTAHotelAvailRS;
import com.hotelserver.model.search.Pagination;
import com.hotelserver.model.search.RoomStayCandidateType;
import com.hotelserver.model.search.SecondCallRequest;
import com.hotelserver.model.search.TPAExtensionsType;

@Component
public class SoapCall extends WebServiceGatewaySupport {

	private static final Logger logger = LogManager.getLogger(SoapCall.class);
	
	@Value("${yatra.url}")
	private String yatraURL;
	
	@Value("${yatra.soap.action}")
	private String yatraSoapAction;
	
	@Value("${yatra.password}")
	private String yatraPassword;
	
	@Value("${yatra.propertyId}")
	private String yatraPropertyId;
	
	@Value("${yatra.username}")
	private String yatraUsername;
	
	@Autowired
	private SearchClient searchClient;
	
	@Autowired
	private BookingClient bookingClient;
	
	public OTAHotelAvailRS firstCall(FilterCiteriaModel filterCiteriaModel) {
		
		if (logger.isInfoEnabled()) {
			logger.info("firstCall -- START");
		}
		
		OTAHotelAvailRS otaHotelAvailRS = new OTAHotelAvailRS();
		try {
			OTAHotelAvailRQ otaHotelAvailRQ = new OTAHotelAvailRQ();
			OTAHotelAvailRQ.AvailRequestSegments availRequestSegments = new OTAHotelAvailRQ.AvailRequestSegments();
			AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria = new AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria();
			ItemSearchCriterionType.Address address = new ItemSearchCriterionType.Address();
			address.setCityName(filterCiteriaModel.getCityName());
			CountryNameType countryNameType = new CountryNameType();
			countryNameType.setCode(filterCiteriaModel.getCountryName());
			address.setCountryName(countryNameType);

			DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
			dateTimeSpanType.setEnd(filterCiteriaModel.getCheckOutDate());
			dateTimeSpanType.setStart(filterCiteriaModel.getCheckInDate());

			HotelSearchCriterionType.RoomStayCandidates roomStayCandidates = new HotelSearchCriterionType.RoomStayCandidates();

			GuestCountType guestCounts = new GuestCountType();
			GuestCountType.GuestCount guestCount1 = new GuestCountType.GuestCount();
			guestCount1.setAgeQualifyingCode("10");
			guestCount1.setCount(Integer.parseInt(filterCiteriaModel.getNoOfAdult()));
			guestCounts.getGuestCount().add(guestCount1);
			
			if(StringUtils.isNotEmpty(filterCiteriaModel.getNoOfChild())) {
				GuestCountType.GuestCount guestCount2 = new GuestCountType.GuestCount();
				guestCount2.setAgeQualifyingCode("8");
				guestCount2.setAge(10);
				guestCount2.setCount(Integer.parseInt(filterCiteriaModel.getNoOfChild()));
				guestCounts.getGuestCount().add(guestCount2);
			}

			RoomStayCandidateType roomStayCandidateType = new RoomStayCandidateType();
			roomStayCandidateType.setGuestCounts(guestCounts);
			roomStayCandidates.getRoomStayCandidate().add(roomStayCandidateType);

			TPAExtensionsType tpaExtensions = new TPAExtensionsType();
			Pagination pagination = new Pagination();

			pagination.setEnabled(false);
			pagination.setHotelsFrom(1);
			pagination.setHotelsTo(2);

			tpaExtensions.setPagination(pagination);

			TPAExtensionsType.UserAuthentication userAuthentication = new TPAExtensionsType.UserAuthentication();

			userAuthentication.setUsername(yatraUsername);
			userAuthentication.setPassword(yatraPassword);
			userAuthentication.setPropertyId(yatraPropertyId);
			tpaExtensions.setUserAuthentication(userAuthentication);

			HotelSearchCriteriaType.Criterion criterion = new HotelSearchCriteriaType.Criterion();
			criterion.setStayDateRange(dateTimeSpanType);
			criterion.setAddress(address);
			criterion.setRoomStayCandidates(roomStayCandidates);
			criterion.setTPAExtensions(tpaExtensions);

			hotelSearchCriteria.getCriterion().add(criterion);

			AvailRequestSegmentsType.AvailRequestSegment availRequestSegment = new AvailRequestSegmentsType.AvailRequestSegment();
			availRequestSegment.setHotelSearchCriteria(hotelSearchCriteria);

			availRequestSegments.getAvailRequestSegment().add(availRequestSegment);
			otaHotelAvailRQ.setAvailRequestSegments(availRequestSegments);
			otaHotelAvailRQ.setRequestedCurrency("INR");
			otaHotelAvailRQ.setSortOrder("TG_RANKING");
			otaHotelAvailRQ.setVersion(new BigDecimal(0.0));
			otaHotelAvailRQ.setPrimaryLangID("en");
			otaHotelAvailRQ.setSearchCacheLevel("VeryRecent");
			
			otaHotelAvailRS = searchClient.firstCall(otaHotelAvailRQ);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("firstCall -- END");
		}
		
		return otaHotelAvailRS;
	}
	
	public OTAHotelAvailRS secondCall(SecondCallRequest secondCallRequest) {
		
		if (logger.isInfoEnabled()) {
			logger.info("secondCall -- START");
		}
		
		OTAHotelAvailRS otaHotelAvailRS = new OTAHotelAvailRS();
		try {
			OTAHotelAvailRQ otaHotelAvailRQ = new OTAHotelAvailRQ();
			OTAHotelAvailRQ.AvailRequestSegments availRequestSegments = new OTAHotelAvailRQ.AvailRequestSegments();
			AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria = new AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria();

			DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
			dateTimeSpanType.setEnd(secondCallRequest.getCheckOutDate());
			dateTimeSpanType.setStart(secondCallRequest.getCheckInDate());

			HotelSearchCriterionType.RoomStayCandidates roomStayCandidates = new HotelSearchCriterionType.RoomStayCandidates();

			GuestCountType guestCounts = new GuestCountType();
			GuestCountType.GuestCount guestCount1 = new GuestCountType.GuestCount();
			guestCount1.setAgeQualifyingCode("10");
			guestCount1.setCount(Integer.parseInt(secondCallRequest.getNoOfAdult()));
			guestCounts.getGuestCount().add(guestCount1);
			
			if(StringUtils.isNotEmpty(secondCallRequest.getNoOfChild())) {
				GuestCountType.GuestCount guestCount2 = new GuestCountType.GuestCount();
				guestCount2.setAgeQualifyingCode("8");
				guestCount2.setAge(10);
				guestCount2.setCount(Integer.parseInt(secondCallRequest.getNoOfChild()));
				guestCounts.getGuestCount().add(guestCount2);
			}

			RoomStayCandidateType roomStayCandidateType = new RoomStayCandidateType();
			roomStayCandidateType.setGuestCounts(guestCounts);
			roomStayCandidates.getRoomStayCandidate().add(roomStayCandidateType);

			TPAExtensionsType tpaExtensions = new TPAExtensionsType();
			tpaExtensions.setSeoEnabled(false);
			Pagination pagination = new Pagination();

			pagination.setEnabled(false);
			pagination.setHotelsFrom(0);
			pagination.setHotelsTo(0);

			tpaExtensions.setPagination(pagination);

			TPAExtensionsType.UserAuthentication userAuthentication = new TPAExtensionsType.UserAuthentication();

			userAuthentication.setUsername(yatraUsername);
			userAuthentication.setPassword(yatraPassword);
			userAuthentication.setPropertyId(yatraPropertyId);
			tpaExtensions.setUserAuthentication(userAuthentication);

			HotelSearchCriteriaType.Criterion criterion = new HotelSearchCriteriaType.Criterion();
			ItemSearchCriterionType.HotelRef hotelRef = new ItemSearchCriterionType.HotelRef();
			hotelRef.setHotelCode(secondCallRequest.getHotelCode());
			criterion.getHotelRef().add(hotelRef);
			criterion.setStayDateRange(dateTimeSpanType);
			criterion.setRoomStayCandidates(roomStayCandidates);
			criterion.setTPAExtensions(tpaExtensions);

			hotelSearchCriteria.getCriterion().add(criterion);

			AvailRequestSegmentsType.AvailRequestSegment availRequestSegment = new AvailRequestSegmentsType.AvailRequestSegment();
			availRequestSegment.setHotelSearchCriteria(hotelSearchCriteria);

			availRequestSegments.getAvailRequestSegment().add(availRequestSegment);
			otaHotelAvailRQ.setAvailRequestSegments(availRequestSegments);
			otaHotelAvailRQ.setRequestedCurrency("INR");
			otaHotelAvailRQ.setCorrelationID(secondCallRequest.getCorrelationID());
			otaHotelAvailRQ.setSearchCacheLevel("Live");
			
			otaHotelAvailRS = searchClient.firstCall(otaHotelAvailRQ);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("secondCall -- END");
		}
		
		return otaHotelAvailRS;
	}
}
