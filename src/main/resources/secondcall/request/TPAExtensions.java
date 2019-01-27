
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("SeoEnabled")
    @Expose
    public String seoEnabled;
    @SerializedName("Pagination")
    @Expose
    public Pagination pagination;
    @SerializedName("UserAuthentication")
    @Expose
    public UserAuthentication userAuthentication;

}
