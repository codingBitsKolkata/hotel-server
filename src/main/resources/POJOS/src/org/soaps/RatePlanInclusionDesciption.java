
package org.soaps;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePlanInclusionDesciption {

    @SerializedName("Text")
    @Expose
    private List<String> text = new ArrayList<String>();

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

}
