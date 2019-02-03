
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Position {

    @JsonProperty("Latitude")
    
    public String latitude;
    @JsonProperty("Longitude")
    
    public String longitude;

}
