package com.hotelserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class AreaDataModel extends CommonModel {

	@JsonProperty("adId")
	private Long adId;

	@JsonProperty("AreaId")
	private String AreaId;

	@JsonProperty("AreaName")
	private String AreaName;

	@JsonProperty("CityName")
	private String CityName;

}
