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

public class CancelPenalty {
	@JsonProperty("PenaltyDescription")
	private PenaltyDescription PenaltyDescription;

	@JsonProperty("NonRefundable")
	private String NonRefundable;

	@JsonProperty("Deadline")
	private String Deadline;

	// @Override
	// public String toString()
	// {
	// return "ClassPojo [PenaltyDescription = "+PenaltyDescription+", NonRefundable
	// = "+NonRefundable+", Deadline = "+Deadline+"]";
	// }
}
