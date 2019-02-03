
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Criterion {

    @JsonProperty("Address")
    
    public Address address;
    @JsonProperty("HotelRef")
    
    public Object hotelRef;
    @JsonProperty("StayDateRange")
    
    public StayDateRange stayDateRange;
    @JsonProperty("RoomStayCandidates")
    
    public RoomStayCandidates roomStayCandidates;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions tPAExtensions;

}
