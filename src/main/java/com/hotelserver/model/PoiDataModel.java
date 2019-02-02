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
public class PoiDataModel extends CommonModel {

	@JsonProperty("poidId")
	private Long poidId;

	@JsonProperty("PoiId")
	private String PoiId;

	@JsonProperty("PoiSeoId")
	private String PoiSeoId;

	@JsonProperty("PoiName")
	private String PoiName;

	@JsonProperty("Latitude")
	private String Latitude;

	@JsonProperty("Longitude")
	private String Longitude;

	@JsonProperty("CityId")
	private String CityId;

	@JsonProperty("CityName")
	private String CityName;

	@JsonProperty("SeoCityName")
	private String SeoCityName;

}
