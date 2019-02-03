
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType_ {

    @SerializedName("maxAdult")
    @Expose
    public Integer maxAdult;
    @SerializedName("propertyLevel")
    @Expose
    public String propertyLevel;
    @SerializedName("maxGuest")
    @Expose
    public Integer maxGuest;
    @SerializedName("smoking")
    @Expose
    public String smoking;
    @SerializedName("maxChild")
    @Expose
    public Integer maxChild;
    @SerializedName("maxChildAge")
    @Expose
    public Integer maxChildAge;
    @SerializedName("minChildAge")
    @Expose
    public Integer minChildAge;

}
