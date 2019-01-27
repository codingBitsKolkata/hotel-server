
package org.soaps;

import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInformation {

	@SerializedName("srpPriority")
	@Expose
	private Boolean srpPriority;
	@SerializedName("featured")
	@Expose
	private Boolean featured;
	@SerializedName("yatraSmart")
	@Expose
	private Boolean yatraSmart;

	@SerializedName("Reviews")
	@Expose
	private Object reviews;

	@SerializedName("propertyType")
	@Expose
	private String propertyType;
	@SerializedName("HotelType")
	@Expose
	private String hotelType;
	@SerializedName("Rank")
	@Expose
	private Integer rank;

	public Boolean getSrpPriority() {
		return srpPriority;
	}

	public void setSrpPriority(Boolean srpPriority) {
		this.srpPriority = srpPriority;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public Boolean getYatraSmart() {
		return yatraSmart;
	}

	public void setYatraSmart(Boolean yatraSmart) {
		this.yatraSmart = yatraSmart;
	}

	public Object getReviews() {
		return reviews;
	}

	public void setReviews(Object reviews) {
		this.reviews = reviews;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getHotelType() {
		return hotelType;
	}

	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

}
