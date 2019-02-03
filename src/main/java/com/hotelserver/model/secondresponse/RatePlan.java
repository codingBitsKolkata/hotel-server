
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlan {

    @SerializedName("RatePlanType")
    @Expose
    public Integer ratePlanType;
    @SerializedName("RatePlanInclusions")
    @Expose
    public RatePlanInclusions ratePlanInclusions;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions__ tPAExtensions;
    @SerializedName("RatePlanDescription")
    @Expose
    public RatePlanDescription ratePlanDescription;
    @SerializedName("RatePlanName")
    @Expose
    public String ratePlanName;
    @SerializedName("Guarantee")
    @Expose
    public Guarantee guarantee;
    @SerializedName("CancelPenalties")
    @Expose
    public CancelPenalties cancelPenalties;
    @SerializedName("AvailableQuantity")
    @Expose
    public Integer availableQuantity;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;

}
