
package com.hotelserver.model.firstresponseold;

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
public class HotelBasicInformation {

    @SerializedName("srpPriority")
    @Expose
    public Boolean srpPriority;
    @SerializedName("featured")
    @Expose
    public Boolean featured;
    @SerializedName("yatraSmart")
    @Expose
    public Boolean yatraSmart;
    @SerializedName("Reviews")
    @Expose
    public Reviews reviews;
    @SerializedName("propertyType")
    @Expose
    public String propertyType;
    @SerializedName("HotelType")
    @Expose
    public String hotelType;
    @SerializedName("Rank")
    @Expose
    public Integer rank;

}
