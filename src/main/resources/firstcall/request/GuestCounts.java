
package firstcall.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCounts {

    @SerializedName("GuestCount")
    @Expose
    public List<GuestCount> guestCount = null;

}
