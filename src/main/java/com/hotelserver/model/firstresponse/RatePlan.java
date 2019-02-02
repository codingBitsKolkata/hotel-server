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
public class RatePlan {

	@JsonProperty("RatePlanName")
	private String RatePlanName;

	@JsonProperty("RatePlanType")
	private String RatePlanType;

	@JsonProperty("Guarantee")
	private Guarantee Guarantee;

	@JsonProperty("CancelPenalties")
	private CancelPenalties CancelPenalties;

	@JsonProperty("RatePlanCode")
	private String RatePlanCode;

	@JsonProperty("AvailableQuantity")
	private String AvailableQuantity;

	@JsonProperty("RatePlanDescription")
	private RatePlanDescription RatePlanDescription;

	@JsonProperty("RatePlanInclusions")
	private RatePlanInclusions RatePlanInclusions;

	@JsonProperty("TPA_Extensions")
	private TPA_Extensions TPA_Extensions;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [RatePlanName = "+RatePlanName+", RatePlanType =
	// "+RatePlanType+", Guarantee = "+Guarantee+", CancelPenalties =
	// "+CancelPenalties+", RatePlanCode = "+RatePlanCode+", AvailableQuantity =
	// "+AvailableQuantity+", RatePlanDescription = "+RatePlanDescription+",
	// RatePlanInclusions = "+RatePlanInclusions+", TPA_Extensions =
	// "+TPA_Extensions+"]";
	// }
}
