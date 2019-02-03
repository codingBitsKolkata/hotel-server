
package secondcall.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HotelBasicInformation {

    @JsonProperty("AmenityDescription")
    
    public String amenityDescription;
    @JsonProperty("Area")
    
    public String area;
    @JsonProperty("AreaSeoId")
    
    public String areaSeoId;
    @JsonProperty("CheckInTime")
    
    public String checkInTime;
    @JsonProperty("CheckOutTime")
    
    public String checkOutTime;
    @JsonProperty("CitySeoId")
    
    public String citySeoId;
    @JsonProperty("Description")
    
    public String description;
    @JsonProperty("HotelCategory")
    
    public String hotelCategory;
    @JsonProperty("HotelType")
    
    public String hotelType;
    @JsonProperty("NumberOfFloors")
    
    public String numberOfFloors;
    @JsonProperty("NumberOfRooms")
    
    public String numberOfRooms;
    @JsonProperty("StateSeoId")
    
    public String stateSeoId;
    @JsonProperty("isFlexibleCheckIn")
    
    public String isFlexibleCheckIn;
    @JsonProperty("propertyType")
    
    public String propertyType;
    @JsonProperty("yatraSmart")
    
    public String yatraSmart;
    @JsonProperty("Reviews")
    
    public Object reviews;
    @JsonProperty("Multimedia")
    
    public Multimedia multimedia;
    @JsonProperty("POI")
    
    public POI pOI;
    @JsonProperty("Amenities")
    
    public Amenities amenities;
    @JsonProperty("CrossLinks")
    
    public List<CrossLink> crossLinks = null;

}
