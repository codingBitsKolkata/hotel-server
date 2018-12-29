package com.orastays.hotel.hotelserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class HotelPolicyDataModel extends CommonModel {

	@JsonProperty("hpdId")
	private Long hpdId;

	@JsonProperty("policy")
	private String policy;

}
