
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCount {

    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("AgeQualifyingCode")
    @Expose
    private Integer ageQualifyingCode;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(Integer ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

}
