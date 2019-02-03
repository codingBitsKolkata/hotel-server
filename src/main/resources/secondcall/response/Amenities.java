
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Amenities {

    @JsonProperty("PropertyAmenities")
    
    public List<PropertyAmenity> propertyAmenities = null;
    @JsonProperty("RoomAmenities")
    
    public List<RoomAmenity> roomAmenities = null;

}
