
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType_ {

    @SerializedName("maxAdult")
    @Expose
    public String maxAdult;
    @SerializedName("maxChild")
    @Expose
    public String maxChild;
    @SerializedName("maxChildAge")
    @Expose
    public String maxChildAge;
    @SerializedName("maxGuest")
    @Expose
    public String maxGuest;
    @SerializedName("minChildAge")
    @Expose
    public String minChildAge;
    @SerializedName("propertyLevel")
    @Expose
    public String propertyLevel;
    @SerializedName("smoking")
    @Expose
    public String smoking;

}
