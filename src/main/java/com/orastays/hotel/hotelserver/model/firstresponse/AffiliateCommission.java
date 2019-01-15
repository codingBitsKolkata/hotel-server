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

public class AffiliateCommission
{
	@JsonProperty("Amount")
	private String Amount;

	@JsonProperty("Percent")
	private String Percent;

	@JsonProperty("HotelTaxIncluded")
	private String HotelTaxIncluded;


   /* @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+", Percent = "+Percent+", HotelTaxIncluded = "+HotelTaxIncluded+"]";
    }*/
}
