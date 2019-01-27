
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AffiliateCommission {

    @SerializedName("Amount")
    @Expose
    public String amount;
    @SerializedName("HotelTaxIncluded")
    @Expose
    public String hotelTaxIncluded;
    @SerializedName("Percent")
    @Expose
    public String percent;

}
