
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AmountPercent {

    @JsonProperty("NmbrOfNights")
    
    public String nmbrOfNights;
    @JsonProperty("TaxInclusive")
    
    public String taxInclusive;
    @JsonProperty("Amount")
    
    public String amount;

}
