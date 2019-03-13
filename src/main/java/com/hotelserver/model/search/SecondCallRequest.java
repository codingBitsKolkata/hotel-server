package com.hotelserver.model.search;

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
public class SecondCallRequest {

	private String correlationID;
	private String hotelCode;
	private String checkInDate;
	private String checkOutDate;
	private String noOfAdult;
	private String noOfChild;
}
