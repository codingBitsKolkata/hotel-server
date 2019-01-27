
package secondcall.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OTAHotelAvailRQ {

    @SerializedName("RequestedCurrency")
    @Expose
    public String requestedCurrency;
    @SerializedName("CorrelationID")
    @Expose
    public String correlationID;
    @SerializedName("SearchCacheLevel")
    @Expose
    public String searchCacheLevel;
    @SerializedName("AvailRequestSegments")
    @Expose
    public AvailRequestSegments availRequestSegments;

}
