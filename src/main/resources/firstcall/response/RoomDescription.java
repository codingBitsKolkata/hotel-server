
package firstcall.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomDescription {

    @SerializedName("Text")
    @Expose
    public Object text;
    @SerializedName("Image")
    @Expose
    public List<Object> image = null;

}
