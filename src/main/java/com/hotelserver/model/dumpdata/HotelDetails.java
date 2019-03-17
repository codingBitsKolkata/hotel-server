package com.hotelserver.model.dumpdata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hotelserver.model.dumpdata.Reviews;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class HotelDetails {

	private String hotelName;
	private String descriptiveText;
	private String longitude;
	private String latitude;
	private String checkOutTime;
	private String checkInTime;
	private String reviewCount;
	private String reviewRating;
	private List<Reviews> reviews;
}
