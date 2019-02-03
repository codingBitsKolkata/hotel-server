
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
public class HotelsInfo {

    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("deals")
    @Expose
    public Integer deals;
    @SerializedName("minPrice")
    @Expose
    public Integer minPrice;
    @SerializedName("available")
    @Expose
    public Integer available;
    @SerializedName("cacheable")
    @Expose
    public Boolean cacheable;
    @SerializedName("maxPrice")
    @Expose
    public Integer maxPrice;

}
