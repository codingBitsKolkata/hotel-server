
package amlan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdditionalGuest {

    @SerializedName("roomNo")
    @Expose
    private Integer roomNo;
    @SerializedName("children")
    @Expose
    private Integer children;
    @SerializedName("adults")
    @Expose
    private Integer adults;

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

}
