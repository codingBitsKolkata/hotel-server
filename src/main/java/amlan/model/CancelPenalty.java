
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalty {

    @SerializedName("PenaltyDescription")
    @Expose
    private PenaltyDescription penaltyDescription;
    @SerializedName("Deadline")
    @Expose
    private String deadline;
    @SerializedName("NonRefundable")
    @Expose
    private Boolean nonRefundable;

    public PenaltyDescription getPenaltyDescription() {
        return penaltyDescription;
    }

    public void setPenaltyDescription(PenaltyDescription penaltyDescription) {
        this.penaltyDescription = penaltyDescription;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Boolean getNonRefundable() {
        return nonRefundable;
    }

    public void setNonRefundable(Boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }

}
