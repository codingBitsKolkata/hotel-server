
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStay {

    @SerializedName("RoomTypes")
    @Expose
    public RoomTypes roomTypes;
    @SerializedName("RatePlans")
    @Expose
    public RatePlans ratePlans;
    @SerializedName("RoomRates")
    @Expose
    public RoomRates roomRates;
    @SerializedName("BasicPropertyInfo")
    @Expose
    public BasicPropertyInfo basicPropertyInfo;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions___ tPAExtensions;

}
