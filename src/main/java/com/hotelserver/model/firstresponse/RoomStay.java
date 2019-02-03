
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
public class RoomStay {

    @SerializedName("BasicPropertyInfo")
    @Expose
    public BasicPropertyInfo basicPropertyInfo;
    @SerializedName("RoomTypes")
    @Expose
    public RoomTypes roomTypes;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions_ tPAExtensions;
    @SerializedName("RatePlans")
    @Expose
    public RatePlans ratePlans;
    @SerializedName("RoomRates")
    @Expose
    public RoomRates roomRates;

}
