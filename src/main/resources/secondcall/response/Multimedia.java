
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Multimedia {

    @SerializedName("ImageUrl")
    @Expose
    public String imageUrl;
    @SerializedName("ThumbnailUrl")
    @Expose
    public String thumbnailUrl;
    @SerializedName("ImageJSON")
    @Expose
    public ImageJSON imageJSON;

}
