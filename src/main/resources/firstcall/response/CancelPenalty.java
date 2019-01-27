
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalty {

    @SerializedName("NonRefundable")
    @Expose
    public String nonRefundable;
    @SerializedName("Deadline")
    @Expose
    public Object deadline;
    @SerializedName("PenaltyDescription")
    @Expose
    public PenaltyDescription penaltyDescription;

}
