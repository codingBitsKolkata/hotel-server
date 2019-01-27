
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

    @SerializedName("AdditionalGuestAmounts")
    @Expose
    private AdditionalGuestAmounts additionalGuestAmounts;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions___ tPAExtensions;
    @SerializedName("Base")
    @Expose
    private Base base;
    @SerializedName("EffectiveDate")
    @Expose
    private String effectiveDate;

    public AdditionalGuestAmounts getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    public void setAdditionalGuestAmounts(AdditionalGuestAmounts additionalGuestAmounts) {
        this.additionalGuestAmounts = additionalGuestAmounts;
    }

    public TPAExtensions___ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions___ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

}
