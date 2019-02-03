
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelPenalties {

    @JsonProperty("CancelPenalty")
    
    public List<CancelPenalty> cancelPenalty = null;

}
