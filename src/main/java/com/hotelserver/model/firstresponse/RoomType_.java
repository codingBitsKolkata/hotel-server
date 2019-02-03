
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
public class RoomType_ {

    @SerializedName("maxAdult")
    @Expose
    public Integer maxAdult;
    @SerializedName("propertyLevel")
    @Expose
    public String propertyLevel;
    @SerializedName("maxGuest")
    @Expose
    public Integer maxGuest;
    @SerializedName("smoking")
    @Expose
    public String smoking;
    @SerializedName("maxChild")
    @Expose
    public Integer maxChild;
    @SerializedName("maxChildAge")
    @Expose
    public Integer maxChildAge;
    @SerializedName("minChildAge")
    @Expose
    public Integer minChildAge;

}
