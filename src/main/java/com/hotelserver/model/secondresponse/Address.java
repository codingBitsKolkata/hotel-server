
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("CountryName")
    @Expose
    public String countryName;
    @SerializedName("AddressLine")
    @Expose
    public String addressLine;
    @SerializedName("StateProv")
    @Expose
    public StateProv stateProv;
    @SerializedName("PostalCode")
    @Expose
    public Integer postalCode;
    @SerializedName("CityName")
    @Expose
    public String cityName;

}
