
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
public class TPAExtensions_ {

    @SerializedName("LowestRatePlanId")
    @Expose
    public String lowestRatePlanId;
    @SerializedName("DeepLinkInformation")
    @Expose
    public DeepLinkInformation deepLinkInformation;
    @SerializedName("StopSell")
    @Expose
    public Boolean stopSell;
    @SerializedName("PahSCRestriction")
    @Expose
    public Boolean pahSCRestriction;
    @SerializedName("HotelBasicInformation")
    @Expose
    public HotelBasicInformation hotelBasicInformation;

}
