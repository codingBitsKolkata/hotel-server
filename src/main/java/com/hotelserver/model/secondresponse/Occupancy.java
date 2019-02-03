
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Occupancy {

    @SerializedName("MaxOccupancy")
    @Expose
    public Integer maxOccupancy;
    @SerializedName("AgeQualifyingCode")
    @Expose
    public Integer ageQualifyingCode;
    @SerializedName("MinAge")
    @Expose
    public Integer minAge;
    @SerializedName("MaxAge")
    @Expose
    public Integer maxAge;

}
