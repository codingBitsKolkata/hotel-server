
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomRates {

    @SerializedName("RoomRate")
    @Expose
    public List<RoomRate> roomRate = null;

}
