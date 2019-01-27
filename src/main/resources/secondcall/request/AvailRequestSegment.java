
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailRequestSegment {

    @SerializedName("HotelSearchCriteria")
    @Expose
    public HotelSearchCriteria hotelSearchCriteria;

}
