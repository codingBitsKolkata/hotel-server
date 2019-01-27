
package org.soaps;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCounts {

    @SerializedName("GuestCount")
    @Expose
    private List<GuestCount> guestCount = new ArrayList<GuestCount>();

    public List<GuestCount> getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(List<GuestCount> guestCount) {
        this.guestCount = guestCount;
    }

}
