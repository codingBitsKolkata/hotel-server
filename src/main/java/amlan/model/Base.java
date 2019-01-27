
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Base {

    @SerializedName("AmountBeforeTax")
    @Expose
    private Integer amountBeforeTax;
    @SerializedName("Taxes")
    @Expose
    private Taxes taxes;

    public Integer getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(Integer amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

}
