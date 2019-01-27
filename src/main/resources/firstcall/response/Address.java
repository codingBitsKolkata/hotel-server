
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("CityName")
    @Expose
    public String cityName;
    @SerializedName("StateProv")
    @Expose
    public StateProv stateProv;
    @SerializedName("CountryName")
    @Expose
    public String countryName;

}
