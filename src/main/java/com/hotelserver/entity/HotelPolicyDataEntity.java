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
@Table(name = "master_hotel_policy_data")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class HotelPolicyDataEntity extends CommonEntity {

	private static final long serialVersionUID = 3095493875517470739L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hpd_id")
	@JsonProperty("hpdId")
	private Long hpdId;

	@Column(name = "policy", length = 65535, columnDefinition="Text")
	@JsonProperty("policy")
	private String policy;
	

	@Override
	public String toString() {
		return Long.toString(hpdId);
	}
}