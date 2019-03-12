package com.hotelserver.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.StringUtils;
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
import com.hotelserver.model.HotelPOI;
import com.hotelserver.model.HotelPriceModel;
import com.hotelserver.model.ImageJSON;
import com.hotelserver.model.OTAHotelAvailRS;
import com.hotelserver.model.OTAHotelAvailRS.RoomStays.RoomStay;
import com.hotelserver.model.RoomStayType;
import com.hotelserver.model.RoomTypeType;
import com.hotelserver.model.SecondCallRequest;
import com.hotelserver.model.propertylist.AmenitiesModel;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.propertylist.PropertyListViewModel;
import com.hotelserver.model.propertylist.PropertyModel;
import com.hotelserver.model.propertylist.PropertyTypeModel;
import com.hotelserver.model.propertylist.PropertyVsDescriptionModel;
import com.hotelserver.model.propertylist.PropertyVsImageModel;
import com.hotelserver.model.propertylist.PropertyVsNearbyModel;
import com.hotelserver.model.propertylist.PropertyVsSpaceRuleModel;
import com.hotelserver.model.propertylist.PropertyVsSpecialExperienceModel;
import com.hotelserver.model.propertylist.RoomCategoryModel;
import com.hotelserver.model.propertylist.RoomModel;
import com.hotelserver.model.propertylist.RoomVsAmenitiesModel;
import com.hotelserver.model.propertylist.SpaceRuleModel;
import com.hotelserver.model.propertylist.SpecialExperienceModel;
import com.hotelserver.model.propertylist.StayTypeModel;
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
								}
								
								// Room
								if(!CollectionUtils.isEmpty(roomStay2.getRoomTypes().getRoomType())) {
									List<RoomTypeType> roomTypes = roomStay2.getRoomTypes().getRoomType();
									Map<String, HotelPriceModel> roomPrices = new ConcurrentHashMap<>();
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
										
										HotelPriceModel hotelPriceModel = new HotelPriceModel();
										hotelPriceModel.setCommission(0.0D);
										hotelPriceModel.setPrice(0.0D);
										roomPrices.put(roomType.getRoomTypeCode(), hotelPriceModel);
									}
									
									List<RoomStayType.RoomRates.RoomRate> roomRates = roomStay2.getRoomRates().getRoomRate();
									for(RoomStayType.RoomRates.RoomRate roomRate : roomRates) {
										if(Objects.nonNull(roomPrices.get(roomRate.getRoomID()))) {
											try {
												HotelPriceModel hotelPriceModel = new HotelPriceModel();
												hotelPriceModel.setCommission(roomRate.getRates().getRate().get(0).getTPAExtensions().getAffiliateCommission().getAmount());
												hotelPriceModel.setPrice(roomRate.getRates().getRate().get(0).getBase().getAmountBeforeTax().doubleValue());
												roomPrices.put(roomRate.getRoomID(), hotelPriceModel);
											} catch (Exception e) {
												
											}
										}
									}
									
									Double min = Double.MAX_VALUE;
									List<String> minKeys = new ArrayList<> ();
									for(Map.Entry<String, HotelPriceModel> entry: roomPrices.entrySet()) {
										if(entry.getValue().getPrice() < min) {
									        min = entry.getValue().getPrice();
									        minKeys.clear();
									    }
									    if(entry.getValue().getPrice() == min) {
									        minKeys.add(entry.getKey());
									    }
									}
									
									HotelPriceModel hotelPriceModel = roomPrices.get(minKeys.get(0));
									propertyListViewModel.setTotalPrice(String.valueOf(hotelPriceModel.getPrice()));
									// TODO Calculate for ORA Discount
									propertyListViewModel.setDiscountedPrice(String.valueOf(hotelPriceModel.getPrice() - hotelPriceModel.getCommission()));
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

	@Override
	public PropertyModel fetchHotelDetails(FilterCiteriaModel filterCiteriaModel) throws FormExceptions {

		if (logger.isInfoEnabled()) {
			logger.info("fetchHotelDetails -- START");
		}
		
		PropertyModel propertyModel = new PropertyModel();
		Map<String, Exception> exceptions = new LinkedHashMap<>();
		
		SecondCallRequest secondCallRequest = new SecondCallRequest(); 
		secondCallRequest.setCorrelationID(filterCiteriaModel.getCorrelationID());
		secondCallRequest.setCheckInDate(filterCiteriaModel.getCheckInDate());
		secondCallRequest.setCheckOutDate(filterCiteriaModel.getCheckOutDate());
		secondCallRequest.setNoOfAdult(filterCiteriaModel.getNoOfAdult());
		secondCallRequest.setNoOfChild(filterCiteriaModel.getNoOfChild());
		secondCallRequest.setHotelCode(filterCiteriaModel.getPropertyId());
		
		propertyModel.setCorrelationID(filterCiteriaModel.getCorrelationID());
			
		// Getting Hotel Details By second Call
		OTAHotelAvailRS otaHotelAvailRS2 = soapCall.secondCall(secondCallRequest);
		if(Objects.nonNull(otaHotelAvailRS2) && Objects.nonNull(otaHotelAvailRS2.getErrors()) && !CollectionUtils.isEmpty(otaHotelAvailRS2.getErrors().getError())) {
			exceptions.put(otaHotelAvailRS2.getErrors().getError().get(0).getCode(), new Exception(otaHotelAvailRS2.getErrors().getError().get(0).getShortText()));
		} else {
			if(Objects.nonNull(otaHotelAvailRS2.getRoomStays()) && !CollectionUtils.isEmpty(otaHotelAvailRS2.getRoomStays().getRoomStay())) {
				RoomStay roomStay2 = otaHotelAvailRS2.getRoomStays().getRoomStay().get(0);
				// Basic Info
				if(Objects.nonNull(roomStay2.getBasicPropertyInfo())) {
					BasicPropertyInfoType basicPropertyInfoType = roomStay2.getBasicPropertyInfo();
					if(Objects.nonNull(basicPropertyInfoType.getPosition())) {
						propertyModel.setLatitude(basicPropertyInfoType.getPosition().getLatitude()); // Set Latitude
						propertyModel.setLongitude(basicPropertyInfoType.getPosition().getLongitude()); // Set Longitude
					}
					
					propertyModel.setPropertyId(roomStay2.getBasicPropertyInfo().getHotelCode()); // Set Property Id
					propertyModel.setOraname("ORA"+roomStay2.getBasicPropertyInfo().getHotelCode()); // Set OraName
					if(Objects.nonNull(basicPropertyInfoType.getAddress()) && !CollectionUtils.isEmpty(basicPropertyInfoType.getAddress().getAddressLine())) {
						propertyModel.setAddress(basicPropertyInfoType.getAddress().getAddressLine().get(0) 
								+ "." +basicPropertyInfoType.getAddress().getCityName() 
								+ "." +basicPropertyInfoType.getAddress().getPostalCode()); // Set Address
					}
					
					try {
						propertyModel.setRating(basicPropertyInfoType.getAward().get(0).getRating()); // Set Rating
					} catch (Exception e) {
						propertyModel.setRating("0");
					}
				}
				
				// Image
				if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia())) {
					propertyModel.setCoverImageUrl(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageUrl());
					PropertyTypeModel propertyTypeModel = new PropertyTypeModel();
					propertyTypeModel.setImgUrl(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageUrl());
					propertyTypeModel.setName("Hotel");
					propertyModel.setPropertyTypeModel(propertyTypeModel);
				}
				
				StayTypeModel stayTypeModel = new StayTypeModel();
				stayTypeModel.setStayTypeName("Short Term");
				propertyModel.setStayTypeModel(stayTypeModel);
				
				// Review
				try {
					if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getReviews())) {
						propertyModel.setReviewCount(String.valueOf(roomStay2.getTPAExtensions().getHotelBasicInformation().getReviews().getReviewCount()));
					}
				} catch (Exception e) {
					propertyModel.setReviewCount("0");
				}
				
				// Properties Ammenities
				try {
					if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities())) {
						 List<Amenities.PropertyAmenities> ammenities = roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities().getPropertyAmenities();
						 List<PropertyVsSpecialExperienceModel> propertyVsSpecialExperienceModels = new ArrayList<>();
						 ammenities.parallelStream().forEach(a -> {
							 SpecialExperienceModel specialExperienceModel = new SpecialExperienceModel();
							 specialExperienceModel.setExperienceName(a.getDescription());
							 specialExperienceModel.setExperienceId(a.getCode());
							 PropertyVsSpecialExperienceModel propertyVsSpecialExperienceModel = new PropertyVsSpecialExperienceModel(); 
							 propertyVsSpecialExperienceModel.setSpecialExperienceModel(specialExperienceModel);
						 });
						 
						 propertyModel.setPropertyVsSpecialExperienceModels(propertyVsSpecialExperienceModels);
					}
				} catch (Exception e) {
					
				}
				
				// Property Vs NearBy
				if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getPOI())) {
					List<HotelPOI> hotelPOI = roomStay2.getTPAExtensions().getHotelBasicInformation().getPOI().getHotelPOI();
					List<PropertyVsNearbyModel> propertyVsNearbyModels = new CopyOnWriteArrayList<>();
					hotelPOI.parallelStream().forEach(h -> {
						PropertyVsNearbyModel propertyVsNearbyModel = new PropertyVsNearbyModel();
						propertyVsNearbyModel.setPlaces(h.getPOIName());
						propertyVsNearbyModels.add(propertyVsNearbyModel);
					});
					propertyModel.setPropertyVsNearbyModels(propertyVsNearbyModels);
				}
				
				// Property Vs Images
				if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia()) 
						&& Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageJSON()) && !CollectionUtils.isEmpty(roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageJSON().getImagesList())) {
					List<ImageJSON.ImagesList> imagesLists = roomStay2.getTPAExtensions().getHotelBasicInformation().getMultimedia().getImageJSON().getImagesList();
					List<PropertyVsImageModel> propertyVsImageModels = new CopyOnWriteArrayList<>();
					imagesLists.parallelStream().forEach(i -> {
						PropertyVsImageModel propertyVsImageModel = new PropertyVsImageModel();
						propertyVsImageModel.setImageURL(i.getLargeImageObj().getUrl());
						propertyVsImageModels.add(propertyVsImageModel);
					});
					propertyModel.setPropertyVsImageModels(propertyVsImageModels);
				}
				
				// Property Vs Description
				if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getDescription())) {
					List<PropertyVsDescriptionModel> propertyVsDescriptionModels = new ArrayList<>();
					PropertyVsDescriptionModel propertyVsDescriptionModel = new PropertyVsDescriptionModel();
					propertyVsDescriptionModel.setDescription(roomStay2.getTPAExtensions().getHotelBasicInformation().getDescription());
					propertyVsDescriptionModels.add(propertyVsDescriptionModel);
					
					PropertyVsDescriptionModel propertyVsDescriptionModel2 = new PropertyVsDescriptionModel();
					propertyVsDescriptionModel2.setDescription(roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenityDescription());
					propertyVsDescriptionModels.add(propertyVsDescriptionModel2);
					
					propertyModel.setPropertyVsDescriptionModels(propertyVsDescriptionModels);
				}
				
				// Room
				List<RoomModel> roomModels = new ArrayList<>();
				
				if(!CollectionUtils.isEmpty(roomStay2.getRoomTypes().getRoomType())) {
					List<RoomTypeType> roomTypes = roomStay2.getRoomTypes().getRoomType();
					Map<String, HotelPriceModel> roomPrices = new ConcurrentHashMap<>();
					List<String> minKeys = new ArrayList<> ();
					for(RoomTypeType roomType : roomTypes) {
						if(roomPrices.isEmpty()) {
							if(!roomType.isNonSmoking()) {
								SpaceRuleModel spaceRuleModel = new SpaceRuleModel();
								spaceRuleModel.setRuleName("Smoking");
								spaceRuleModel.setImgUrl("https://s-ec.bstatic.com/images/hotel/max1024x768/141/141830278.jpg");
								spaceRuleModel.setSmImgUrl("https://s-ec.bstatic.com/images/hotel/max1024x768/141/141830278.jpg");
								List<PropertyVsSpaceRuleModel> propertyVsSpaceRuleModels = new CopyOnWriteArrayList<>();
								PropertyVsSpaceRuleModel propertyVsSpaceRuleModel = new PropertyVsSpaceRuleModel();
								propertyVsSpaceRuleModel.setSpaceRuleModel(spaceRuleModel);
								propertyVsSpaceRuleModels.add(propertyVsSpaceRuleModel);
								propertyModel.setPropertyVsSpaceRuleModels(propertyVsSpaceRuleModels);// Set Smoking
							}
						}
						
						HotelPriceModel hotelPriceModel = new HotelPriceModel();
						hotelPriceModel.setCommission(0.0D);
						hotelPriceModel.setPrice(0.0D);
						roomPrices.put(roomType.getRoomTypeCode(), hotelPriceModel);
						
						RoomModel roomModel = new RoomModel();
						roomModel.setRoomId(roomType.getRoomTypeCode());
						roomModel.setOraRoomName("ORA"+roomType.getRoomTypeCode());
						roomModel.setSharedSpace("N");
						roomModel.setCotAvailable("N");
						roomModel.setNoOfGuest(String.valueOf(roomType.getOccupancy().get(0).getMaxOccupancy()));
						roomModel.setNoOfChild(String.valueOf(roomType.getOccupancy().get(1).getMaxOccupancy()));
						
						RoomCategoryModel roomCategoryModel = new RoomCategoryModel();
						roomCategoryModel.setName(roomType.getRoomType());
						roomModel.setRoomCategoryModel(roomCategoryModel);
						
						List<RoomStayType.RoomRates.RoomRate> roomRates = roomStay2.getRoomRates().getRoomRate();
						for(RoomStayType.RoomRates.RoomRate roomRate : roomRates) {
							if(Objects.nonNull(roomPrices.get(roomRate.getRoomID()))) {
								try {
									HotelPriceModel hotelPriceModel2 = new HotelPriceModel();
									hotelPriceModel2.setRatePlanCode(roomRate.getRatePlanCode());
									hotelPriceModel2.setCommission(roomRate.getRates().getRate().get(0).getTPAExtensions().getAffiliateCommission().getAmount());
									hotelPriceModel2.setPrice(roomRate.getRates().getRate().get(0).getBase().getAmountBeforeTax().doubleValue());
									roomPrices.put(roomRate.getRoomID(), hotelPriceModel2);
								} catch (Exception e) {
									
								}
							}
						}
						
						// Calculate Minimum Price
						Double min = Double.MAX_VALUE;
						for(Map.Entry<String, HotelPriceModel> entry: roomPrices.entrySet()) {
							if(entry.getValue().getPrice() < min) {
						        min = entry.getValue().getPrice();
						        minKeys.clear();
						    }
						    if(entry.getValue().getPrice() == min) {
						        minKeys.add(entry.getKey());
						    }
						}
						
						HotelPriceModel hotelPriceModel3 = roomPrices.get(roomModel.getRoomId());
						roomModel.setRoomPricePerNight(String.valueOf(hotelPriceModel3.getPrice()));
						roomModel.setAccomodationName("PRIVATE");
						roomModel.setRoomStandard(roomType.getRoomType());
						if(StringUtils.equals(minKeys.get(0), roomModel.getRoomId())) {
							roomModel.setIsSelected("true");
						} else {
							roomModel.setIsSelected("false");
						}
						
						// TODO Set Room Price
						roomModel.setOraPrice(String.valueOf(hotelPriceModel3.getPrice()));
						roomModel.setOraDiscount(String.valueOf(hotelPriceModel.getCommission()));
						roomModel.setPriceDrop("0.0");
						roomModel.setOraFinalPrice(String.valueOf(hotelPriceModel.getPrice() - hotelPriceModel.getCommission()));
						
						// Room Ammenities
						try {
							if(Objects.nonNull(roomStay2.getTPAExtensions()) && Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation()) &&  Objects.nonNull(roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities())) {
								 List<Amenities.RoomAmenities> ammenities = roomStay2.getTPAExtensions().getHotelBasicInformation().getAmenities().getRoomAmenities();
								 List<RoomVsAmenitiesModel> roomVsAmenitiesModels = new ArrayList<>();
								 ammenities.parallelStream().forEach(a -> {
									 RoomVsAmenitiesModel roomVsAmenitiesModel = new RoomVsAmenitiesModel();
									 AmenitiesModel amenitiesModel = new AmenitiesModel();
									 amenitiesModel.setAminitiesId(a.getCode());
									 amenitiesModel.setAminitiesName(a.getDescription());
									 roomVsAmenitiesModel.setAmenitiesModel(amenitiesModel);
									 roomVsAmenitiesModels.add(roomVsAmenitiesModel);
								 });
								 
								 roomModel.setRoomVsAmenitiesModels(roomVsAmenitiesModels);
								 
								 List<PropertyVsSpecialExperienceModel> propertyVsSpecialExperienceModels = new ArrayList<>();
								 ammenities.parallelStream().forEach(a -> {
									 SpecialExperienceModel specialExperienceModel = new SpecialExperienceModel();
									 specialExperienceModel.setExperienceName(a.getDescription());
									 specialExperienceModel.setExperienceId(a.getCode());
									 PropertyVsSpecialExperienceModel propertyVsSpecialExperienceModel = new PropertyVsSpecialExperienceModel(); 
									 propertyVsSpecialExperienceModel.setSpecialExperienceModel(specialExperienceModel);
								 });
								 
								 propertyModel.setPropertyVsSpecialExperienceModels(propertyVsSpecialExperienceModels);
								 
							}
						} catch (Exception e) {
							
						}
						
						
						// TODO Room Images
						//roomModel.setRoomVsImageModels(roomVsImageModels);
						roomModels.add(roomModel);
					}
					
					propertyModel.setRoomModels(roomModels);
					
					HotelPriceModel hotelPriceModel = roomPrices.get(minKeys.get(0));
					propertyModel.setTotalAmount(String.valueOf(hotelPriceModel.getPrice()));
					// TODO Calculate for ORA Discount
					propertyModel.setTotalDiscount(String.valueOf(hotelPriceModel.getCommission()));
					propertyModel.setAmountPayable(String.valueOf(hotelPriceModel.getPrice() - hotelPriceModel.getCommission()));
					propertyModel.setPropertyOffer("0.0");
					
					// TODO Remove HardCoding & Fetch From DB or call Property List Server
					propertyModel.setConvenienceFee("200");
					propertyModel.setConvenienceGSTPercentage("18");
					propertyModel.setConvenienceGSTAmount("36");
				}
				
			}
		}
		
		propertyModel.setIsBookmark(false);
		
		if (exceptions.size() > 0)
			throw new FormExceptions(exceptions);
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchHotelDetails -- END");
		}
		
		return propertyModel;
	}

}
