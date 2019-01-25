
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amount {

    @SerializedName("AmountBeforeTax")
    @Expose
    private Integer amountBeforeTax;

    public Integer getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(Integer amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

}
