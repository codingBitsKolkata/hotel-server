
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomAmenity {

    @SerializedName("code")
    @Expose
    public Integer code;
    @SerializedName("description")
    @Expose
    public String description;

}
