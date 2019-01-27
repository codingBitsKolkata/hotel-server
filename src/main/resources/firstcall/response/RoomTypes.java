
package firstcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomTypes {

    @SerializedName("RoomType")
    @Expose
    public List<RoomType> roomType = null;

}
