
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomDescription {

    @SerializedName("Text")
    @Expose
    public String text;
    @SerializedName("Image")
    @Expose
    public List<String> image = null;

}
