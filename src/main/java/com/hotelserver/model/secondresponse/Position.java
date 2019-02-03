
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("Latitude")
    @Expose
    public Double latitude;
    @SerializedName("Longitude")
    @Expose
    public Double longitude;

}
