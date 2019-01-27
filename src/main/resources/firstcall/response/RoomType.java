
package firstcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType {

    @SerializedName("NonSmoking")
    @Expose
    public String nonSmoking;
    @SerializedName("RoomType")
    @Expose
    public String roomType;
    @SerializedName("RoomTypeCode")
    @Expose
    public String roomTypeCode;
    @SerializedName("RoomDescription")
    @Expose
    public RoomDescription roomDescription;
    @SerializedName("AdditionalDetails")
    @Expose
    public Object additionalDetails;
    @SerializedName("Occupancy")
    @Expose
    public List<Occupancy> occupancy = null;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions tPAExtensions;

}
