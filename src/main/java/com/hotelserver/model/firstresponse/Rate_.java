
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
public class Rate_ {

    @SerializedName("BaseChildOccupancy")
    @Expose
    public Integer baseChildOccupancy;
    @SerializedName("BaseAdultOccupancy")
    @Expose
    public Integer baseAdultOccupancy;
    @SerializedName("RoomTypeCode")
    @Expose
    public String roomTypeCode;
    @SerializedName("Bookable")
    @Expose
    public Boolean bookable;
    @SerializedName("RatePlanCode")
    @Expose
    public String ratePlanCode;

}
