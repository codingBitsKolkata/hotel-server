
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OTAHotelAvailRS {

    @JsonProperty("CorrelationID")
    
    public String correlationID;
    @JsonProperty("PrimaryLangID")
    
    public String primaryLangID;
    @JsonProperty("AltLangID")
    
    public String altLangID;
    @JsonProperty("Success")
    
    public Object success;
    @JsonProperty("RoomStays")
    
    public RoomStays roomStays;

}
