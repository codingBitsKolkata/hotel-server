
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions_ {

    @SerializedName("LowestRatePlanId")
    @Expose
    private String lowestRatePlanId;
    @SerializedName("DeepLinkInformation")
    @Expose
    private DeepLinkInformation deepLinkInformation;
    @SerializedName("StopSell")
    @Expose
    private Boolean stopSell;
    @SerializedName("PahSCRestriction")
    @Expose
    private Boolean pahSCRestriction;
    @SerializedName("HotelBasicInformation")
    @Expose
    private HotelBasicInformation hotelBasicInformation;

    public String getLowestRatePlanId() {
        return lowestRatePlanId;
    }

    public void setLowestRatePlanId(String lowestRatePlanId) {
        this.lowestRatePlanId = lowestRatePlanId;
    }

    public DeepLinkInformation getDeepLinkInformation() {
        return deepLinkInformation;
    }

    public void setDeepLinkInformation(DeepLinkInformation deepLinkInformation) {
        this.deepLinkInformation = deepLinkInformation;
    }

    public Boolean getStopSell() {
        return stopSell;
    }

    public void setStopSell(Boolean stopSell) {
        this.stopSell = stopSell;
    }

    public Boolean getPahSCRestriction() {
        return pahSCRestriction;
    }

    public void setPahSCRestriction(Boolean pahSCRestriction) {
        this.pahSCRestriction = pahSCRestriction;
    }

    public HotelBasicInformation getHotelBasicInformation() {
        return hotelBasicInformation;
    }

    public void setHotelBasicInformation(HotelBasicInformation hotelBasicInformation) {
        this.hotelBasicInformation = hotelBasicInformation;
    }

}
