
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstCallRequest {

    @SerializedName("Body")
    @Expose
    public Body body;

}
