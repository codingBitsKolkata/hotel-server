
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Taxes {

    @SerializedName("Amount")
    @Expose
    public String amount;

}
