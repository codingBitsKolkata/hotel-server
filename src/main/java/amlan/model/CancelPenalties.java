
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalties {

    @SerializedName("CancelPenalty")
    @Expose
    private CancelPenalty cancelPenalty;

    public CancelPenalty getCancelPenalty() {
        return cancelPenalty;
    }

    public void setCancelPenalty(CancelPenalty cancelPenalty) {
        this.cancelPenalty = cancelPenalty;
    }

}
