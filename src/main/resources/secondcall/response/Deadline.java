
package secondcall.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Deadline {

    @JsonProperty("OffsetDropTime")
    
    public String offsetDropTime;
    @JsonProperty("OffsetTimeUnit")
    
    public String offsetTimeUnit;
    @JsonProperty("OffsetUnitMultiplier")
    
    public String offsetUnitMultiplier;

}
