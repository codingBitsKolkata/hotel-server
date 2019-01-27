
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateProv {

    @SerializedName("StateCode")
    @Expose
    public String stateCode;
    @SerializedName("#text")
    @Expose
    public String text;

}
