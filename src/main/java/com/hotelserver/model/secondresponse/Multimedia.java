
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Multimedia {

    @SerializedName("ThumbnailUrl")
    @Expose
    public String thumbnailUrl;
    @SerializedName("ImageJSON")
    @Expose
    public ImageJSON imageJSON;
    @SerializedName("ImageUrl")
    @Expose
    public String imageUrl;

}
