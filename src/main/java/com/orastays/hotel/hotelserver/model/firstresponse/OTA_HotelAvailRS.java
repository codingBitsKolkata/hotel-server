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
public class OTA_HotelAvailRS
{
	@JsonProperty("CorrelationID")
	private String CorrelationID;
	@JsonProperty("RoomStays")
    private RoomStays RoomStays;
	@JsonProperty("xmlns")
    private String xmlns;
	@JsonProperty("AltLangID")
    private String AltLangID;
	@JsonProperty("Success")
    private String Success;
	@JsonProperty("PrimaryLangID")
    private String PrimaryLangID;
	@JsonProperty("TPA_Extensions")
    private TPA_Extensions TPA_Extensions;


//    @Override
//    public String toString()
//    {
//        return "ClassPojo [CorrelationID = "+CorrelationID+", RoomStays = "+RoomStays+", xmlns = "+xmlns+", AltLangID = "+AltLangID+", Success = "+Success+", PrimaryLangID = "+PrimaryLangID+", TPA_Extensions = "+TPA_Extensions+"]";
//    }
}

