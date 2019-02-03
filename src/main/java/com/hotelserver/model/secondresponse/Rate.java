
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

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
