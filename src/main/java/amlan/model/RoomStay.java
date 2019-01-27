
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStay {

    @SerializedName("BasicPropertyInfo")
    @Expose
    private BasicPropertyInfo basicPropertyInfo;
    @SerializedName("RoomTypes")
    @Expose
    private RoomTypes roomTypes;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions_ tPAExtensions;
    @SerializedName("RatePlans")
    @Expose
    private RatePlans ratePlans;
    @SerializedName("RoomRates")
    @Expose
    private RoomRates roomRates;

    public BasicPropertyInfo getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    public void setBasicPropertyInfo(BasicPropertyInfo basicPropertyInfo) {
        this.basicPropertyInfo = basicPropertyInfo;
    }

    public RoomTypes getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(RoomTypes roomTypes) {
        this.roomTypes = roomTypes;
    }

    public TPAExtensions_ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions_ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public RatePlans getRatePlans() {
        return ratePlans;
    }

    public void setRatePlans(RatePlans ratePlans) {
        this.ratePlans = ratePlans;
    }

    public RoomRates getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(RoomRates roomRates) {
        this.roomRates = roomRates;
    }

}
