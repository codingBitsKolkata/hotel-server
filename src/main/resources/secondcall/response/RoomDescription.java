
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomDescription {

    @JsonProperty("Text")
    
    public String text;
    @JsonProperty("Image")
    
    public List<String> image = null;

}
