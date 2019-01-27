
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropertyAmenity {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("description")
    @Expose
    public String description;

}
