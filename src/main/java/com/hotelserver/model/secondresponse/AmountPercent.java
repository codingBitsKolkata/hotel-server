
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmountPercent {

    @SerializedName("NmbrOfNights")
    @Expose
    public Integer nmbrOfNights;
    @SerializedName("Amount")
    @Expose
    public Integer amount;
    @SerializedName("TaxInclusive")
    @Expose
    public Boolean taxInclusive;

}
