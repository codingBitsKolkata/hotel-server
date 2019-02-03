
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AffiliateCommission {

    @JsonProperty("Amount")
    
    public String amount;
    @JsonProperty("HotelTaxIncluded")
    
    public String hotelTaxIncluded;
    @JsonProperty("Percent")
    
    public String percent;

}
