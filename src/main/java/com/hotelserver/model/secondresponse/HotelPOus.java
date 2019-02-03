
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelPOus {

    @SerializedName("POIDistance")
    @Expose
    public String pOIDistance;
    @SerializedName("POIName")
    @Expose
    public String pOIName;

}
