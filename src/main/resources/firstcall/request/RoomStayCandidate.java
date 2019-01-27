
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStayCandidate {

    @SerializedName("GuestCounts")
    @Expose
    public GuestCounts guestCounts;

}
