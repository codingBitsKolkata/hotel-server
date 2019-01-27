
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("OTA_HotelAvailRQ")
    @Expose
    public OTAHotelAvailRQ oTAHotelAvailRQ;

}
