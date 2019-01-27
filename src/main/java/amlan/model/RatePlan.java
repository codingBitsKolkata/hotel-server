
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlan {

    @SerializedName("RatePlanType")
    @Expose
    private Integer ratePlanType;
    @SerializedName("RatePlanInclusions")
    @Expose
    private RatePlanInclusions ratePlanInclusions;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions__ tPAExtensions;
    @SerializedName("RatePlanDescription")
    @Expose
    private RatePlanDescription ratePlanDescription;
    @SerializedName("RatePlanName")
    @Expose
    private String ratePlanName;
    @SerializedName("Guarantee")
    @Expose
    private Guarantee guarantee;
    @SerializedName("CancelPenalties")
    @Expose
    private CancelPenalties cancelPenalties;
    @SerializedName("AvailableQuantity")
    @Expose
    private Integer availableQuantity;
    @SerializedName("RatePlanCode")
    @Expose
    private String ratePlanCode;

    public Integer getRatePlanType() {
        return ratePlanType;
    }

    public void setRatePlanType(Integer ratePlanType) {
        this.ratePlanType = ratePlanType;
    }

    public RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    public void setRatePlanInclusions(RatePlanInclusions ratePlanInclusions) {
        this.ratePlanInclusions = ratePlanInclusions;
    }

    public TPAExtensions__ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions__ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public RatePlanDescription getRatePlanDescription() {
        return ratePlanDescription;
    }

    public void setRatePlanDescription(RatePlanDescription ratePlanDescription) {
        this.ratePlanDescription = ratePlanDescription;
    }

    public String getRatePlanName() {
        return ratePlanName;
    }

    public void setRatePlanName(String ratePlanName) {
        this.ratePlanName = ratePlanName;
    }

    public Guarantee getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    public CancelPenalties getCancelPenalties() {
        return cancelPenalties;
    }

    public void setCancelPenalties(CancelPenalties cancelPenalties) {
        this.cancelPenalties = cancelPenalties;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

}
