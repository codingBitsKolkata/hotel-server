
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoapBody {

    @SerializedName("OTA_HotelAvailRS")
    @Expose
    public OTAHotelAvailRS oTAHotelAvailRS;

}
