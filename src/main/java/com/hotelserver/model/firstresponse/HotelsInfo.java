package com.hotelserver.model.firstresponse;

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
public class HotelsInfo {
	@JsonProperty("total")
	private String total;
	@JsonProperty("available")
	private String available;
	@JsonProperty("maxPrice")
	private String maxPrice;
	@JsonProperty("deals")
	private String deals;
	@JsonProperty("cacheable")
	private String cacheable;
	@JsonProperty("minPrice")
	private String minPrice;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [total = "+total+", available = "+available+", maxPrice =
	// "+maxPrice+", deals = "+deals+", cacheable = "+cacheable+", minPrice =
	// "+minPrice+"]";
	// }
}