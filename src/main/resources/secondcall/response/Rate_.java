
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate_ {

    @SerializedName("BaseAdultOccupancy")
    @Expose
    public String baseAdultOccupancy;
    @SerializedName("BaseChildOccupancy")
    @Expose
    public String baseChildOccupancy;
    @SerializedName("Bookable")
    @Expose
    public String bookable;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;
    @SerializedName("RoomTypeCode")
    @Expose
    public String roomTypeCode;

}
