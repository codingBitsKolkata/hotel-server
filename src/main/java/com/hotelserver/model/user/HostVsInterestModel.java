/**
 * @author Abhideep
 */
package com.hotelserver.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hotelserver.model.CommonModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class HostVsInterestModel extends CommonModel {

	@JsonProperty("hostIntId")
	private String hostIntId;
	
	@JsonProperty("user")
	private UserModel userModel;
	
	@JsonProperty("interest")
	private InterestModel interest;

}