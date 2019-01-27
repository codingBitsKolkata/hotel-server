
package firstcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OTAHotelAvailRQ {

    @SerializedName("RequestedCurrency")
    @Expose
    public String requestedCurrency;
    @SerializedName("SortOrder")
    @Expose
    public String sortOrder;
    @SerializedName("Version")
    @Expose
    public String version;
    @SerializedName("PrimaryLangID")
    @Expose
    public String primaryLangID;
    @SerializedName("SearchCacheLevel")
    @Expose
    public String searchCacheLevel;
    @SerializedName("AvailRequestSegments")
    @Expose
    public AvailRequestSegments availRequestSegments;

}
