
package firstcall.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PenaltyDescription {

    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("Text")
    @Expose
    public String text;

}
