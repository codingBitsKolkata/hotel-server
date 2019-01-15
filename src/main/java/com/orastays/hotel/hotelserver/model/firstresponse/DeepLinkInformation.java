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

public class DeepLinkInformation {
	@JsonProperty("overviewURL")
	private String overviewURL;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [overviewURL = "+overviewURL+"]";
	// }
}
