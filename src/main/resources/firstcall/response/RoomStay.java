
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomStay {

    @JsonProperty("RoomTypes")
    
    public RoomTypes roomTypes;
    @JsonProperty("RatePlans")
    
    public RatePlans ratePlans;
    @JsonProperty("RoomRates")
    
    public RoomRates roomRates;
    @JsonProperty("BasicPropertyInfo")
    
    public BasicPropertyInfo basicPropertyInfo;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions___ tPAExtensions;

}
