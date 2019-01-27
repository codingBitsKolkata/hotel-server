
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInformation {

    @SerializedName("Reviews")
    @Expose
    public Object reviews;

}
