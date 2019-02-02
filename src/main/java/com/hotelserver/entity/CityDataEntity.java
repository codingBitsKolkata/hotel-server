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
@Table(name = "master_city_data")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CityDataEntity extends CommonEntity {

	private static final long serialVersionUID = -6553519346852643887L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_id")
	@JsonProperty("cdId")
	private Long cdId;

	@Column(name = "CityName")
	@JsonProperty("CityName")
	private String CityName;

	@Override
	public String toString() {
		return Long.toString(cdId);
	}
}