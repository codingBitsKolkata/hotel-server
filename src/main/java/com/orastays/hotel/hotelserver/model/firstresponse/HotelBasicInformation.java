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
public class HotelBasicInformation {
	@JsonProperty("propertyType")
	private String propertyType;
	@JsonProperty("Rank")
	private String Rank;
	@JsonProperty("srpPriority")
	private String srpPriority;
	@JsonProperty("Reviews")
	private String Reviews;
	@JsonProperty("HotelType")
	private String HotelType;
	@JsonProperty("yatraSmart")
	private String yatraSmart;
	@JsonProperty("featured")
	private String featured;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [propertyType = "+propertyType+", Rank = "+Rank+",
	// srpPriority = "+srpPriority+", Reviews = "+Reviews+", HotelType =
	// "+HotelType+", yatraSmart = "+yatraSmart+", featured = "+featured+"]";
	// }
}
