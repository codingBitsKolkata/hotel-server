package com.hotelserver.helper;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.hotelserver.model.dumpdata.HotelDetails;
import com.hotelserver.model.dumpdata.Reviews;

@Component
public class ReadHotelDumpData {

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
				
				HotelDetails hotelDetails = new HotelDetails();
				NodeList node = (NodeList) hotelDescriptiveContentNodeList;
				Element element = (Element) node.item(i);
				hotelDetails.setHotelName(element.getAttribute("HotelDetailsName"));

				NodeList hotelDetailsInfoNode = element.getElementsByTagName("HotelDetailsInfo");
				Element hotelDetailsInfoElement = (Element) hotelDetailsInfoNode.item(0);
				NodeList descriptionsNode = hotelDetailsInfoElement.getElementsByTagName("Descriptions");
				Element descriptionsElement = (Element) descriptionsNode.item(0);
				hotelDetails.setDescriptiveText(
						descriptionsElement.getElementsByTagName("DescriptiveText").item(0).getTextContent());

				NodeList positionNode = hotelDetailsInfoElement.getElementsByTagName("Position");
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

				NodeList tPA_ExtensionsNode = element.getElementsByTagName("TPA_Extensions");
				Element tPA_ExtensionsElement = (Element) tPA_ExtensionsNode.item(0);
				hotelDetails.setReviewCount(tPA_ExtensionsElement.getElementsByTagName("ReviewCount").item(0).getTextContent());
				hotelDetails.setReviewRating(tPA_ExtensionsElement.getElementsByTagName("ReviewRating").item(0).getTextContent());

				NodeList hotelDetailsReviewsNode = tPA_ExtensionsElement.getElementsByTagName("HotelDetailsReviews");
				Element hotelDetailsReviewsElement = (Element) hotelDetailsReviewsNode.item(0);
				NodeList hotelDetailsReviewNode = hotelDetailsReviewsElement.getElementsByTagName("HotelDetailsReview");

				List<Reviews> hotelReviews = new CopyOnWriteArrayList<>();
				for (int j = 0; j < hotelDetailsReviewNode.getLength(); j++) {
					
					Node node2 = hotelDetailsReviewNode.item(j);
					if (node2.getNodeType() == Node.ELEMENT_NODE) {
						Element reviewsElement = (Element) node2;

						Reviews reviews = new Reviews();
						reviews.setAvgGuestRating(
								reviewsElement.getElementsByTagName("AvgGuestRating").item(0).getTextContent());
						reviews
								.setComments(reviewsElement.getElementsByTagName("Comments").item(0).getTextContent());
						reviews
								.setPostDate(reviewsElement.getElementsByTagName("PostDate").item(0).getTextContent());
						reviews.setCleanliness(
								reviewsElement.getElementsByTagName("Cleanliness").item(0).getTextContent());
						reviews.setDiningQuality(
								reviewsElement.getElementsByTagName("DiningQuality").item(0).getTextContent());
						reviews.setOverallRating(
								reviewsElement.getElementsByTagName("OverallRating").item(0).getTextContent());
						reviews.setRoomQuality(
								reviewsElement.getElementsByTagName("RoomQuality").item(0).getTextContent());
						reviews.setServiceQuality(
								reviewsElement.getElementsByTagName("ServiceQuality").item(0).getTextContent());

						hotelReviews.add(reviews);

					}
				}

				hotelDetails.setReviews(hotelReviews);
				hotelData.put(element.getAttribute("HotelDetailsCode"), hotelDetails);

			}
		} catch (Exception e) {
			e.printStackTrace();
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