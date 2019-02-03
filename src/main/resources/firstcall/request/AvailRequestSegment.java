
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AvailRequestSegment {

    @JsonProperty("HotelSearchCriteria")
    
    public HotelSearchCriteria hotelSearchCriteria;

}
