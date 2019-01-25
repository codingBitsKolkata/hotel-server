
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate_ {

    @SerializedName("BaseChildOccupancy")
    @Expose
    private Integer baseChildOccupancy;
    @SerializedName("BaseAdultOccupancy")
    @Expose
    private Integer baseAdultOccupancy;
    @SerializedName("RoomTypeCode")
    @Expose
    private String roomTypeCode;
    @SerializedName("Bookable")
    @Expose
    private Boolean bookable;
    @SerializedName("RatePlanCode")
    @Expose
    private String ratePlanCode;

    public Integer getBaseChildOccupancy() {
        return baseChildOccupancy;
    }

    public void setBaseChildOccupancy(Integer baseChildOccupancy) {
        this.baseChildOccupancy = baseChildOccupancy;
    }

    public Integer getBaseAdultOccupancy() {
        return baseAdultOccupancy;
    }

    public void setBaseAdultOccupancy(Integer baseAdultOccupancy) {
        this.baseAdultOccupancy = baseAdultOccupancy;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public Boolean getBookable() {
        return bookable;
    }

    public void setBookable(Boolean bookable) {
        this.bookable = bookable;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

}
