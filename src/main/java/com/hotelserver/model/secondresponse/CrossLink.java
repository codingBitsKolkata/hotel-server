
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CrossLink {

    @SerializedName("PropertyName")
    @Expose
    public String propertyName;
    @SerializedName("URL")
    @Expose
    public String uRL;

}
