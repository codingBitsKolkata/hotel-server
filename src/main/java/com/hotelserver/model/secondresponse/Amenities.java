
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amenities {

    @SerializedName("PropertyAmenities")
    @Expose
    public List<PropertyAmenity> propertyAmenities = null;
    @SerializedName("RoomAmenities")
    @Expose
    public List<RoomAmenity> roomAmenities = null;

}
