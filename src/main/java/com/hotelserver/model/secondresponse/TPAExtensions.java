
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("RoomType")
    @Expose
    public RoomType_ roomType;
    @SerializedName("checkoutRestriction")
    @Expose
    public Boolean checkoutRestriction;
    @SerializedName("checkinRestriction")
    @Expose
    public Boolean checkinRestriction;

}
