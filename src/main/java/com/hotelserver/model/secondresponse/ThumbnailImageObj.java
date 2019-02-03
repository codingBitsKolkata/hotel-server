
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThumbnailImageObj {

    @SerializedName("subCategory")
    @Expose
    public String subCategory;
    @SerializedName("sizeName")
    @Expose
    public String sizeName;
    @SerializedName("width")
    @Expose
    public String width;
    @SerializedName("caption")
    @Expose
    public String caption;
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("height")
    @Expose
    public String height;

}
