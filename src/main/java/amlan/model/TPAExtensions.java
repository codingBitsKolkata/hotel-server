
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("RoomType")
    @Expose
    private RoomType_ roomType;
    @SerializedName("checkoutRestriction")
    @Expose
    private Boolean checkoutRestriction;
    @SerializedName("checkinRestriction")
    @Expose
    private Boolean checkinRestriction;

    public RoomType_ getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType_ roomType) {
        this.roomType = roomType;
    }

    public Boolean getCheckoutRestriction() {
        return checkoutRestriction;
    }

    public void setCheckoutRestriction(Boolean checkoutRestriction) {
        this.checkoutRestriction = checkoutRestriction;
    }

    public Boolean getCheckinRestriction() {
        return checkinRestriction;
    }

    public void setCheckinRestriction(Boolean checkinRestriction) {
        this.checkinRestriction = checkinRestriction;
    }

}
