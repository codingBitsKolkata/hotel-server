
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Pagination {

    @JsonProperty("enabled")
    
    public String enabled;
    @JsonProperty("hotelsFrom")
    
    public String hotelsFrom;
    @JsonProperty("hotelsTo")
    
    public String hotelsTo;

}
