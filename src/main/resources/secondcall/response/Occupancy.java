
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Occupancy {

    @JsonProperty("MaxOccupancy")
    
    public String maxOccupancy;
    @JsonProperty("AgeQualifyingCode")
    
    public String ageQualifyingCode;
    @JsonProperty("MaxAge")
    
    public String maxAge;
    @JsonProperty("MinAge")
    
    public String minAge;

}
