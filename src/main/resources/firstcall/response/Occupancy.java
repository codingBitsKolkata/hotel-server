
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Occupancy {

    @SerializedName("MaxOccupancy")
    @Expose
    public String maxOccupancy;
    @SerializedName("AgeQualifyingCode")
    @Expose
    public String ageQualifyingCode;
    @SerializedName("MaxAge")
    @Expose
    public String maxAge;
    @SerializedName("MinAge")
    @Expose
    public String minAge;

}
