
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Taxes {

    @SerializedName("Amount")
    @Expose
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
