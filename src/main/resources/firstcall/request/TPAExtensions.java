
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("Pagination")
    @Expose
    public Pagination pagination;
    @SerializedName("HotelBasicInformation")
    @Expose
    public HotelBasicInformation hotelBasicInformation;
    @SerializedName("UserAuthentication")
    @Expose
    public UserAuthentication userAuthentication;

}
