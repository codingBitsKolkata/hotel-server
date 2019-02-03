
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Rate_ {

    @JsonProperty("BaseAdultOccupancy")
    
    public String baseAdultOccupancy;
    @JsonProperty("BaseChildOccupancy")
    
    public String baseChildOccupancy;
    @JsonProperty("Bookable")
    
    public String bookable;
    @JsonProperty("RatePlanCode")
    
    public String ratePlanCode;
    @JsonProperty("RoomTypeCode")
    
    public String roomTypeCode;

}
