
package firstcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Address {

    @JsonProperty("CityName")
    
    public String cityName;
    @JsonProperty("StateProv")
    
    public StateProv stateProv;
    @JsonProperty("CountryName")
    
    public String countryName;

}
