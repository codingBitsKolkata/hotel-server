
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Base {

    @SerializedName("AmountBeforeTax")
    @Expose
    public Integer amountBeforeTax;
    @SerializedName("Taxes")
    @Expose
    public Taxes taxes;

}
