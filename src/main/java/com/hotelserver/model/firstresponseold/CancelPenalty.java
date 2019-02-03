
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
public class CancelPenalty {

    @SerializedName("PenaltyDescription")
    @Expose
    public PenaltyDescription penaltyDescription;
    @SerializedName("Deadline")
    @Expose
    public String deadline;
    @SerializedName("NonRefundable")
    @Expose
    public Boolean nonRefundable;

}
