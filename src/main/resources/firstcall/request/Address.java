
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("CityName")
    @Expose
    public String cityName;
    @SerializedName("CountryName")
    @Expose
    public CountryName countryName;

}
