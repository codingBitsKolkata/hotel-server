
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicPropertyInfo {

    @SerializedName("CurrencyCode")
    @Expose
    public String currencyCode;
    @SerializedName("HotelCode")
    @Expose
    public String hotelCode;
    @SerializedName("Address")
    @Expose
    public Address address;

}
