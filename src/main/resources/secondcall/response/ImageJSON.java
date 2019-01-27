
package secondcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageJSON {

    @SerializedName("ImagesList")
    @Expose
    public List<ImagesList> imagesList = null;

}
