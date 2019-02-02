package com.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
