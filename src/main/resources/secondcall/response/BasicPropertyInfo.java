
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicPropertyInfo {

    @SerializedName("CurrencyCode")
    @Expose
    public String currencyCode;
    @SerializedName("HotelCode")
    @Expose
    public String hotelCode;
    @SerializedName("HotelName")
    @Expose
    public String hotelName;
    @SerializedName("Position")
    @Expose
    public Position position;
    @SerializedName("Address")
    @Expose
    public Address address;
    @SerializedName("Award")
    @Expose
    public Award award;

}
