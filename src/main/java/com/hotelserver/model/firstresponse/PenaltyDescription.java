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

public class PenaltyDescription {

	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Text")
	private String Text;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [Name = "+Name+", Text = "+Text+"]";
	// }
}