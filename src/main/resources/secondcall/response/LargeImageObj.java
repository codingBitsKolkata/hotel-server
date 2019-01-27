
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LargeImageObj {

    @SerializedName("caption")
    @Expose
    public String caption;
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("height")
    @Expose
    public String height;
    @SerializedName("sizeName")
    @Expose
    public String sizeName;
    @SerializedName("subCategory")
    @Expose
    public String subCategory;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("width")
    @Expose
    public String width;

}
