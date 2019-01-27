
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCounts {

    @SerializedName("GuestCount")
    @Expose
    public GuestCount guestCount;

}
