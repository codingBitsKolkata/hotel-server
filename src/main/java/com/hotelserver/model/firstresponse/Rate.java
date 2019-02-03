
package com.hotelserver.model.firstresponse;

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
public class Rate {

    @SerializedName("AdditionalGuestAmounts")
    @Expose
    public AdditionalGuestAmounts additionalGuestAmounts;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions___ tPAExtensions;
    @SerializedName("Base")
    @Expose
    public Base base;
    @SerializedName("EffectiveDate")
    @Expose
    public String effectiveDate;

}
