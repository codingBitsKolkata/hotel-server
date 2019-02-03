
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UserAuthentication {

    @JsonProperty("password")
    
    public String password;
    @JsonProperty("propertyId")
    
    public String propertyId;
    @JsonProperty("username")
    
    public String username;

}
