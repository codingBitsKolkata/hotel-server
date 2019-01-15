package com.orastays.hotel.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class Rate {
	@JsonProperty("BaseChildOccupancy")
	private String BaseChildOccupancy;

	@JsonProperty("RatePlanCode")
	private String RatePlanCode;

	@JsonProperty("Bookable")
	private String Bookable;

	@JsonProperty("BaseAdultOccupancy")
	private String BaseAdultOccupancy;

	@JsonProperty("RoomTypeCode")
	private String RoomTypeCode;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [BaseChildOccupancy = "+BaseChildOccupancy+", RatePlanCode
	// = "+RatePlanCode+", Bookable = "+Bookable+", BaseAdultOccupancy =
	// "+BaseAdultOccupancy+", RoomTypeCode = "+RoomTypeCode+"]";
	// }
}
