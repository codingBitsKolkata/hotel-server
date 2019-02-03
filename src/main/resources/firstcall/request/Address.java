
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Address {

    @JsonProperty("CityName")
    
    public String cityName;
    @JsonProperty("CountryName")
    
    public CountryName countryName;

}
