
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Multimedia {

    @JsonProperty("ImageUrl")
    
    public String imageUrl;
    @JsonProperty("ThumbnailUrl")
    
    public String thumbnailUrl;
    @JsonProperty("ImageJSON")
    
    public ImageJSON imageJSON;

}
