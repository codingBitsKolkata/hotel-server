
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomRate {

    @SerializedName("Rates")
    @Expose
    private Rates rates;
    @SerializedName("GuestCounts")
    @Expose
    private GuestCounts guestCounts;
    @SerializedName("Total")
    @Expose
    private Total total;
    @SerializedName("RoomID")
    @Expose
    private String roomID;
    @SerializedName("RatePlanCode")
    @Expose
    private String ratePlanCode;

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public GuestCounts getGuestCounts() {
        return guestCounts;
    }

    public void setGuestCounts(GuestCounts guestCounts) {
        this.guestCounts = guestCounts;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

}
