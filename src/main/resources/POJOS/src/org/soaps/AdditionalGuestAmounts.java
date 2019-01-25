
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdditionalGuestAmounts {

    @SerializedName("AdditionalGuestAmount")
    @Expose
    private AdditionalGuestAmount additionalGuestAmount;

    public AdditionalGuestAmount getAdditionalGuestAmount() {
        return additionalGuestAmount;
    }

    public void setAdditionalGuestAmount(AdditionalGuestAmount additionalGuestAmount) {
        this.additionalGuestAmount = additionalGuestAmount;
    }

}
