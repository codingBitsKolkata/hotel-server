
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelPenalty {

    @JsonProperty("NonRefundable")
    
    public String nonRefundable;
    @JsonProperty("Deadline")
    
    public Deadline deadline;
    @JsonProperty("PenaltyDescription")
    
    public List<PenaltyDescription> penaltyDescription = null;
    @JsonProperty("AmountPercent")
    
    public AmountPercent amountPercent;

}
