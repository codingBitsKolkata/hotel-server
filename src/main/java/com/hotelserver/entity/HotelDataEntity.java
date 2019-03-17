/**
 * @author SUDEEP
 */
package com.hotelserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_hotel_data")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class HotelDataEntity extends CommonEntity {

	private static final long serialVersionUID = 3454750516997587502L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	@JsonProperty("hotelId")
	private Long hotelId;
	
	@Column(name = "hotel_code")
	@JsonProperty("hotelCode")
	private String hotelCode;

	@Column(name = "hotel_name")
	@JsonProperty("hotelName")
	private String hotelName;
	
	@Column(name = "descriptive_text", length = 65535, columnDefinition = "Text")
	@JsonProperty("descriptiveText")
	private String descriptiveText;
	
	@Column(name = "longitude")
	@JsonProperty("longitude")
	private String longitude;
	
	@Column(name = "latitude")
	@JsonProperty("latitude")
	private String latitude;
	
	@Column(name = "checkOut_time")
	@JsonProperty("checkOutTime")
	private String checkOutTime;
	
	@Column(name = "checkIn_time")
	@JsonProperty("checkInTime")
	private String checkInTime;
	
	@Column(name = "review_count")
	@JsonProperty("reviewCount")
	private String reviewCount;
	
	@Column(name = "review_rating")
	@JsonProperty("reviewRating")
	private String reviewRating;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotelDataEntity", cascade = { CascadeType.ALL })
	@JsonProperty("hotelReviews")
	private List<HotelReviewEntity> hotelReviewEntities;

	@Override
	public String toString() {
		return Long.toString(hotelId);
	}
}