
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("checkinRestriction")
    @Expose
    public String checkinRestriction;
    @SerializedName("checkoutRestriction")
    @Expose
    public String checkoutRestriction;
    @SerializedName("RoomType")
    @Expose
    public RoomType_ roomType;

}
