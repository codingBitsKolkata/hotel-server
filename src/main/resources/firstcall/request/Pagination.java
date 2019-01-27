
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("enabled")
    @Expose
    public String enabled;
    @SerializedName("hotelsFrom")
    @Expose
    public String hotelsFrom;
    @SerializedName("hotelsTo")
    @Expose
    public String hotelsTo;

}
