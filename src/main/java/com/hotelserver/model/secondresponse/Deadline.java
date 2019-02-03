
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deadline {

    @SerializedName("OffsetDropTime")
    @Expose
    public String offsetDropTime;
    @SerializedName("OffsetTimeUnit")
    @Expose
    public String offsetTimeUnit;
    @SerializedName("OffsetUnitMultiplier")
    @Expose
    public Integer offsetUnitMultiplier;

}
