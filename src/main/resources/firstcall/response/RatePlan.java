
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RatePlan {

    @JsonProperty("AvailableQuantity")
    
    public String availableQuantity;
    @JsonProperty("RatePlanCode")
    
    public String ratePlanCode;
    @JsonProperty("RatePlanName")
    
    public String ratePlanName;
    @JsonProperty("RatePlanType")
    
    public String ratePlanType;
    @JsonProperty("Guarantee")
    
    public Guarantee guarantee;
    @JsonProperty("CancelPenalties")
    
    public CancelPenalties cancelPenalties;
    @JsonProperty("RatePlanDescription")
    
    public RatePlanDescription ratePlanDescription;
    @JsonProperty("RatePlanInclusions")
    
    public RatePlanInclusions ratePlanInclusions;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions_ tPAExtensions;

}
