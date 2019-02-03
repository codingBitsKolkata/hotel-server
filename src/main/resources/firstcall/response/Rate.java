
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Rate {

    @JsonProperty("EffectiveDate")
    
    public String effectiveDate;
    @JsonProperty("Base")
    
    public Base base;
    @JsonProperty("TPA_Extensions")
    
    public TPAExtensions__ tPAExtensions;

}
