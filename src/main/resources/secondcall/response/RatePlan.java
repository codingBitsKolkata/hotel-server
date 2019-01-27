
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlan {

    @SerializedName("AvailableQuantity")
    @Expose
    public String availableQuantity;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;
    @SerializedName("RatePlanName")
    @Expose
    public String ratePlanName;
    @SerializedName("RatePlanType")
    @Expose
    public String ratePlanType;
    @SerializedName("Guarantee")
    @Expose
    public Guarantee guarantee;
    @SerializedName("CancelPenalties")
    @Expose
    public CancelPenalties cancelPenalties;
    @SerializedName("RatePlanDescription")
    @Expose
    public RatePlanDescription ratePlanDescription;
    @SerializedName("RatePlanInclusions")
    @Expose
    public RatePlanInclusions ratePlanInclusions;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions_ tPAExtensions;

}
