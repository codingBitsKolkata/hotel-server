
package secondcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlans {

    @SerializedName("RatePlan")
    @Expose
    public List<RatePlan> ratePlan = null;

}
