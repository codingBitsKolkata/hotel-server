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
public class RoomType
{

	@JsonProperty("minChildAge")
	private String minChildAge;

	@JsonProperty("maxAdult")
    private String maxAdult;

	@JsonProperty("propertyLevel")
    private String propertyLevel;

	@JsonProperty("maxGuest")
    private String maxGuest;

	@JsonProperty("maxChildAge")
    private String maxChildAge;

	@JsonProperty("smoking")
    private String smoking;

	@JsonProperty("maxChild")
    private String maxChild;


//    @Override
//    public String toString()
//    {
//        return "ClassPojo [minChildAge = "+minChildAge+", maxAdult = "+maxAdult+", propertyLevel = "+propertyLevel+", maxGuest = "+maxGuest+", maxChildAge = "+maxChildAge+", smoking = "+smoking+", maxChild = "+maxChild+"]";
//    }
}

