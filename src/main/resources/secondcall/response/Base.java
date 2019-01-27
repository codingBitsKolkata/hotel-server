
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Base {

    @SerializedName("AmountBeforeTax")
    @Expose
    public String amountBeforeTax;
    @SerializedName("Taxes")
    @Expose
    public Taxes taxes;

}
