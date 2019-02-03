
package com.hotelserver.model.firstresponseold;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStays {

    @SerializedName("RoomStay")
    @Expose
    public List<RoomStay> roomStay;

}
