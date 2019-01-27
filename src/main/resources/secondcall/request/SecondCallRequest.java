
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondCallRequest {

    @SerializedName("Body")
    @Expose
    public Body body;

}
