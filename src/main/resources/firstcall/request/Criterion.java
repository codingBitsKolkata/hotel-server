
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Criterion {

    @SerializedName("Address")
    @Expose
    public Address address;
    @SerializedName("HotelRef")
    @Expose
    public Object hotelRef;
    @SerializedName("StayDateRange")
    @Expose
    public StayDateRange stayDateRange;
    @SerializedName("RoomStayCandidates")
    @Expose
    public RoomStayCandidates roomStayCandidates;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions tPAExtensions;

}
