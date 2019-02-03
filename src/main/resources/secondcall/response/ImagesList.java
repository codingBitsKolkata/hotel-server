
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ImagesList {

    @JsonProperty("ThumbnailImageObj")
    
    public ThumbnailImageObj thumbnailImageObj;
    @JsonProperty("LargeImageObj")
    
    public LargeImageObj largeImageObj;

}
