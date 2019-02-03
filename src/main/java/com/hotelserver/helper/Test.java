package com.hotelserver.helper;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hotelserver.model.secondresponse.SecondResponse;

public class Test {

	public static void main(String[] args) {

		try {
			Test test = new Test();
			String json = test.xmlToJSON("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
					"    <soap:Body>\r\n" + 
					"        <OTA_HotelAvailRS xmlns=\"http://www.opentravel.org/OTA/2003/05\" CorrelationID=\"e752e844-7aad-428d-9de3-30b0b24a3336\" PrimaryLangID=\"en\" AltLangID=\"en\">\r\n" + 
					"            <Success/>\r\n" + 
					"            <RoomStays>\r\n" + 
					"                <RoomStay>\r\n" + 
					"                    <RoomTypes>\r\n" + 
					"                        <RoomType NonSmoking=\"false\" RoomType=\"Executive\" RoomTypeCode=\"0000037609\">\r\n" + 
					"                            <RoomDescription>\r\n" + 
					"                                <Text>Executive Room</Text>\r\n" + 
					"                                <Image>https://imgcld.yatra.com/ytimages/image/upload/t_hotel_srplist/v1497334583/Hotel/Mumbai/00009838/Executive_1_D1eIjU.jpg</Image>\r\n" + 
					"                                <Image>https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334583/Hotel/Mumbai/00009838/Executive_1_D1eIjU.jpg</Image>\r\n" + 
					"                            </RoomDescription>\r\n" + 
					"                            <AdditionalDetails/>\r\n" + 
					"                            <Occupancy MaxOccupancy=\"3\" AgeQualifyingCode=\"10\"/>\r\n" + 
					"                            <Occupancy MaxOccupancy=\"2\" AgeQualifyingCode=\"8\" MaxAge=\"12\" MinAge=\"7\"/>\r\n" + 
					"                            <TPA_Extensions checkinRestriction=\"false\" checkoutRestriction=\"false\">\r\n" + 
					"                                <RoomType maxAdult=\"3\" maxChild=\"2\" maxChildAge=\"12\" maxGuest=\"3\" minChildAge=\"7\" propertyLevel=\"N\" smoking=\"Y\"/>\r\n" + 
					"                            </TPA_Extensions>\r\n" + 
					"                        </RoomType>\r\n" + 
					"                        <RoomType NonSmoking=\"false\" RoomType=\"Suite\" RoomTypeCode=\"0000037611\">\r\n" + 
					"                            <RoomDescription>\r\n" + 
					"                                <Text>Suite Room</Text>\r\n" + 
					"                                <Image>https://imgcld.yatra.com/ytimages/image/upload/t_hotel_srplist/v1497334677/Hotel/Mumbai/00009838/Suite_1_gkdvi9.jpg</Image>\r\n" + 
					"                                <Image>https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334677/Hotel/Mumbai/00009838/Suite_1_gkdvi9.jpg</Image>\r\n" + 
					"                            </RoomDescription>\r\n" + 
					"                            <AdditionalDetails/>\r\n" + 
					"                            <Occupancy MaxOccupancy=\"3\" AgeQualifyingCode=\"10\"/>\r\n" + 
					"                            <Occupancy MaxOccupancy=\"2\" AgeQualifyingCode=\"8\" MaxAge=\"12\" MinAge=\"7\"/>\r\n" + 
					"                            <TPA_Extensions checkinRestriction=\"false\" checkoutRestriction=\"false\">\r\n" + 
					"                                <RoomType maxAdult=\"3\" maxChild=\"2\" maxChildAge=\"12\" maxGuest=\"3\" minChildAge=\"7\" propertyLevel=\"N\" smoking=\"Y\"/>\r\n" + 
					"                            </TPA_Extensions>\r\n" + 
					"                        </RoomType>\r\n" + 
					"                    </RoomTypes>\r\n" + 
					"                    <RatePlans>\r\n" + 
					"                        <RatePlan AvailableQuantity=\"4\" RatePlanCode=\"0000144760\" RatePlanName=\"Executive\" RatePlanType=\"24\">\r\n" + 
					"                            <Guarantee GuaranteeType=\"PrePay\"/>\r\n" + 
					"                            <CancelPenalties>\r\n" + 
					"                                <CancelPenalty NonRefundable=\"false\">\r\n" + 
					"                                    <Deadline/>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>Full refund if you cancel this booking by 28-Mar-19 12:00 PM IST.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>First night cost (including taxes &amp; service charge) will be charged if you cancel this booking later than 28-Mar-19 12:00 PM IST.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>You might be charged upto the full cost of stay (including taxes &amp;amp; service charge) if you do not check-in to the hotel.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"FREE_CANCELLATION\">\r\n" + 
					"                                        <Text>Y</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                                <CancelPenalty>\r\n" + 
					"                                    <Deadline OffsetDropTime=\"BeforeArrival\" OffsetTimeUnit=\"Hour\" OffsetUnitMultiplier=\"9999\"/>\r\n" + 
					"                                    <AmountPercent NmbrOfNights=\"0\" TaxInclusive=\"false\" Amount=\"0.0\"/>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                                <CancelPenalty>\r\n" + 
					"                                    <Deadline OffsetDropTime=\"BeforeArrival\" OffsetTimeUnit=\"Hour\" OffsetUnitMultiplier=\"24\"/>\r\n" + 
					"                                    <AmountPercent NmbrOfNights=\"1\" TaxInclusive=\"true\" Amount=\"0.0\"/>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                            </CancelPenalties>\r\n" + 
					"                            <RatePlanDescription>\r\n" + 
					"                                <Text/>\r\n" + 
					"                                <Text/>\r\n" + 
					"                            </RatePlanDescription>\r\n" + 
					"                            <RatePlanInclusions>\r\n" + 
					"                                <RatePlanInclusionDesciption>\r\n" + 
					"                                    <Text>Breakfast, </Text>\r\n" + 
					"                                    <Text>Early Check-in / Late Check-out (Subject to Availability), </Text>\r\n" + 
					"                                </RatePlanInclusionDesciption>\r\n" + 
					"                            </RatePlanInclusions>\r\n" + 
					"                            <TPA_Extensions>\r\n" + 
					"                                <DiscountCouponDisplayIndicator Enabled=\"true\"/>\r\n" + 
					"                                <BestRatePlan>true</BestRatePlan>\r\n" + 
					"                            </TPA_Extensions>\r\n" + 
					"                        </RatePlan>\r\n" + 
					"                        <RatePlan AvailableQuantity=\"2\" RatePlanCode=\"0000144761\" RatePlanName=\"Suite\" RatePlanType=\"24\">\r\n" + 
					"                            <Guarantee GuaranteeType=\"PrePay\"/>\r\n" + 
					"                            <CancelPenalties>\r\n" + 
					"                                <CancelPenalty NonRefundable=\"false\">\r\n" + 
					"                                    <Deadline/>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>Full refund if you cancel this booking by 28-Mar-19 12:00 PM IST.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>First night cost (including taxes &amp; service charge) will be charged if you cancel this booking later than 28-Mar-19 12:00 PM IST.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"CANCELLATION_POLICY\">\r\n" + 
					"                                        <Text>You might be charged upto the full cost of stay (including taxes &amp;amp; service charge) if you do not check-in to the hotel.</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                    <PenaltyDescription Name=\"FREE_CANCELLATION\">\r\n" + 
					"                                        <Text>Y</Text>\r\n" + 
					"                                    </PenaltyDescription>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                                <CancelPenalty>\r\n" + 
					"                                    <Deadline OffsetDropTime=\"BeforeArrival\" OffsetTimeUnit=\"Hour\" OffsetUnitMultiplier=\"9999\"/>\r\n" + 
					"                                    <AmountPercent NmbrOfNights=\"0\" TaxInclusive=\"false\" Amount=\"0.0\"/>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                                <CancelPenalty>\r\n" + 
					"                                    <Deadline OffsetDropTime=\"BeforeArrival\" OffsetTimeUnit=\"Hour\" OffsetUnitMultiplier=\"24\"/>\r\n" + 
					"                                    <AmountPercent NmbrOfNights=\"1\" TaxInclusive=\"true\" Amount=\"0.0\"/>\r\n" + 
					"                                </CancelPenalty>\r\n" + 
					"                            </CancelPenalties>\r\n" + 
					"                            <RatePlanDescription>\r\n" + 
					"                                <Text/>\r\n" + 
					"                                <Text/>\r\n" + 
					"                            </RatePlanDescription>\r\n" + 
					"                            <RatePlanInclusions>\r\n" + 
					"                                <RatePlanInclusionDesciption>\r\n" + 
					"                                    <Text>Breakfast, </Text>\r\n" + 
					"                                    <Text>Early Check-in / Late Check-out (Subject to Availability), </Text>\r\n" + 
					"                                </RatePlanInclusionDesciption>\r\n" + 
					"                            </RatePlanInclusions>\r\n" + 
					"                            <TPA_Extensions>\r\n" + 
					"                                <DiscountCouponDisplayIndicator Enabled=\"true\"/>\r\n" + 
					"                            </TPA_Extensions>\r\n" + 
					"                        </RatePlan>\r\n" + 
					"                    </RatePlans>\r\n" + 
					"                    <RoomRates>\r\n" + 
					"                        <RoomRate RoomID=\"0000037609\" RatePlanCode=\"0000144760\">\r\n" + 
					"                            <Rates>\r\n" + 
					"                                <Rate EffectiveDate=\"2019-03-29T00:00:00.000+05:30\">\r\n" + 
					"                                    <Base AmountBeforeTax=\"5199.0\">\r\n" + 
					"                                        <Taxes Amount=\"0\"/>\r\n" + 
					"                                    </Base>\r\n" + 
					"                                    <TPA_Extensions>\r\n" + 
					"                                        <Rate BaseAdultOccupancy=\"2\" BaseChildOccupancy=\"0\" Bookable=\"true\" RatePlanCode=\"0000144760\" RoomTypeCode=\"0000037609\"/>\r\n" + 
					"                                        <AffiliateCommission Amount=\"987.0\" HotelTaxIncluded=\"false\" Percent=\"19.0\"/>\r\n" + 
					"                                    </TPA_Extensions>\r\n" + 
					"                                </Rate>\r\n" + 
					"                            </Rates>\r\n" + 
					"                            <Total CurrencyCode=\"INR\"/>\r\n" + 
					"                            <GuestCounts>\r\n" + 
					"                                <GuestCount AgeQualifyingCode=\"10\" Count=\"2\"/>\r\n" + 
					"                                <GuestCount AgeQualifyingCode=\"8\" Count=\"0\"/>\r\n" + 
					"                            </GuestCounts>\r\n" + 
					"                        </RoomRate>\r\n" + 
					"                        <RoomRate RoomID=\"0000037611\" RatePlanCode=\"0000144761\">\r\n" + 
					"                            <Rates>\r\n" + 
					"                                <Rate EffectiveDate=\"2019-03-29T00:00:00.000+05:30\">\r\n" + 
					"                                    <Base AmountBeforeTax=\"7199.0\">\r\n" + 
					"                                        <Taxes Amount=\"0\"/>\r\n" + 
					"                                    </Base>\r\n" + 
					"                                    <TPA_Extensions>\r\n" + 
					"                                        <Rate BaseAdultOccupancy=\"2\" BaseChildOccupancy=\"0\" Bookable=\"true\" RatePlanCode=\"0000144761\" RoomTypeCode=\"0000037611\"/>\r\n" + 
					"                                        <AffiliateCommission Amount=\"1367.0\" HotelTaxIncluded=\"false\" Percent=\"19.0\"/>\r\n" + 
					"                                    </TPA_Extensions>\r\n" + 
					"                                </Rate>\r\n" + 
					"                            </Rates>\r\n" + 
					"                            <Total CurrencyCode=\"INR\"/>\r\n" + 
					"                            <GuestCounts>\r\n" + 
					"                                <GuestCount AgeQualifyingCode=\"10\" Count=\"2\"/>\r\n" + 
					"                                <GuestCount AgeQualifyingCode=\"8\" Count=\"0\"/>\r\n" + 
					"                            </GuestCounts>\r\n" + 
					"                        </RoomRate>\r\n" + 
					"                    </RoomRates>\r\n" + 
					"                    <BasicPropertyInfo CurrencyCode=\"INR\" HotelCode=\"00009838\" HotelName=\"Goldfinch Hotel\">\r\n" + 
					"                        <Position Latitude=\"19.119741\" Longitude=\"72.870251\"/>\r\n" + 
					"                        <Address>\r\n" + 
					"                            <AddressLine>Plot no. 34/21, Central Rd,MIDC, Krantiveer Lakhuji Salve Marg, Mulgaon, Andheri (E)</AddressLine>\r\n" + 
					"                            <CityName>Mumbai</CityName>\r\n" + 
					"                            <PostalCode>400093</PostalCode>\r\n" + 
					"                            <StateProv StateCode=\"27\">Maharashtra</StateProv>\r\n" + 
					"                            <CountryName>India</CountryName>\r\n" + 
					"                        </Address>\r\n" + 
					"                        <Award Rating=\"4\"/>\r\n" + 
					"                    </BasicPropertyInfo>\r\n" + 
					"                    <TPA_Extensions LowestRatePlanId=\"0000144760\" PahSCRestriction=\"true\" StopSell=\"false\">\r\n" + 
					"                        <HotelBasicInformation AmenityDescription=\"The property has a restaurant, lounge, swimming pool, fitness centre, and a banquet hall. Valet-parking service is also available.    Guests can avail an airport transfer facility. Goldfinch Hotel can also be reached from Andheri Railway Station (3.6 km). Powai Lake is 5.5 km from this property.  Note: The famous restaurant Saffron Spice is under renovation until further notice.\" Area=\"Andheri East\" AreaSeoId=\"andheri-east\" CheckInTime=\"1200\" CheckOutTime=\"1200\" CitySeoId=\"mumbai\" Description=\"Goldfinch Hotel in Mumbai is easily accessible from Chhatrapati Shivaji International Airport(5.6 km). The property has a rooftop pool and offers a buffet breakfast service (multi-cuisine) to the guests.  Goldfinch Hotel offers luxury accommodation in Mumbai. The property has a total of 89 spacious rooms which are equipped with contemporary amenities like a mini-bar, Wi-Fi access and an electronic safe. The rooms also have a private bathroom with toiletries.\" HotelCategory=\"35\" HotelType=\"TGU\" NumberOfFloors=\"7\" NumberOfRooms=\"94\" StateSeoId=\"maharashtra\" isFlexibleCheckIn=\"false\" propertyType=\"Hotels\" yatraSmart=\"false\">\r\n" + 
					"                            <Reviews/>\r\n" + 
					"                            <Multimedia ImageUrl=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334318/Hotel/Mumbai/00009838/02_c78VPt.jpg\" ThumbnailUrl=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_srplist/v1497334318/Hotel/Mumbai/00009838/02_c78VPt.jpg\">\r\n" + 
					"                                <ImageJSON>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Night View\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334318/Hotel/Mumbai/00009838/02_c78VPt.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Night View\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334318/Hotel/Mumbai/00009838/02_c78VPt.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Overview\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334169/Hotel/Mumbai/00009838/_DSC0286_3in6wP.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Overview\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334169/Hotel/Mumbai/00009838/_DSC0286_3in6wP.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Porch\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334356/Hotel/Mumbai/00009838/_DSC0338_4NMAxH.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Porch\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334356/Hotel/Mumbai/00009838/_DSC0338_4NMAxH.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Porch\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334384/Hotel/Mumbai/00009838/_DSC0311_wbWQFj.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Porch\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334384/Hotel/Mumbai/00009838/_DSC0311_wbWQFj.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Entrance\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334403/Hotel/Mumbai/00009838/_DSC0341_NATV3s.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Entrance\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334403/Hotel/Mumbai/00009838/_DSC0341_NATV3s.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Reception\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334428/Hotel/Mumbai/00009838/_DSC0308_2AyqkY.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Reception\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334428/Hotel/Mumbai/00009838/_DSC0308_2AyqkY.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Lobby\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334451/Hotel/Mumbai/00009838/_DSC0304_99rnhl.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Lobby\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334451/Hotel/Mumbai/00009838/_DSC0304_99rnhl.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Corridor\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334469/Hotel/Mumbai/00009838/5910470_18_y_pmeCuY.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Corridor\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334469/Hotel/Mumbai/00009838/5910470_18_y_pmeCuY.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334563/Hotel/Mumbai/00009838/Executive_1_Et05U5.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334563/Hotel/Mumbai/00009838/Executive_1_Et05U5.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334623/Hotel/Mumbai/00009838/Executive_2_SIitV6.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334623/Hotel/Mumbai/00009838/Executive_2_SIitV6.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334641/Hotel/Mumbai/00009838/Executive_3_WMxmmc.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Executive Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334641/Hotel/Mumbai/00009838/Executive_3_WMxmmc.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Suite Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334660/Hotel/Mumbai/00009838/Suite_1_1VLYap.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Suite Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334660/Hotel/Mumbai/00009838/Suite_1_1VLYap.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Suite Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334732/Hotel/Mumbai/00009838/Suite_2_NBo1zI.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Suite Room\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334732/Hotel/Mumbai/00009838/Suite_2_NBo1zI.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Suite Bathroom\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334891/Hotel/Mumbai/00009838/Suite_4_fh6bjJ.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Suite Bathroom\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334891/Hotel/Mumbai/00009838/Suite_4_fh6bjJ.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Pool Area\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497334929/Hotel/Mumbai/00009838/Pool_2_hIaYoZ.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Pool Area\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497334929/Hotel/Mumbai/00009838/Pool_2_hIaYoZ.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Pool Side\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335033/Hotel/Mumbai/00009838/Pool_1_CBE831.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Pool Side\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335033/Hotel/Mumbai/00009838/Pool_1_CBE831.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Restaurant\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335115/Hotel/Mumbai/00009838/SS2_61W16K.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Restaurant\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335115/Hotel/Mumbai/00009838/SS2_61W16K.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Restaurant\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335159/Hotel/Mumbai/00009838/SS5_uB7VUZ.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Restaurant\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335159/Hotel/Mumbai/00009838/SS5_uB7VUZ.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335209/Hotel/Mumbai/00009838/Untitled_4_6ibLjW.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335209/Hotel/Mumbai/00009838/Untitled_4_6ibLjW.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335232/Hotel/Mumbai/00009838/Untitled2_XmJyhT.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335232/Hotel/Mumbai/00009838/Untitled2_XmJyhT.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335276/Hotel/Mumbai/00009838/Untitled3_yTwaLz.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Bar\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335276/Hotel/Mumbai/00009838/Untitled3_yTwaLz.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Gym\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335312/Hotel/Mumbai/00009838/Gym_sA5Jol.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Gym\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335312/Hotel/Mumbai/00009838/Gym_sA5Jol.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335483/Hotel/Mumbai/00009838/Banquet_3_uc9s9c.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335483/Hotel/Mumbai/00009838/Banquet_3_uc9s9c.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335510/Hotel/Mumbai/00009838/Banquet_4_IzzShI.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335510/Hotel/Mumbai/00009838/Banquet_4_IzzShI.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335530/Hotel/Mumbai/00009838/IMG-20160206-WA0002_nGz6aR.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335530/Hotel/Mumbai/00009838/IMG-20160206-WA0002_nGz6aR.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                    <ImagesList>\r\n" + 
					"                                        <ThumbnailImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_lastmindeals/v1497335555/Hotel/Mumbai/00009838/Senate_3dUntitled_uwqv5J.jpg\" width=\"\"/>\r\n" + 
					"                                        <LargeImageObj caption=\"Goldfinch Hotel\" category=\"Banquet Hall\" height=\"\" sizeName=\"\" subCategory=\"\" url=\"https://imgcld.yatra.com/ytimages/image/upload/t_hotel_mobileactualimage/v1497335555/Hotel/Mumbai/00009838/Senate_3dUntitled_uwqv5J.jpg\" width=\"\"/>\r\n" + 
					"                                    </ImagesList>\r\n" + 
					"                                </ImageJSON>\r\n" + 
					"                            </Multimedia>\r\n" + 
					"                            <POI>\r\n" + 
					"                                <HotelPOI POIDistance=\"2.0\" POIName=\"Seven Hill Hospital\"/>\r\n" + 
					"                                <HotelPOI POIDistance=\"2.5\" POIName=\"International Airport\"/>\r\n" + 
					"                                <HotelPOI POIDistance=\"3.0\" POIName=\"Andheri Railway Station\"/>\r\n" + 
					"                            </POI>\r\n" + 
					"                            <Amenities>\r\n" + 
					"                                <PropertyAmenities code=\"08\" description=\"Banquet facilities\"/>\r\n" + 
					"                                <PropertyAmenities code=\"03\" description=\"Airport transportation\"/>\r\n" + 
					"                                <PropertyAmenities code=\"02\" description=\"Central Air Conditioning\"/>\r\n" + 
					"                                <PropertyAmenities code=\"2018\" description=\"Spa\"/>\r\n" + 
					"                                <PropertyAmenities code=\"30\" description=\"Coffee shop or cafe\"/>\r\n" + 
					"                                <PropertyAmenities code=\"31\" description=\"Newspaper\"/>\r\n" + 
					"                                <PropertyAmenities code=\"345\" description=\"Swimming pool\"/>\r\n" + 
					"                                <PropertyAmenities code=\"32\" description=\"Breakfast Services\"/>\r\n" + 
					"                                <PropertyAmenities code=\"519\" description=\"Shopping Close by\"/>\r\n" + 
					"                                <PropertyAmenities code=\"54\" description=\"Internet Access\"/>\r\n" + 
					"                                <PropertyAmenities code=\"536\" description=\"Restaurants that deliver\"/>\r\n" + 
					"                                <PropertyAmenities code=\"47\" description=\"Front desk\"/>\r\n" + 
					"                                <PropertyAmenities code=\"394\" description=\"Housekeeping\"/>\r\n" + 
					"                                <PropertyAmenities code=\"404\" description=\"Tea Coffee Maker\"/>\r\n" + 
					"                                <PropertyAmenities code=\"378\" description=\"Video Game Console\"/>\r\n" + 
					"                                <PropertyAmenities code=\"58\" description=\"WIFI\"/>\r\n" + 
					"                                <PropertyAmenities code=\"63\" description=\"Medical services\"/>\r\n" + 
					"                                <PropertyAmenities code=\"723\" description=\"Lockers\"/>\r\n" + 
					"                                <PropertyAmenities code=\"722\" description=\"Laptop safe\"/>\r\n" + 
					"                                <PropertyAmenities code=\"716\" description=\"Airport Shuttle (surcharge)\"/>\r\n" + 
					"                                <PropertyAmenities code=\"71\" description=\"Parking\"/>\r\n" + 
					"                                <PropertyAmenities code=\"84\" description=\"Room service\"/>\r\n" + 
					"                                <PropertyAmenities code=\"87\" description=\"Safe Deposit Box\"/>\r\n" + 
					"                                <PropertyAmenities code=\"83\" description=\"Restaurant\"/>\r\n" + 
					"                                <PropertyAmenities code=\"778\" description=\"Coffee machine\"/>\r\n" + 
					"                                <PropertyAmenities code=\"780\" description=\"Dryer\"/>\r\n" + 
					"                                <PropertyAmenities code=\"794\" description=\"Dining area\"/>\r\n" + 
					"                                <PropertyAmenities code=\"764\" description=\"Restaurant with Dining Menu\"/>\r\n" + 
					"                                <PropertyAmenities code=\"767\" description=\"Towels\"/>\r\n" + 
					"                                <PropertyAmenities code=\"745\" description=\"Telephone\"/>\r\n" + 
					"                                <PropertyAmenities code=\"746\" description=\"TV\"/>\r\n" + 
					"                                <RoomAmenities code=\"373\" description=\"Bottled/drinking water\"/>\r\n" + 
					"                                <RoomAmenities code=\"369\" description=\"Shower Caps\"/>\r\n" + 
					"                                <RoomAmenities code=\"370\" description=\"Tea Coffee Maker\"/>\r\n" + 
					"                                <RoomAmenities code=\"511\" description=\"Attached Bathroom\"/>\r\n" + 
					"                                <RoomAmenities code=\"325\" description=\"Television-Room\"/>\r\n" + 
					"                                <RoomAmenities code=\"326\" description=\"Telephone-Room\"/>\r\n" + 
					"                                <RoomAmenities code=\"321\" description=\"Slippers\"/>\r\n" + 
					"                                <RoomAmenities code=\"352\" description=\"Handicap accessible rooms\"/>\r\n" + 
					"                                <RoomAmenities code=\"330\" description=\"Video-game console\"/>\r\n" + 
					"                                <RoomAmenities code=\"332\" description=\"Wakeup-calls\"/>\r\n" + 
					"                                <RoomAmenities code=\"333\" description=\"Welcome amenities\"/>\r\n" + 
					"                                <RoomAmenities code=\"361\" description=\"Desk\"/>\r\n" + 
					"                                <RoomAmenities code=\"360\" description=\"Central Air Conditioning\"/>\r\n" + 
					"                                <RoomAmenities code=\"363\" description=\"Bottle opener,Wardrobe, water\"/>\r\n" + 
					"                                <RoomAmenities code=\"366\" description=\"Temperature Control\"/>\r\n" + 
					"                                <RoomAmenities code=\"307\" description=\"Minibar\"/>\r\n" + 
					"                                <RoomAmenities code=\"155\" description=\"In-room safe\"/>\r\n" + 
					"                                <RoomAmenities code=\"161\" description=\"Internet access-wireless\"/>\r\n" + 
					"                                <RoomAmenities code=\"163\" description=\"Iron/ironing board(on request)\"/>\r\n" + 
					"                                <RoomAmenities code=\"153\" description=\"Housekeeping\"/>\r\n" + 
					"                                <RoomAmenities code=\"151\" description=\"Hair dryer\"/>\r\n" + 
					"                                <RoomAmenities code=\"146\" description=\"Extra towels,linens,bedding\"/>\r\n" + 
					"                                <RoomAmenities code=\"141\" description=\"Complimentary toiletries\"/>\r\n" + 
					"                                <RoomAmenities code=\"131\" description=\"Cable/satellite TV\"/>\r\n" + 
					"                                <RoomAmenities code=\"139\" description=\"Complimentary newspaper\"/>\r\n" + 
					"                                <RoomAmenities code=\"130\" description=\"Bottled water in room(complimentary)\"/>\r\n" + 
					"                                <RoomAmenities code=\"125\" description=\"Bathroom telephone\"/>\r\n" + 
					"                            </Amenities>\r\n" + 
					"                            <CrossLinks PropertyName=\"Capitol(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/capitol-cwt-00096371\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Club Emerald\" URL=\"//www.travelguru.com/hotels/India/mumbai/club-emerald-00084638\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Comfort Inn Heritage\" URL=\"//www.travelguru.com/hotels/India/mumbai/comfort-inn-heritage-00000348\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Country Inn &amp; Suites By Radisson Navi Mumbai\" URL=\"//www.travelguru.com/hotels/India/mumbai/country-inn-suites-by-carlson-00014371\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Country Inn(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/country-inn-cwt-00096962\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Fariyas Colaba(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/fariyas-colaba-cwt-00093985\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Fariyas Hotel Mumbai\" URL=\"//www.travelguru.com/hotels/India/mumbai/fariyas-hotel-mumbai-00000249\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Fortune Park Lake City Thane(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/fortune-park-lake-city-thane-cwt-00093987\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Fortune Park LakeCity\" URL=\"//www.travelguru.com/hotels/India/mumbai/fortune-park-lakecity-00005106\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Fortune Select Exotica(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/fortune-select-exotica-cwt-00096369\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Four Points Vashi(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/four-points-vashi-cwt-00096370\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Four Points by Sheraton Navi Mumbai, Vashi\" URL=\"//www.travelguru.com/hotels/India/mumbai/four-points-by-sheraton-navi-mumbai-vashi-00004790\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Gagal Home service apartment\" URL=\"//www.travelguru.com/hotels/India/mumbai/gagal-home-service-apartment-00087828\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Genesis Resort\" URL=\"//www.travelguru.com/hotels/India/mumbai/genesis-resort-00083389\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Grand Residency Hotel &amp; Serviced Apartments\" URL=\"//www.travelguru.com/hotels/India/mumbai/grand-residency-hotel-serviced-apartments-00002829\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Holiday Inn Mumbai International Airport\" URL=\"//www.travelguru.com/hotels/India/mumbai/holiday-inn-mumbai-international-airport-00005270\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Hotel Kohinoor Continental\" URL=\"//www.travelguru.com/hotels/India/mumbai/hotel-kohinoor-continental-00000248\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Hotel Kohinoor Continental(CWT)\" URL=\"//www.travelguru.com/hotels/India/mumbai/hotel-kohinoor-continental-cwt-00093976\"/>\r\n" + 
					"                            <CrossLinks PropertyName=\"Hotel Suba International\" URL=\"//www.travelguru.com/hotels/India/mumbai/hotel-suba-international-00007327\"/>\r\n" + 
					"                        </HotelBasicInformation>\r\n" + 
					"                        <DeepLinkInformation overviewURL=\"//www.travelguru.com/hotels/India/mumbai/aura-grande-00009838?checkInDate=29-03-2019&amp;checkOutDate=30-03-2019&amp;numRooms=1&amp;rooms[0].adult=1&amp;rooms[0].children=0&amp;currencyCode=INR\"/>\r\n" + 
					"                    </TPA_Extensions>\r\n" + 
					"                </RoomStay>\r\n" + 
					"            </RoomStays>\r\n" + 
					"        </OTA_HotelAvailRS>\r\n" + 
					"    </soap:Body>\r\n" + 
					"</soap:Envelope>");
			
			test.jsonToXML(json);
			
			SecondResponse SecondResponse = jsonToObject(json, SecondResponse.class);
			
			System.out.println("SecondResponse ==>> "+SecondResponse);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String xmlToJSON(String xml) throws Exception {
		
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
        String json = xmlJSONObj.toString();
        System.out.println(json);
        return json;
        
	}
	
	public String jsonToXML(String json) throws Exception {
		
		JSONObject jsonObject = new JSONObject(json);
		String xml = XML.toString(jsonObject);
		System.out.println(xml);
		return xml;
	}
	
	public static<T> T jsonToObject(String value, Class<T> t) throws Exception {
		
		if(t != null && StringUtils.isNotBlank(value)) {
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
			return gson.fromJson(value, t);
		} else {
			return null;
		}
	}
}
