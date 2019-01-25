
package org.soaps;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStays {

    @SerializedName("RoomStay")
    @Expose
    private List<RoomStay> roomStay = new ArrayList<RoomStay>();

    public List<RoomStay> getRoomStay() {
        return roomStay;
    }

    public void setRoomStay(List<RoomStay> roomStay) {
        this.roomStay = roomStay;
    }

}
