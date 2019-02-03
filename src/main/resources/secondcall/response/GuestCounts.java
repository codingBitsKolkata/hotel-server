
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GuestCounts {

    @JsonProperty("GuestCount")
    
    public List<GuestCount> guestCount = null;

}
