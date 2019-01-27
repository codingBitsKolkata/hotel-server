
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstCallResponse {

    @SerializedName("Body")
    @Expose
    public Body body;

}
