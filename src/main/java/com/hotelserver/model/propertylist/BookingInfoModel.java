package com.hotelserver.model.propertylist;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class BookingInfoModel extends CommonModel {

	
	@JsonProperty("bookingInfoId")
	private String bookingInfoId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("address")
	private String address;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("gstin")
	private String gstin;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("email")
	private String email;

	@JsonProperty("checkinPrefTime")
	private String checkinPrefTime;

	@JsonProperty("checkoutPrefTime")
	private String checkoutPrefTime;

	@JsonProperty("identityId")
	private String identityId;

	@JsonProperty("idFileUrl")
	private String idFileUrl;
	
	@JsonProperty("namePrefix")
	private String namePrefix;
	
	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("middleName")
	private String middleName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("countryCode")
	private String countryCode;
	
	@JsonProperty("areaCityCode")
	private String areaCityCode;
	
	@JsonProperty("cityName")
	private String cityName;
	
	@JsonProperty("postalCode")
	private String postalCode;
	
	@JsonProperty("stateProv")
	private String stateProv;
	
	@JsonProperty("countryName")
	private String countryName;
	
}
