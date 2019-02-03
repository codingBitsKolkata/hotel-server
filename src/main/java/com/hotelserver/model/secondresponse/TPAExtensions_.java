
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions_ {

    @SerializedName("LowestRatePlanId")
    @Expose
    public String lowestRatePlanId;
    @SerializedName("DeepLinkInformation")
    @Expose
    public DeepLinkInformation deepLinkInformation;
    @SerializedName("StopSell")
    @Expose
    public Boolean stopSell;
    @SerializedName("PahSCRestriction")
    @Expose
    public Boolean pahSCRestriction;
    @SerializedName("HotelBasicInformation")
    @Expose
    public HotelBasicInformation hotelBasicInformation;

}
