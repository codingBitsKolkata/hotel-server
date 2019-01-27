
package secondcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondCallResponse {

    @SerializedName("Body")
    @Expose
    public Body body;

}
