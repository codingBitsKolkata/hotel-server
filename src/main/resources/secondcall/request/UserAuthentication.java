
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAuthentication {

    @SerializedName("password")
    @Expose
    public String password;
    @SerializedName("propertyId")
    @Expose
    public String propertyId;
    @SerializedName("username")
    @Expose
    public String username;

}
