
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AffiliateCommission {

    @SerializedName("Percent")
    @Expose
    private Integer percent;
    @SerializedName("Amount")
    @Expose
    private Integer amount;
    @SerializedName("HotelTaxIncluded")
    @Expose
    private Boolean hotelTaxIncluded;

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getHotelTaxIncluded() {
        return hotelTaxIncluded;
    }

    public void setHotelTaxIncluded(Boolean hotelTaxIncluded) {
        this.hotelTaxIncluded = hotelTaxIncluded;
    }

}
