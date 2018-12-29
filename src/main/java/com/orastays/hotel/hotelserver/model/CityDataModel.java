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
public class CityDataModel extends CommonModel {

	@JsonProperty("cdId")
	private Long cdId;

	@JsonProperty("CityName")
	private String CityName;

}
