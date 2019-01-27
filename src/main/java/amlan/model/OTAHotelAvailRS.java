
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OTAHotelAvailRS {

    @SerializedName("xmlns")
    @Expose
    private String xmlns;
	@SerializedName("RoomStays")
    @Expose 
    private RoomStays roomStays; 
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions____ tPAExtensions;
    @SerializedName("CorrelationID")
    @Expose
    private String correlationID;
    @SerializedName("PrimaryLangID")
    @Expose
    private String primaryLangID;
    @SerializedName("AltLangID")
    @Expose
    private String altLangID;
    @SerializedName("Success")
    @Expose
    private String success;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

	
	  public RoomStays getRoomStays() { return roomStays; }
	  
	  public void setRoomStays(RoomStays roomStays) { this.roomStays = roomStays; }
	 

    public TPAExtensions____ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public String getCorrelationID() {
        return correlationID;
    }

    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
    }

    public String getPrimaryLangID() {
        return primaryLangID;
    }

    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    public String getAltLangID() {
        return altLangID;
    }

    public void setAltLangID(String altLangID) {
        this.altLangID = altLangID;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

}
