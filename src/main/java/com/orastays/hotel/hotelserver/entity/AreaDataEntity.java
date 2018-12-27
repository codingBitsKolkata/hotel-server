/**
 * @author SUDEEP
 */
package com.orastays.hotel.hotelserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_area_data")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AreaDataEntity extends CommonEntity {


	private static final long serialVersionUID = 1664391614870789806L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_id")
	@JsonProperty("adId")
	private Long adId;

	@Column(name = "AreaId")
	@JsonProperty("AreaId")
	private String AreaId;
	
	@Column(name = "AreaName")
	@JsonProperty("AreaName")
	private String AreaName;
	
	@Column(name = "CityName")
	@JsonProperty("CityName")
	private String CityName;

	@Override
	public String toString() {
		return Long.toString(adId);
	}
}