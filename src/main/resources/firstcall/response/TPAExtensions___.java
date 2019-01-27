
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions___ {

    @SerializedName("LowestRatePlanId")
    @Expose
    public String lowestRatePlanId;
    @SerializedName("PahSCRestriction")
    @Expose
    public String pahSCRestriction;
    @SerializedName("StopSell")
    @Expose
    public String stopSell;
    @SerializedName("HotelBasicInformation")
    @Expose
    public HotelBasicInformation hotelBasicInformation;
    @SerializedName("DeepLinkInformation")
    @Expose
    public DeepLinkInformation deepLinkInformation;

}
