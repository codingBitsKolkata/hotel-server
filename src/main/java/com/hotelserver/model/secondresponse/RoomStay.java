
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
