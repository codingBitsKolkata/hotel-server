
package firstcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomDescription {

    @JsonProperty("Text")
    
    public Object text;
    @JsonProperty("Image")
    
    public List<Object> image = null;

}
