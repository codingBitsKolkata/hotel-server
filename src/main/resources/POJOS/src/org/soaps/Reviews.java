package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviews {
	@SerializedName("ReviewRating")
	@Expose
	private Float reviewRating;
	@SerializedName("ReviewCount")
	@Expose
	private Integer reviewCount;

	public Float getReviewRating() {
	return reviewRating;
	}

	public void setReviewRating(Float reviewRating) {
	this.reviewRating = reviewRating;
	}

	public Integer getReviewCount() {
	return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
	this.reviewCount = reviewCount;
	}
}
