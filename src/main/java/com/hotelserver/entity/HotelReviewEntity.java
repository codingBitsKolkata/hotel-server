/**
 * @author SUDEEP
 */
package com.hotelserver.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_hotel_review")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class HotelReviewEntity extends CommonEntity {

	private static final long serialVersionUID = -7977231122522323934L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_review_id")
	@JsonProperty("hotelReviewId")
	private Long hotelReviewId;

	@Column(name = "avgGuestRating")
	@JsonProperty("avgGuestRating")
	private String avgGuestRating;
	
	@Column(name = "overallRating")
	@JsonProperty("overallRating")
	private String overallRating;
	
	@Column(name = "comments", length = 65535, columnDefinition = "Text")
	@JsonProperty("comments")
	private String comments;
	
	@Column(name = "roomQuality")
	@JsonProperty("roomQuality")
	private String roomQuality;
	
	@Column(name = "serviceQuality")
	@JsonProperty("serviceQuality")
	private String serviceQuality;
	
	@Column(name = "diningQuality")
	@JsonProperty("diningQuality")
	private String diningQuality;
	
	@Column(name = "cleanliness")
	@JsonProperty("cleanliness")
	private String cleanliness;
	
	@Column(name = "postDate")
	@JsonProperty("postDate")
	private String postDate;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "hotel_id", nullable = false)
	@JsonProperty("hotels")
	private HotelDataEntity hotelDataEntity;

	@Override
	public String toString() {
		return Long.toString(hotelReviewId);
	}
}