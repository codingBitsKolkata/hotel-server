package com.hotelserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.hotelserver.model.booking.OTAHotelResRQ;
import com.hotelserver.model.booking.OTAHotelResRS;

public class BookingClient extends WebServiceGatewaySupport {
	
	@Value("${yatra.booking.url}")
	private String yatraBookingURL;
	
	public OTAHotelResRS bookingCall(OTAHotelResRQ otaHotelResRQ) {
		
		OTAHotelResRS otaHotelResRS = (OTAHotelResRS) getWebServiceTemplate().marshalSendAndReceive(yatraBookingURL, otaHotelResRQ, new SoapActionCallback(yatraBookingURL));

		return otaHotelResRS;
	}

}
