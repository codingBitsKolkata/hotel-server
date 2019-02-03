
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Base {

    @JsonProperty("AmountBeforeTax")
    
    public String amountBeforeTax;
    @JsonProperty("Taxes")
    
    public Taxes taxes;

}
