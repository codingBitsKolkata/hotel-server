
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("AddressLine")
    @Expose
    public String addressLine;
    @SerializedName("CityName")
    @Expose
    public String cityName;
    @SerializedName("PostalCode")
    @Expose
    public String postalCode;
    @SerializedName("StateProv")
    @Expose
    public StateProv stateProv;
    @SerializedName("CountryName")
    @Expose
    public String countryName;

}
