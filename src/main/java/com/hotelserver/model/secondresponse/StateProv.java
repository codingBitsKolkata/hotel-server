
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateProv {

    @SerializedName("StateCode")
    @Expose
    public Integer stateCode;
    @SerializedName("content")
    @Expose
    public String content;

}
