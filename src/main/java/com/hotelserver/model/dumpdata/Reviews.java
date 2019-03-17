package com.hotelserver.model.dumpdata;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class Reviews {

	private String avgGuestRating;
	private String overallRating;
	private String comments;
	private String roomQuality;
	private String serviceQuality;
	private String diningQuality;
	private String cleanliness;
	private String postDate;
}
