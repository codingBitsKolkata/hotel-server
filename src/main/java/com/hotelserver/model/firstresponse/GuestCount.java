package com.hotelserver.model.firstresponse;

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
public class GuestCount {
	@JsonProperty("Count")
	private String Count;

	@JsonProperty("AgeQualifyingCode")
	private String AgeQualifyingCode;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [Count = "+Count+", AgeQualifyingCode =
	// "+AgeQualifyingCode+"]";
	// }
}
