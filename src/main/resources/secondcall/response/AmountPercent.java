
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmountPercent {

    @SerializedName("NmbrOfNights")
    @Expose
    public String nmbrOfNights;
    @SerializedName("TaxInclusive")
    @Expose
    public String taxInclusive;
    @SerializedName("Amount")
    @Expose
    public String amount;

}
