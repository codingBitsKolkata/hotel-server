
package com.hotelserver.model.secondresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInformation {

    @SerializedName("Multimedia")
    @Expose
    public Multimedia multimedia;
    @SerializedName("CheckOutTime")
    @Expose
    public Integer checkOutTime;
    @SerializedName("Description")
    @Expose
    public String description;
    @SerializedName("HotelCategory")
    @Expose
    public Integer hotelCategory;
    @SerializedName("CrossLinks")
    @Expose
    public List<CrossLink> crossLinks = null;
    @SerializedName("AreaSeoId")
    @Expose
    public String areaSeoId;
    @SerializedName("HotelType")
    @Expose
    public String hotelType;
    @SerializedName("isFlexibleCheckIn")
    @Expose
    public Boolean isFlexibleCheckIn;
    @SerializedName("NumberOfRooms")
    @Expose
    public Integer numberOfRooms;
    @SerializedName("POI")
    @Expose
    public POI pOI;
    @SerializedName("NumberOfFloors")
    @Expose
    public Integer numberOfFloors;
    @SerializedName("Area")
    @Expose
    public String area;
    @SerializedName("yatraSmart")
    @Expose
    public Boolean yatraSmart;
    @SerializedName("Reviews")
    @Expose
    public String reviews;
    @SerializedName("StateSeoId")
    @Expose
    public String stateSeoId;
    @SerializedName("propertyType")
    @Expose
    public String propertyType;
    @SerializedName("AmenityDescription")
    @Expose
    public String amenityDescription;
    @SerializedName("CheckInTime")
    @Expose
    public Integer checkInTime;
    @SerializedName("CitySeoId")
    @Expose
    public String citySeoId;
    @SerializedName("Amenities")
    @Expose
    public Amenities amenities;

}
