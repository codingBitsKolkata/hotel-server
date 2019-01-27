
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OTAHotelAvailRS {

    @SerializedName("CorrelationID")
    @Expose
    public String correlationID;
    @SerializedName("PrimaryLangID")
    @Expose
    public String primaryLangID;
    @SerializedName("AltLangID")
    @Expose
    public String altLangID;
    @SerializedName("Success")
    @Expose
    public Object success;
    @SerializedName("RoomStays")
    @Expose
    public RoomStays roomStays;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions____ tPAExtensions;

}
