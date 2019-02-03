
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class HotelsInfo {

    @JsonProperty("available")
    
    public String available;
    @JsonProperty("cacheable")
    
    public String cacheable;
    @JsonProperty("deals")
    
    public String deals;
    @JsonProperty("maxPrice")
    
    public String maxPrice;
    @JsonProperty("minPrice")
    
    public String minPrice;
    @JsonProperty("total")
    
    public String total;

}
