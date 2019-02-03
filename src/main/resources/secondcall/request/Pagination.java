
package secondcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Pagination {

    @JsonProperty("hotelsFrom")
    
    public String hotelsFrom;
    @JsonProperty("hotelsTo")
    
    public String hotelsTo;

}
