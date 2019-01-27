
package org.soaps;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomRates {

    @SerializedName("RoomRate")
    @Expose
    private Object roomRate;

	public Object getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(Object roomRate) {
		this.roomRate = roomRate;
	}

   

}
