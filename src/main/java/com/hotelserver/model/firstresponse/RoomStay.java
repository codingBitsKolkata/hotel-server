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
public class RoomStay
{

	@JsonProperty("RoomRates")
	private RoomRates RoomRates;

	@JsonProperty("RoomTypes")
    private RoomTypes RoomTypes;

	@JsonProperty("BasicPropertyInfo")
    private BasicPropertyInfo BasicPropertyInfo;

	@JsonProperty("RatePlans")
    private RatePlans RatePlans;

	@JsonProperty("TPA_Extensions")
    private TPA_Extensions TPA_Extensions;


//    @Override
//    public String toString()
//    {
//        return "ClassPojo [RoomRates = "+RoomRates+", RoomTypes = "+RoomTypes+", BasicPropertyInfo = "+BasicPropertyInfo+", RatePlans = "+RatePlans+", TPA_Extensions = "+TPA_Extensions+"]";
//    }
}
