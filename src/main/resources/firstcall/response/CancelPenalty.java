
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelPenalty {

    @JsonProperty("NonRefundable")
    
    public String nonRefundable;
    @JsonProperty("Deadline")
    
    public Object deadline;
    @JsonProperty("PenaltyDescription")
    
    public PenaltyDescription penaltyDescription;

}
