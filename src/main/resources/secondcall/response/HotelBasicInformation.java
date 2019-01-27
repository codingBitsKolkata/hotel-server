
package secondcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInformation {

    @SerializedName("AmenityDescription")
    @Expose
    public String amenityDescription;
    @SerializedName("Area")
    @Expose
    public String area;
    @SerializedName("AreaSeoId")
    @Expose
    public String areaSeoId;
    @SerializedName("CheckInTime")
    @Expose
    public String checkInTime;
    @SerializedName("CheckOutTime")
    @Expose
    public String checkOutTime;
    @SerializedName("CitySeoId")
    @Expose
    public String citySeoId;
    @SerializedName("Description")
    @Expose
    public String description;
    @SerializedName("HotelCategory")
    @Expose
    public String hotelCategory;
    @SerializedName("HotelType")
    @Expose
    public String hotelType;
    @SerializedName("NumberOfFloors")
    @Expose
    public String numberOfFloors;
    @SerializedName("NumberOfRooms")
    @Expose
    public String numberOfRooms;
    @SerializedName("StateSeoId")
    @Expose
    public String stateSeoId;
    @SerializedName("isFlexibleCheckIn")
    @Expose
    public String isFlexibleCheckIn;
    @SerializedName("propertyType")
    @Expose
    public String propertyType;
    @SerializedName("yatraSmart")
    @Expose
    public String yatraSmart;
    @SerializedName("Reviews")
    @Expose
    public Object reviews;
    @SerializedName("Multimedia")
    @Expose
    public Multimedia multimedia;
    @SerializedName("POI")
    @Expose
    public POI pOI;
    @SerializedName("Amenities")
    @Expose
    public Amenities amenities;
    @SerializedName("CrossLinks")
    @Expose
    public List<CrossLink> crossLinks = null;

}
