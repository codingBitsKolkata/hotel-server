
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomRate {

    @JsonProperty("RoomID")
    
    public String roomID;
    @JsonProperty("RatePlanCode")
    
    public String ratePlanCode;
    @JsonProperty("Rates")
    
    public Rates rates;
    @JsonProperty("Total")
    
    public Total total;
    @JsonProperty("GuestCounts")
    
    public GuestCounts guestCounts;

}
