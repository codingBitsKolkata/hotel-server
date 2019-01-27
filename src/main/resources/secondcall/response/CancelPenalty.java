
package secondcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalty {

    @SerializedName("NonRefundable")
    @Expose
    public String nonRefundable;
    @SerializedName("Deadline")
    @Expose
    public Deadline deadline;
    @SerializedName("PenaltyDescription")
    @Expose
    public List<PenaltyDescription> penaltyDescription = null;
    @SerializedName("AmountPercent")
    @Expose
    public AmountPercent amountPercent;

}
