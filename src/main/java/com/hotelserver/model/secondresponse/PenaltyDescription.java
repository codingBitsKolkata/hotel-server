
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PenaltyDescription {

    @SerializedName("Text")
    @Expose
    public String text;
    @SerializedName("Name")
    @Expose
    public String name;

}
