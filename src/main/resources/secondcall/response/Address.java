
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Address {

    @JsonProperty("AddressLine")
    
    public String addressLine;
    @JsonProperty("CityName")
    
    public String cityName;
    @JsonProperty("PostalCode")
    
    public String postalCode;
    @JsonProperty("StateProv")
    
    public StateProv stateProv;
    @JsonProperty("CountryName")
    
    public String countryName;

}
