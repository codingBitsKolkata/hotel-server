package com.hotelserver.helper;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.hotelserver.model.dumpdata.HotelDetails;
import com.hotelserver.model.dumpdata.Reviews;
import com.hotelserver.service.HotelDataService;

@Component
public class ReadHotelDumpData {

	private static final Logger logger = LogManager.getLogger(ReadHotelDumpData.class);
	
	public Map<String, HotelDetails> readMasterData(File file) {

		Map<String, HotelDetails> hotelData = new WeakHashMap<>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document dcmt = builder.parse(file);
			//Document dcmt = builder.parse(new File("hotel_dump_short.xml"));
			dcmt.getDocumentElement().normalize();
			//Element root = dcmt.getDocumentElement();
			NodeList hotelDescriptiveContentNodeList = dcmt.getElementsByTagName("HotelDescriptiveContent");

			for (int i = 0; i < hotelDescriptiveContentNodeList.getLength(); i++) {
				
				String hotelCode = "";
				try {
					HotelDetails hotelDetails = new HotelDetails();
					NodeList node = (NodeList) hotelDescriptiveContentNodeList;
					Element element = (Element) node.item(i);
					hotelCode = element.getAttribute("HotelCode");
					hotelDetails.setHotelName(element.getAttribute("HotelName"));

					NodeList hotelInfoNode = element.getElementsByTagName("HotelInfo");
					Element hotelInfoElement = (Element) hotelInfoNode.item(0);
					NodeList descriptionsNode = hotelInfoElement.getElementsByTagName("Descriptions");
					Element descriptionsElement = (Element) descriptionsNode.item(0);
					if(Objects.nonNull(descriptionsElement) && Objects.nonNull(descriptionsElement.getElementsByTagName("DescriptiveText")) 
							&& Objects.nonNull(descriptionsElement.getElementsByTagName("DescriptiveText").item(0))) {
						hotelDetails.setDescriptiveText(
								descriptionsElement.getElementsByTagName("DescriptiveText").item(0).getTextContent());
					}

					NodeList positionNode = hotelInfoElement.getElementsByTagName("Position");
					Element positionElement = (Element) positionNode.item(0);
					hotelDetails.setLatitude(positionElement.getAttribute("Latitude"));
					hotelDetails.setLongitude(positionElement.getAttribute("Longitude"));

					NodeList policiesNode = element.getElementsByTagName("Policies");
					Element policiesElement = (Element) policiesNode.item(0);
					NodeList policyNode = policiesElement.getElementsByTagName("Policy");

					Element policyElement = (Element) policyNode.item(0);
					NodeList policyInfoNode = policyElement.getElementsByTagName("PolicyInfo");
					Element policyInfoElement = (Element) policyInfoNode.item(0);
					hotelDetails.setCheckInTime(policyInfoElement.getAttribute("CheckInTime"));
					hotelDetails.setCheckOutTime(policyInfoElement.getAttribute("CheckOutTime"));
					
					NodeList contactInfos = element.getElementsByTagName("ContactInfos");
					Element contactInfosElement = (Element) contactInfos.item(0);
					NodeList contactInfoNode = contactInfosElement.getElementsByTagName("ContactInfo");
					Element contactInfoElement = (Element) contactInfoNode.item(0);
					NodeList addressesNode = contactInfoElement.getElementsByTagName("Addresses");
					Element addressesElement = (Element) addressesNode.item(0);
					NodeList addressNode = addressesElement.getElementsByTagName("Address");
					Element addressElement = (Element) addressNode.item(0);
					String address = addressElement.getElementsByTagName("AddressLine").item(2).getTextContent();
					hotelDetails.setAddress(address);
					
					NodeList tPA_ExtensionsNode = element.getElementsByTagName("TPA_Extensions");
					Element tPA_ExtensionsElement = (Element) tPA_ExtensionsNode.item(0);
					hotelDetails.setHotelImage(tPA_ExtensionsElement.getElementsByTagName("ImagePath").item(0).getTextContent());
					hotelDetails.setReviewCount(tPA_ExtensionsElement.getElementsByTagName("ReviewCount").item(0).getTextContent());
					hotelDetails.setReviewRating(tPA_ExtensionsElement.getElementsByTagName("ReviewRating").item(0).getTextContent());
					hotelDetails.setHotelImage(tPA_ExtensionsElement.getElementsByTagName("ImagePath").item(0).getTextContent());
					
					NodeList hotelReviewsNode = tPA_ExtensionsElement.getElementsByTagName("HotelReviews");
					Element hotelReviewsElement = (Element) hotelReviewsNode.item(0);
					NodeList hotelReviewNode = hotelReviewsElement.getElementsByTagName("HotelReview");


					List<Reviews> hotelReviews = new CopyOnWriteArrayList<>();
					for (int j = 0; j < hotelReviewNode.getLength(); j++) {
						
						Node node2 = hotelReviewNode.item(j);
						if (node2.getNodeType() == Node.ELEMENT_NODE) {
							Element reviewsElement = (Element) node2;

							Reviews reviews = new Reviews();
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("AvgGuestRating")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("AvgGuestRating").item(0))) {
								reviews.setAvgGuestRating(
										reviewsElement.getElementsByTagName("AvgGuestRating").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("Comments")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("Comments").item(0))) {
								reviews
								.setComments(reviewsElement.getElementsByTagName("Comments").item(0).getTextContent());
							}
							
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("PostDate")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("PostDate").item(0))) {
								reviews
								.setPostDate(reviewsElement.getElementsByTagName("PostDate").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("Cleanliness")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("Cleanliness").item(0))) {
								reviews.setCleanliness(
										reviewsElement.getElementsByTagName("Cleanliness").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("DiningQuality")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("DiningQuality").item(0))) {
								reviews.setDiningQuality(
										reviewsElement.getElementsByTagName("DiningQuality").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("OverallRating")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("OverallRating").item(0))) {
								reviews.setOverallRating(
										reviewsElement.getElementsByTagName("OverallRating").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("RoomQuality")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("RoomQuality").item(0))) {
								reviews.setRoomQuality(
										reviewsElement.getElementsByTagName("RoomQuality").item(0).getTextContent());
							}
							
							if(Objects.nonNull(reviewsElement) && Objects.nonNull(reviewsElement.getElementsByTagName("ServiceQuality")) 
									&& Objects.nonNull(reviewsElement.getElementsByTagName("ServiceQuality").item(0))) {
								reviews.setServiceQuality(
										reviewsElement.getElementsByTagName("ServiceQuality").item(0).getTextContent());
							}

							hotelReviews.add(reviews);

						}
					}

					hotelDetails.setReviews(hotelReviews);
					HotelDataService.HOTELDATA.put(hotelCode, hotelDetails);
					hotelData.put(hotelCode, hotelDetails);
				} catch (Exception e) {
					System.err.println("Exception for hotelCode ==>> "+hotelCode);
					e.printStackTrace();
					logger.info("hotelCode ==>> "+hotelCode+" Exception in autoFileUpload -- "+Util.errorToString(e));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Exception in autoFileUpload -- "+Util.errorToString(e));
		}
		
		return hotelData;
	}
	
