
package com.hotelserver.model.firstresponseold;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class RatePlan {

    @SerializedName("RatePlanType")
    @Expose
    public Integer ratePlanType;
    @SerializedName("RatePlanInclusions")
    @Expose
    public RatePlanInclusions ratePlanInclusions;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions tPAExtensions;
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
