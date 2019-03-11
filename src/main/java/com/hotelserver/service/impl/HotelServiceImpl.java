package com.hotelserver.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.hotelserver.exceptions.FormExceptions;
import com.hotelserver.helper.SoapCall;
import com.hotelserver.model.Amenities;
import com.hotelserver.model.BasicPropertyInfoType;
import com.hotelserver.model.OTAHotelAvailRS;
import com.hotelserver.model.RoomStayType;
import com.hotelserver.model.OTAHotelAvailRS.RoomStays.RoomStay;
import com.hotelserver.model.RoomTypeType;
import com.hotelserver.model.SecondCallRequest;
import com.hotelserver.model.propertylist.AmenitiesModel;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.propertylist.PropertyListViewModel;
import com.hotelserver.model.propertylist.SpaceRuleModel;
import com.hotelserver.service.HotelService;

@Service
@Transactional(readOnly = true)
public class HotelServiceImpl implements HotelService {

	private static final Logger logger = LogManager.getLogger(HotelServiceImpl.class);
	
	@Autowired
	private SoapCall soapCall;
	
	@Override
	public List<PropertyListViewModel> fetchHotels(FilterCiteriaModel filterCiteriaModel) throws FormExceptions {

		if (logger.isInfoEnabled()) {
			logger.info("fetchHotels -- START");
		}
		
		List<PropertyListViewModel> propertyListViewModels = new CopyOnWriteArrayList<>();
		Map<String, Exception> exceptions = new LinkedHashMap<>();
		
		// Getting Hotel List By first Call
		OTAHotelAvailRS otaHotelAvailRS = soapCall.firstCall(filterCiteriaModel);
		if(Objects.nonNull(otaHotelAvailRS) && Objects.nonNull(otaHotelAvailRS.getErrors()) && !CollectionUtils.isEmpty(otaHotelAvailRS.getErrors().getError())) {
			exceptions.put(otaHotelAvailRS.getErrors().getError().get(0).getCode(), new Exception(otaHotelAvailRS.getErrors().getError().get(0).getShortText()));
		} else {
			SecondCallRequest secondCallRequest = new SecondCallRequest(); 
			secondCallRequest.setCorrelationID(otaHotelAvailRS.getCorrelationID());
			secondCallRequest.setCheckInDate(filterCiteriaModel.getCheckInDate());
			secondCallRequest.setCheckOutDate(filterCiteriaModel.getCheckOutDate());
			secondCallRequest.setNoOfAdult(filterCiteriaModel.getNoOfAdult());
			secondCallRequest.setNoOfChild(filterCiteriaModel.getNoOfChild());
			
			if(Objects.nonNull(otaHotelAvailRS.getRoomStays()) && !CollectionUtils.isEmpty(otaHotelAvailRS.getRoomStays().getRoomStay())) {
				List<RoomStay> roomStays = otaHotelAvailRS.getRoomStays().getRoomStay();
				//for(RoomStay roomStay : roomStays) {
				roomStays.parallelStream().forEach(roomStay -> {	
					PropertyListViewModel propertyListViewModel = new PropertyListViewModel();
					
					propertyListViewModel.setCorrelationID(otaHotelAvailRS.getCorrelationID());
					// Basic Info
					if(Objects.nonNull(roomStay.getBasicPropertyInfo())) {
						secondCallRequest.setHotelCode(roomStay.getBasicPropertyInfo().getHotelCode());
						
						// Getting Hotel Details By second Call
						OTAHotelAvailRS otaHotelAvailRS2 = soapCall.secondCall(secondCallRequest);
						if(Objects.nonNull(otaHotelAvailRS2) && Objects.nonNull(otaHotelAvailRS2.getErrors()) && !CollectionUtils.isEmpty(otaHotelAvailRS2.getErrors().getError())) {
							exceptions.put(otaHotelAvailRS2.getErrors().getError().get(0).getCode(), new Exception(otaHotelAvailRS2.getErrors().getError().get(0).getShortText()));
						} else {
							if(Objects.nonNull(otaHotelAvailRS2.getRoomStays()) && !CollectionUtils.isEmpty(otaHotelAvailRS2.getRoomStays().getRoomStay())) {
								RoomStay roomStay2 = otaHotelAvailRS2.getRoomStays().getRoomStay().get(0);
								// Basic Info
								if(Objects.nonNull(roomStay2.getBasicPropertyInfo())) {
									BasicPropertyInfoType basicPropertyInfoType = roomStay.getBasicPropertyInfo();
									if(Objects.nonNull(basicPropertyInfoType.getPosition())) {
										propertyListViewModel.setLatitude(basicPropertyInfoType.getPosition().getLatitude()); // Set Latitude
										propertyListViewModel.setLongitude(basicPropertyInfoType.getPosition().getLongitude()); // Set Longitude
									}
									
									propertyListViewModel.setPropertyId(roomStay.getBasicPropertyInfo().getHotelCode()); // Set Property Id
									propertyListViewModel.setOraName("ORA"+roomStay.getBasicPropertyInfo().getHotelCode()); // Set OraName
									if(Objects.nonNull(basicPropertyInfoType.getAddress()) && !CollectionUtils.isEmpty(basicPropertyInfoType.getAddress().getAddressLine())) {
										propertyListViewModel.setAddress(basicPropertyInfoType.getAddress().getAddressLine().get(0) 
												+ "." +basicPropertyInfoType.getAddress().getCityName() 
												+ "." +basicPropertyInfoType.getAddress().getPostalCode()); // Set Address
									}
									
									try {
										propertyListViewModel.setRating(basicPropertyInfoType.getAward().get(0).getRating()); // Set Rating
									} catch (Exception e) {
										propertyListViewModel.setRating("0");
									}
								}
								
								// Image
								if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia())) {
									propertyListViewModel.setCoverImageURL(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageUrl());
								}
								
								// Review
								try {
									if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getReviews())) {
										propertyListViewModel.setReviewCount(String.valueOf(roomStay2.getTPAExtensions().getHotelBasicInformation().getReviews().getReviewCount()));
									}
								} catch (Exception e) {
									propertyListViewModel.setReviewCount("0");
								}
								
								// Ammenities
								try {
									if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities())) {
										 List<Amenities.PropertyAmenities> ammenities = roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities().getPropertyAmenities();
										 Set<AmenitiesModel> amenitiesModels = new HashSet<>();
										 ammenities.parallelStream().forEach(a -> {
											 AmenitiesModel amenitiesModel = new AmenitiesModel();
											 amenitiesModel.setAminitiesName(a.getDescription());
											 amenitiesModel.setAminitiesType("BASIC");
											 amenitiesModels.add(amenitiesModel);
										 });
										propertyListViewModel.setAmenitiesModels(amenitiesModels);
									}
								} catch (Exception e) {
									propertyListViewModel.setReviewCount("0");
								}
								
								// Room
								if(!CollectionUtils.isEmpty(roomStay2.getRoomTypes().getRoomType())) {
									List<RoomTypeType> roomTypes = roomStay2.getRoomTypes().getRoomType();
									Map<String, Double> roomPrices = new ConcurrentHashMap<>();
									for(RoomTypeType roomType : roomTypes) {
										if(roomPrices.isEmpty()) {
											propertyListViewModel.setRoomStandard(roomType.getRoomType()); // Set Room Standard
											if(!roomType.isNonSmoking()) {
												List<SpaceRuleModel> spaceRuleModels = new ArrayList<>();
												SpaceRuleModel spaceRuleModel = new SpaceRuleModel();
												spaceRuleModel.setRuleName("Smoking");
												spaceRuleModel.setImgUrl("https://s-ec.bstatic.com/images/hotel/max1024x768/141/141830278.jpg");
												spaceRuleModel.setSmImgUrl("https://s-ec.bstatic.com/images/hotel/max1024x768/141/141830278.jpg");
												spaceRuleModels.add(spaceRuleModel);
												propertyListViewModel.setSpaceRuleModels(spaceRuleModels); // Set Smoking
											}
										}
										
										roomPrices.put(roomType.getRoomTypeCode(), 0.0D);
									}
									
									List<RoomStayType.RoomRates.RoomRate> roomRates = roomStay2.getRoomRates().getRoomRate();
									for(RoomStayType.RoomRates.RoomRate roomRate : roomRates) {
										if(Objects.nonNull(roomPrices.get(roomRate.getRoomID()))) {
											try {
											roomPrices.put(roomRate.getRoomID(), roomRate.getRates().getRate().get(0).getBase().getAmountBeforeTax().doubleValue());
											} catch (Exception e) {
												
											}
										}
									}
									
									Double minValueInMap = (Collections.min(roomPrices.values()));
									propertyListViewModel.setTotalPrice(String.valueOf(minValueInMap));
								}
								
							}
						}
						
						propertyListViewModel.setStayType("PRIVATE");
						propertyListViewModel.setIsBookmark(false);
						propertyListViewModel.setPgCategorySex("BOTH");
					}
					
					propertyListViewModels.add(propertyListViewModel);
					//break;
				});
			}
		}
		
		if (exceptions.size() > 0)
			throw new FormExceptions(exceptions);
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchHotels -- END");
		}
		
		return propertyListViewModels;
	}

}
