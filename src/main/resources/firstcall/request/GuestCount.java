
package firstcall.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GuestCount {

    @JsonProperty("AgeQualifyingCode")
    
    public String ageQualifyingCode;
    @JsonProperty("Age")
    
    public String age;
    @JsonProperty("Count")
    
    public String count;

}
