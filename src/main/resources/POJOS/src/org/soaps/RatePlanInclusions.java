
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlanInclusions {

    @SerializedName("RatePlanInclusionDesciption")
    @Expose
    private RatePlanInclusionDesciption ratePlanInclusionDesciption;

    public RatePlanInclusionDesciption getRatePlanInclusionDesciption() {
        return ratePlanInclusionDesciption;
    }

    public void setRatePlanInclusionDesciption(RatePlanInclusionDesciption ratePlanInclusionDesciption) {
        this.ratePlanInclusionDesciption = ratePlanInclusionDesciption;
    }

}
