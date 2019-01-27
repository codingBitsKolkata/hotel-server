
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guarantee {

    @SerializedName("GuaranteeType")
    @Expose
    public String guaranteeType;

}
