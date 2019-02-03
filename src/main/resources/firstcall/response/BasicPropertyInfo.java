
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BasicPropertyInfo {

    @JsonProperty("CurrencyCode")
    
    public String currencyCode;
    @JsonProperty("HotelCode")
    
    public String hotelCode;
    @JsonProperty("Address")
    
    public Address address;

}
