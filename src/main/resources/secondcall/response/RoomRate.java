
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomRate {

    @SerializedName("RoomID")
    @Expose
    public String roomID;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;
    @SerializedName("Rates")
    @Expose
    public Rates rates;
    @SerializedName("Total")
    @Expose
    public Total total;
    @SerializedName("GuestCounts")
    @Expose
    public GuestCounts guestCounts;

}
