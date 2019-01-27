
package org.soaps;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType {

    @SerializedName("AdditionalDetails")
    @Expose
    private String additionalDetails;
    @SerializedName("RoomType")
    @Expose
    private String roomType;
    @SerializedName("RoomDescription")
    @Expose
    private RoomDescription roomDescription;
    @SerializedName("Occupancy")
    @Expose
    private List<Occupancy> occupancy = new ArrayList<Occupancy>();
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions tPAExtensions;
    @SerializedName("RoomTypeCode")
    @Expose
    private String roomTypeCode;
    @SerializedName("NonSmoking")
    @Expose
    private Boolean nonSmoking;

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public RoomDescription getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(RoomDescription roomDescription) {
        this.roomDescription = roomDescription;
    }

    public List<Occupancy> getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(List<Occupancy> occupancy) {
        this.occupancy = occupancy;
    }

    public TPAExtensions getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public Boolean getNonSmoking() {
        return nonSmoking;
    }

    public void setNonSmoking(Boolean nonSmoking) {
        this.nonSmoking = nonSmoking;
    }

}
