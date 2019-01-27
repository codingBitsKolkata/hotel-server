
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlans {

    @SerializedName("RatePlan")
    @Expose
    private Object ratePlan;

	public Object getRatePlan() {
		return ratePlan;
	}

	public void setRatePlan(Object ratePlan) {
		this.ratePlan = ratePlan;
	};

    

}
