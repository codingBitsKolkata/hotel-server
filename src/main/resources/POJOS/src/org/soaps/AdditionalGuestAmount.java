
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdditionalGuestAmount {

    @SerializedName("Amount")
    @Expose
    private Amount amount;
    @SerializedName("RPH")
    @Expose
    private Integer rPH;
    @SerializedName("AgeQualifyingCode")
    @Expose
    private Integer ageQualifyingCode;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Integer getRPH() {
        return rPH;
    }

    public void setRPH(Integer rPH) {
        this.rPH = rPH;
    }

    public Integer getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(Integer ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

}
