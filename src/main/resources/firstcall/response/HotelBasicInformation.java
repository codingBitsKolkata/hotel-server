
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class HotelBasicInformation {

    @JsonProperty("HotelType")
    
    public String hotelType;
    @JsonProperty("Rank")
    
    public String rank;
    @JsonProperty("featured")
    
    public String featured;
    @JsonProperty("propertyType")
    
    public String propertyType;
    @JsonProperty("srpPriority")
    
    public String srpPriority;
    @JsonProperty("yatraSmart")
    
    public String yatraSmart;
    @JsonProperty("Reviews")
    
    public Object reviews;

}
