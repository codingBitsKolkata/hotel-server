
package firstcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomType {

    @JsonProperty("NonSmoking")
    
    public String nonSmoking;
    @JsonProperty("RoomType")
    
    public String roomType;
    @JsonProperty("RoomTypeCode")
    
    public String roomTypeCode;
    @JsonProperty("RoomDescription")
    
    public RoomDescription roomDescription;
    @JsonProperty("AdditionalDetails")
    
    public Object additionalDetails;
    @JsonProperty("Occupancy")
    
    public List<Occupancy> occupancy = null;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions tPAExtensions;

}
