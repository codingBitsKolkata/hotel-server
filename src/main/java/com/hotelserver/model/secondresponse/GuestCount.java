
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCount {

    @SerializedName("Count")
    @Expose
    public Integer count;
    @SerializedName("AgeQualifyingCode")
    @Expose
    public Integer ageQualifyingCode;

}
