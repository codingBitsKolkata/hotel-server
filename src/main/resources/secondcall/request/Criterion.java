
package secondcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Criterion {

    @JsonProperty("HotelRef")
    
    public HotelRef hotelRef;
    @JsonProperty("StayDateRange")
    
    public StayDateRange stayDateRange;
    @JsonProperty("RoomStayCandidates")
    
    public RoomStayCandidates roomStayCandidates;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions tPAExtensions;

}
