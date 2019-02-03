
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PenaltyDescription {

    @JsonProperty("Name")
    
    public String name;
    @JsonProperty("Text")
    
    public String text;

}
