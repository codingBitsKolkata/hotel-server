
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicPropertyInfo {

    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("HotelCode")
    @Expose
    private String hotelCode;
    @SerializedName("Address")
    @Expose
    private Address address;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
