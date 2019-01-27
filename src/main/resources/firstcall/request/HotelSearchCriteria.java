
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelSearchCriteria {

    @SerializedName("Criterion")
    @Expose
    public Criterion criterion;

}
