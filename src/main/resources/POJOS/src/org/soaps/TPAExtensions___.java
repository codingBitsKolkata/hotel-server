
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions___ {

    @SerializedName("Rate")
    @Expose
    private Rate_ rate;
    @SerializedName("AffiliateCommission")
    @Expose
    private AffiliateCommission affiliateCommission;

    public Rate_ getRate() {
        return rate;
    }

    public void setRate(Rate_ rate) {
        this.rate = rate;
    }

    public AffiliateCommission getAffiliateCommission() {
        return affiliateCommission;
    }

    public void setAffiliateCommission(AffiliateCommission affiliateCommission) {
        this.affiliateCommission = affiliateCommission;
    }

}
