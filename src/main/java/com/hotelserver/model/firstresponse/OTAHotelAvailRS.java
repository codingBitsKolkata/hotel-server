
package com.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class OTAHotelAvailRS {

    @SerializedName("xmlns")
    @Expose
    public String xmlns;
    @SerializedName("RoomStays")
    @Expose
    public RoomStays roomStays;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions____ tPAExtensions;
    @SerializedName("CorrelationID")
    @Expose
    public String correlationID;
    @SerializedName("PrimaryLangID")
    @Expose
    public String primaryLangID;
    @SerializedName("AltLangID")
    @Expose
    public String altLangID;
    @SerializedName("Success")
    @Expose
    public String success;

}
