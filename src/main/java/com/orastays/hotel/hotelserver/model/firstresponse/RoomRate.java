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
public class RoomRate
{

	@JsonProperty("GuestCounts")
	private GuestCounts GuestCounts;

	@JsonProperty("RoomID")
    private String RoomID;

	@JsonProperty("Rates")
    private Rates Rates;

	@JsonProperty("RatePlanCode")
    private String RatePlanCode;

	@JsonProperty("Total")
    private Total Total;


//    @Override
//    public String toString()
//    {
//        return "ClassPojo [GuestCounts = "+GuestCounts+", RoomID = "+RoomID+", Rates = "+Rates+", RatePlanCode = "+RatePlanCode+", Total = "+Total+"]";
//    }
}
