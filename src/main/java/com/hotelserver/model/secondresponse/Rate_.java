
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate_ {

    @SerializedName("BaseChildOccupancy")
    @Expose
    public Integer baseChildOccupancy;
    @SerializedName("BaseAdultOccupancy")
    @Expose
    public Integer baseAdultOccupancy;
    @SerializedName("RoomTypeCode")
    @Expose
    public String roomTypeCode;
    @SerializedName("Bookable")
    @Expose
    public Boolean bookable;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;

}
