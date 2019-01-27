
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCount {

    @SerializedName("AgeQualifyingCode")
    @Expose
    public String ageQualifyingCode;
    @SerializedName("Age")
    @Expose
    public String age;
    @SerializedName("Count")
    @Expose
    public String count;

}
