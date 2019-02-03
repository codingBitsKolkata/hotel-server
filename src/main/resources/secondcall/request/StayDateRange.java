
package secondcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StayDateRange {

    @JsonProperty("End")
    
    public String end;
    @JsonProperty("Start")
    
    public String start;

}
