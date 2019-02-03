
package secondcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OTAHotelAvailRQ {

    @JsonProperty("RequestedCurrency")
    
    public String requestedCurrency;
    @JsonProperty("CorrelationID")
    
    public String correlationID;
    @JsonProperty("SearchCacheLevel")
    
    public String searchCacheLevel;
    @JsonProperty("AvailRequestSegments")
    
    public AvailRequestSegments availRequestSegments;

}
