
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions__ {

    @SerializedName("AdditionalGuests")
    @Expose
    private AdditionalGuests additionalGuests;
    @SerializedName("BestRatePlan")
    @Expose
    private Boolean bestRatePlan;
    @SerializedName("DiscountCouponDisplayIndicator")
    @Expose
    private DiscountCouponDisplayIndicator discountCouponDisplayIndicator;

    public AdditionalGuests getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(AdditionalGuests additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

    public Boolean getBestRatePlan() {
        return bestRatePlan;
    }

    public void setBestRatePlan(Boolean bestRatePlan) {
        this.bestRatePlan = bestRatePlan;
    }

    public DiscountCouponDisplayIndicator getDiscountCouponDisplayIndicator() {
        return discountCouponDisplayIndicator;
    }

    public void setDiscountCouponDisplayIndicator(DiscountCouponDisplayIndicator discountCouponDisplayIndicator) {
        this.discountCouponDisplayIndicator = discountCouponDisplayIndicator;
    }

}
