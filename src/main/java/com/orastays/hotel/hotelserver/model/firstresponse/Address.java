package com.orastays.hotel.hotelserver.model.firstresponse;

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
public class Address
{
	@JsonProperty("CountryName")
	private String CountryName;

	@JsonProperty("StateProv")
	private StateProv StateProv;

	@JsonProperty("CityName")
	private String CityName;
    
    /*@Override
    public String toString()
    {
        return "ClassPojo [CountryName = "+CountryName+", StateProv = "+StateProv+", CityName = "+CityName+"]";
    }*/
}
