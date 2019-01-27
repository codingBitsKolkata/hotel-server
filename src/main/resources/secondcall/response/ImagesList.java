
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagesList {

    @SerializedName("ThumbnailImageObj")
    @Expose
    public ThumbnailImageObj thumbnailImageObj;
    @SerializedName("LargeImageObj")
    @Expose
    public LargeImageObj largeImageObj;

}
