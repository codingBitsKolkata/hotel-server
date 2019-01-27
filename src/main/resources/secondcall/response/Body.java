
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("OTA_HotelAvailRS")
    @Expose
    public OTAHotelAvailRS oTAHotelAvailRS;

}
