
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType {

    @SerializedName("AdditionalDetails")
    @Expose
    public String additionalDetails;
    @SerializedName("RoomType")
    @Expose
    public String roomType;
    @SerializedName("RoomDescription")
    @Expose
    public RoomDescription roomDescription;
    @SerializedName("Occupancy")
    @Expose
    public List<Occupancy> occupancy = null;
    @SerializedName("TPA_Extensions")
    @Expose
    public TPAExtensions tPAExtensions;
    @SerializedName("RoomTypeCode")
    @Expose
    public String roomTypeCode;
    @SerializedName("NonSmoking")
    @Expose
    public Boolean nonSmoking;

}
