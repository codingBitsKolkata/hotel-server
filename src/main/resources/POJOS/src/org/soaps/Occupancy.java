
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Occupancy {

    @SerializedName("MaxOccupancy")
    @Expose
    private Integer maxOccupancy;
    @SerializedName("AgeQualifyingCode")
    @Expose
    private Integer ageQualifyingCode;
    @SerializedName("MinAge")
    @Expose
    private Integer minAge;
    @SerializedName("MaxAge")
    @Expose
    private Integer maxAge;

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Integer getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(Integer ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

}
