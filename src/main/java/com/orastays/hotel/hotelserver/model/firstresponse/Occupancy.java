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
public class Occupancy {
	@JsonProperty("MaxOccupancy")
	private String MaxOccupancy;
	@JsonProperty("AgeQualifyingCode")
	private String AgeQualifyingCode;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [MaxOccupancy = "+MaxOccupancy+", AgeQualifyingCode =
	// "+AgeQualifyingCode+"]";
	// }
}
