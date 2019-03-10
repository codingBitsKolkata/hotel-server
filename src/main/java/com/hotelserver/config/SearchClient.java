package com.hotelserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.hotelserver.model.OTAHotelAvailRQ;
import com.hotelserver.model.OTAHotelAvailRS;

public class SearchClient extends WebServiceGatewaySupport {
	
	@Value("${yatra.url}")
	private String yatraURL;
	
	public OTAHotelAvailRS firstCall(OTAHotelAvailRQ otaHotelAvailRQ) {
		
		OTAHotelAvailRS otaHotelAvailRS = (OTAHotelAvailRS) getWebServiceTemplate().marshalSendAndReceive(yatraURL, otaHotelAvailRQ, new SoapActionCallback(yatraURL));

		return otaHotelAvailRS;
	}

}
