
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInformation {

    @SerializedName("HotelType")
    @Expose
    public String hotelType;
    @SerializedName("Rank")
    @Expose
    public String rank;
    @SerializedName("featured")
    @Expose
    public String featured;
    @SerializedName("propertyType")
    @Expose
    public String propertyType;
    @SerializedName("srpPriority")
    @Expose
    public String srpPriority;
    @SerializedName("yatraSmart")
    @Expose
    public String yatraSmart;
    @SerializedName("Reviews")
    @Expose
    public Object reviews;

}
