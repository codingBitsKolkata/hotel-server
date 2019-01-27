
package org.soaps;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomTypes {

	@SerializedName("RoomType")
	@Expose
	private Object roomType;

	public Object getRoomType() {
		return roomType;
	}

	public void setRoomType(Object roomType) {
		this.roomType = roomType;
	}

}
