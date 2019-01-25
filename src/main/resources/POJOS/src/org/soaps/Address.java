
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("StateProv")
    @Expose
    private StateProv stateProv;
    @SerializedName("CityName")
    @Expose
    private String cityName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public StateProv getStateProv() {
        return stateProv;
    }

    public void setStateProv(StateProv stateProv) {
        this.stateProv = stateProv;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
