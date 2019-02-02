/**
 * @author SUDEEP
 */
package com.hotelserver.entity;

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
@Table(name = "master_poi_data")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PoiDataEntity extends CommonEntity {

	private static final long serialVersionUID = -4311033901268631107L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "poid_id")
	@JsonProperty("poidId")
	private Long poidId;

	@Column(name = "Poi_Id")
	@JsonProperty("PoiId")
	private String PoiId;

	@Column(name = "Poi_Seo_Id")
	@JsonProperty("PoiSeoId")
	private String PoiSeoId;

	@Column(name = "Poi_Name")
	@JsonProperty("PoiName")
	private String PoiName;

	@Column(name = "Latitude")
	@JsonProperty("Latitude")
	private String Latitude;

	@Column(name = "Longitude")
	@JsonProperty("Longitude")
	private String Longitude;

	@Column(name = "City_Id")
	@JsonProperty("CityId")
	private String CityId;

	@Column(name = "City_Name")
	@JsonProperty("CityName")
	private String CityName;

	@Column(name = "Seo_City_Name")
	@JsonProperty("SeoCityName")
	private String SeoCityName;

	@Override
	public String toString() {
		return Long.toString(poidId);
	}
}