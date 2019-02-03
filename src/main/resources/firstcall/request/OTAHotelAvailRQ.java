
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OTAHotelAvailRQ {

    @JsonProperty("RequestedCurrency")
    
    public String requestedCurrency;
    @JsonProperty("SortOrder")
    
    public String sortOrder;
    @JsonProperty("Version")
    
    public String version;
    @JsonProperty("PrimaryLangID")
    
    public String primaryLangID;
    @JsonProperty("SearchCacheLevel")
    
    public String searchCacheLevel;
    @JsonProperty("AvailRequestSegments")
    
    public AvailRequestSegments availRequestSegments;

}
