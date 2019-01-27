
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions_ {

    @SerializedName("DiscountCouponDisplayIndicator")
    @Expose
    public DiscountCouponDisplayIndicator discountCouponDisplayIndicator;
    @SerializedName("BestRatePlan")
    @Expose
    public String bestRatePlan;

}
