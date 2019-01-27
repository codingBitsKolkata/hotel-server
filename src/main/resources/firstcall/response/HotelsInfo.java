
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelsInfo {

    @SerializedName("available")
    @Expose
    public String available;
    @SerializedName("cacheable")
    @Expose
    public String cacheable;
    @SerializedName("deals")
    @Expose
    public String deals;
    @SerializedName("maxPrice")
    @Expose
    public String maxPrice;
    @SerializedName("minPrice")
    @Expose
    public String minPrice;
    @SerializedName("total")
    @Expose
    public String total;

}
