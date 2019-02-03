
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GuestCount {

    @JsonProperty("AgeQualifyingCode")
    
    public String ageQualifyingCode;
    @JsonProperty("Count")
    
    public String count;

}
