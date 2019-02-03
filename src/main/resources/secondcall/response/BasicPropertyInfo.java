
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BasicPropertyInfo {

    @JsonProperty("CurrencyCode")
    
    public String currencyCode;
    @JsonProperty("HotelCode")
    
    public String hotelCode;
    @JsonProperty("HotelName")
    
    public String hotelName;
    @JsonProperty("Position")
    
    public Position position;
    @JsonProperty("Address")
    
    public Address address;
    @JsonProperty("Award")
    
    public Award award;

}