/*	public Map<String, HotelDetails> readMasterData(File file) {

		Map<String, HotelDetails> hotelData = new ConcurrentHashMap<>();
		try {
			//File file = new File("D://test//hotel_dump_short.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelDescriptiveInfoRS.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			OTAHotelDescriptiveInfoRS otaHotelDescriptiveInfoRS = (OTAHotelDescriptiveInfoRS) jaxbUnmarshaller.unmarshal(file);
			
			if(Objects.nonNull(otaHotelDescriptiveInfoRS) && Objects.nonNull(otaHotelDescriptiveInfoRS.getHotelDescriptiveContents()) && CollectionUtils.isNotEmpty(otaHotelDescriptiveInfoRS.getHotelDescriptiveContents().getHotelDescriptiveContent())) {
				
				otaHotelDescriptiveInfoRS.getHotelDescriptiveContents().getHotelDescriptiveContent().parallelStream().forEach(c -> {
					
				HotelDetails hotelDetails = new HotelDetails();
				hotelDetails.setCheckInTime(Util.convertXmlGregorianToString(c.getPolicies().getPolicy().getPolicyInfo().getCheckInTime()));
				hotelDetails.setCheckOutTime(Util.convertXmlGregorianToString(c.getPolicies().getPolicy().getPolicyInfo().getCheckOutTime()));
				hotelDetails.setDescriptiveText(c.getHotelInfo().getDescriptions().getDescriptiveText());
				hotelDetails.setHotelName(c.getHotelName());
				hotelDetails.setLatitude(c.getHotelInfo().getPosition().getLatitude().toString());
				hotelDetails.setLongitude(c.getHotelInfo().getPosition().getLongitude().toString());
				hotelDetails.setReviewCount(c.getTPAExtensions().getReviewCount());
				hotelDetails.setReviewRating(c.getTPAExtensions().getReviewRating());
				
//				List<Reviews> hotelReviews = new CopyOnWriteArrayList<>();
//				c.getTPAExtensions().getHotelReviews().getContent().parallelStream().forEach(r -> {
//					
//					Reviews reviews = new Reviews();
//					System.err.println(r.getClass().getDeclaredFields()[0].getName());
//					reviews.setAvgGuestRating(r.getAvgGuestRating());
//					reviews.setCleanliness(String.valueOf(r.getCleanliness()));
//					reviews.setComments(r.getComments());
//					reviews.setDiningQuality(String.valueOf(r.getDiningQuality()));
//					reviews.setOverallRating(String.valueOf(r.getOverallRating()));
//					reviews.setPostDate(r.getPostDate());
//					reviews.setRoomQuality(String.valueOf(r.getRoomQuality()));
//					reviews.setServiceQuality(String.valueOf(r.getServiceQuality()));
//					hotelReviews.add(reviews);
//				});
//				hotelDetails.setReviews(hotelReviews);
				hotelData.put(String.valueOf(c.getHotelCode()), hotelDetails);
				});
				
			}
			
//			for (Map.Entry<String, HotelDetails> entry : hotelData.entrySet()) {
//				System.out.println("Key - " + entry.getKey());
//				System.out.println("Value - " + entry.getValue());
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return hotelData;
	}*/
}
