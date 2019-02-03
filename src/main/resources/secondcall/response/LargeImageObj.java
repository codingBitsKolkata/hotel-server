
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LargeImageObj {

    @JsonProperty("caption")
    
    public String caption;
    @JsonProperty("category")
    
    public String category;
    @JsonProperty("height")
    
    public String height;
    @JsonProperty("sizeName")
    
    public String sizeName;
    @JsonProperty("subCategory")
    
    public String subCategory;
    @JsonProperty("url")
    
    public String url;
    @JsonProperty("width")
    
    public String width;

}
