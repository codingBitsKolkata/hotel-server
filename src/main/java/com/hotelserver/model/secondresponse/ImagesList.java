
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagesList {

    @SerializedName("LargeImageObj")
    @Expose
    public LargeImageObj largeImageObj;
    @SerializedName("ThumbnailImageObj")
    @Expose
    public ThumbnailImageObj thumbnailImageObj;

}
