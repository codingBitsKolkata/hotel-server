
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlanInclusionDesciption {

    @SerializedName("Text")
    @Expose
    public List<String> text = null;

}
