
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomRates {

    @JsonProperty("RoomRate")
    
    public List<RoomRate> roomRate = null;

}
