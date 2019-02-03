
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class POI {

    @SerializedName("HotelPOI")
    @Expose
    public List<HotelPOus> hotelPOI = null;

}
