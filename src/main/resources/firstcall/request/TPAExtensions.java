
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TPAExtensions {

    @JsonProperty("Pagination")
    
    public Pagination pagination;
    @JsonProperty("HotelBasicInformation")
    
    public HotelBasicInformation hotelBasicInformation;
    @JsonProperty("UserAuthentication")
    
    public UserAuthentication userAuthentication;

}
