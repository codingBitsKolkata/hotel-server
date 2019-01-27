
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdditionalGuests {

    @SerializedName("AdditionalGuest")
    @Expose
    private AdditionalGuest additionalGuest;

    public AdditionalGuest getAdditionalGuest() {
        return additionalGuest;
    }

    public void setAdditionalGuest(AdditionalGuest additionalGuest) {
        this.additionalGuest = additionalGuest;
    }

}
