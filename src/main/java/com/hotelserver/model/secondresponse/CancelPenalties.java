
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelPenalties {

    @SerializedName("CancelPenalty")
    @Expose
    public List<CancelPenalty> cancelPenalty = null;

}
