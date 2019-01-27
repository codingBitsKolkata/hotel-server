
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StayDateRange {

    @SerializedName("End")
    @Expose
    public String end;
    @SerializedName("Start")
    @Expose
    public String start;

}
