package com.hotelserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class HotelPriceModel {

	public Double price;
	public Double commission;
	public Double percentage;
	public String ratePlanCode;
}
