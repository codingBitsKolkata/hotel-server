
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AffiliateCommission {

    @SerializedName("Percent")
    @Expose
    public Integer percent;
    @SerializedName("Amount")
    @Expose
    public Integer amount;
    @SerializedName("HotelTaxIncluded")
    @Expose
    public Boolean hotelTaxIncluded;

}
