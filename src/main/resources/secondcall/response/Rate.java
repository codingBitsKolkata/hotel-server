
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

    @SerializedName("EffectiveDate")
    @Expose
    public String effectiveDate;
    @SerializedName("Base")
    @Expose
    public Base base;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions__ tPAExtensions;

}
