
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalty {

    @SerializedName("PenaltyDescription")
    @Expose
    public List<PenaltyDescription> penaltyDescription = null;
    @SerializedName("Deadline")
    //@Expose
    public Deadline deadline;
    @SerializedName("NonRefundable")
    @Expose
    public Boolean nonRefundable;
    @SerializedName("AmountPercent")
    @Expose
    public AmountPercent amountPercent;

}
