
package firstcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlanDescription {

    @SerializedName("Text")
    @Expose
    public List<Object> text = null;

}
