
package com.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class Occupancy {

    @SerializedName("MaxOccupancy")
    @Expose
    public Integer maxOccupancy;
    @SerializedName("AgeQualifyingCode")
    @Expose
    public Integer ageQualifyingCode;
    @SerializedName("MinAge")
    @Expose
    public Integer minAge;
    @SerializedName("MaxAge")
    @Expose
    public Integer maxAge;

}
