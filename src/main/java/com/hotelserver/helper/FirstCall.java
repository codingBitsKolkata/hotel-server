package com.hotelserver.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.hotelserver.model.firstresponse.FirstResponse;
import com.hotelserver.model.propertylist.FilterCiteriaModel;

@Component
public class FirstCall {

	private static final Logger logger = LogManager.getLogger(FirstCall.class);
	
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
	
	public FirstResponse firstCall(FilterCiteriaModel filterCiteriaModel) {
		
		if (logger.isInfoEnabled()) {
			logger.info("firstCall -- START");
		}
		
		FirstResponse firstResponse = null;
		String response = "";
		String requestURL = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
							+ "<soap:Body>"
								+ "<OTA_HotelAvailRQ xmlns=\"http://www.opentravel.org/OTA/2003/05\" RequestedCurrency=\"INR\" SortOrder=\"TG_RANKING\" Version=\"0.0\" PrimaryLangID=\"en\" SearchCacheLevel=\"VeryRecent\">"
									+ "<AvailRequestSegments>"
									+ "<AvailRequestSegment>"
									+ "<HotelSearchCriteria>"
										+ "<Criterion>"
											+ "<Address>"
												+ "<CityName>"+filterCiteriaModel.getCityName()+"</CityName>"
												+ "<CountryName Code=\""+filterCiteriaModel.getCountryName()+"\"></CountryName>"
											+ "</Address><HotelRef/>"
											+ "<StayDateRange End=\""+filterCiteriaModel.getCheckOutDate()+"\" Start=\""+filterCiteriaModel.getCheckInDate()+"\"/>"
											+ "<RoomStayCandidates>"
												+ "<RoomStayCandidate>"
												+ "<GuestCounts>"
												+ "<GuestCount AgeQualifyingCode=\"10\" Count=\""+filterCiteriaModel.getNoOfAdult()+"\" />"
												+ "<GuestCount Age=\"10\" AgeQualifyingCode=\"8\" Count=\""+filterCiteriaModel.getNoOfChild()+"\" />"
												+ "</GuestCounts>"
												+ "</RoomStayCandidate>"
											+ "</RoomStayCandidates>"
											+ "<TPA_Extensions>"
												+ "<Pagination enabled=\"false\" hotelsFrom=\"01\" hotelsTo=\"05\"/>"
												+ "<HotelBasicInformation>"
												+ "<Reviews />" 
												+ "</HotelBasicInformation>"
												+ "<UserAuthentication password=\""+yatraPassword+"\" propertyId=\""+yatraPropertyId+"\" username=\""+yatraUsername+"\"/>"
											+ "</TPA_Extensions>"
										+ "</Criterion>" 
									+ "</HotelSearchCriteria>"
									+ "</AvailRequestSegment>" 
									+ "</AvailRequestSegments>"
								+ "</OTA_HotelAvailRQ>" 
						+ "</soap:Body>" 
						+ "</soap:Envelope>";

		BufferedReader reader = null;
		String body = requestURL;
		System.out.println("requestURL ==>> "+requestURL);
		try {
			URL url = new URL(yatraURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDefaultUseCaches(false);
			conn.setRequestProperty("Accept", "text/xml");
			conn.setRequestProperty("SOAPAction", yatraSoapAction);

			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(body);
			wr.flush();

			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder builder = new StringBuilder();
			String line = null;

			while ((line = reader.readLine()) != null) {
				builder.append(line);
				response = builder.toString();
			}
			
			System.out.println("response ==>> "+response);
			String json = Util.xmlToJSON(response);
			json = json.replace(",\"Reviews\":\"\",", ",");
			System.out.println("json ==>> "+json);
			firstResponse = Util.jsonToObject(json, FirstResponse.class);
			System.out.println("firstResponse ==>> "+firstResponse);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("firstCall -- END");
		}
		
		return firstResponse;
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
}
