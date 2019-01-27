
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType_ {

    @SerializedName("maxAdult")
    @Expose
    private Integer maxAdult;
    @SerializedName("propertyLevel")
    @Expose
    private String propertyLevel;
    @SerializedName("maxGuest")
    @Expose
    private Integer maxGuest;
    @SerializedName("smoking")
    @Expose
    private String smoking;
    @SerializedName("maxChild")
    @Expose
    private Integer maxChild;
    @SerializedName("maxChildAge")
    @Expose
    private Integer maxChildAge;
    @SerializedName("minChildAge")
    @Expose
    private Integer minChildAge;

    public Integer getMaxAdult() {
        return maxAdult;
    }

    public void setMaxAdult(Integer maxAdult) {
        this.maxAdult = maxAdult;
    }

    public String getPropertyLevel() {
        return propertyLevel;
    }

    public void setPropertyLevel(String propertyLevel) {
        this.propertyLevel = propertyLevel;
    }

    public Integer getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(Integer maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public Integer getMaxChild() {
        return maxChild;
    }

    public void setMaxChild(Integer maxChild) {
        this.maxChild = maxChild;
    }

    public Integer getMaxChildAge() {
        return maxChildAge;
    }

    public void setMaxChildAge(Integer maxChildAge) {
        this.maxChildAge = maxChildAge;
    }

    public Integer getMinChildAge() {
        return minChildAge;
    }

    public void setMinChildAge(Integer minChildAge) {
        this.minChildAge = minChildAge;
    }

}
