
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomRate {

    @SerializedName("Rates")
    @Expose
    public Rates rates;
    @SerializedName("GuestCounts")
    @Expose
    public GuestCounts guestCounts;
    @SerializedName("Total")
    @Expose
    public Total total;
    @SerializedName("RoomID")
    @Expose
    public String roomID;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;

}
