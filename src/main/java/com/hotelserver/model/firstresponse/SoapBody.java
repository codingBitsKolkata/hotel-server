package com.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class SoapBody {
	

	@JsonProperty("OTA_HotelAvailRS")
	private OTA_HotelAvailRS OTA_HotelAvailRS;


//	@Override
//	public String toString() {
//		return "ClassPojo [OTA_HotelAvailRS = " + OTA_HotelAvailRS + "]";
//	}
}
