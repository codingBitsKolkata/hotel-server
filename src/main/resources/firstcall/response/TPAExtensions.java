
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TPAExtensions {

    @JsonProperty("checkinRestriction")
    
    public String checkinRestriction;
    @JsonProperty("checkoutRestriction")
    
    public String checkoutRestriction;
    @JsonProperty("RoomType")
    
    public RoomType_ roomType;

}
