
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeepLinkInformation {

    @SerializedName("overviewURL")
    @Expose
    private String overviewURL;

    public String getOverviewURL() {
        return overviewURL;
    }

    public void setOverviewURL(String overviewURL) {
        this.overviewURL = overviewURL;
    }

}
