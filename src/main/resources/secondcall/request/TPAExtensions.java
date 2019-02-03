
package secondcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TPAExtensions {

    @JsonProperty("SeoEnabled")
    
    public String seoEnabled;
    @JsonProperty("Pagination")
    
    public Pagination pagination;
    @JsonProperty("UserAuthentication")
    
    public UserAuthentication userAuthentication;

}
