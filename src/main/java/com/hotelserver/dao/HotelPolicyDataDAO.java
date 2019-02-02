package com.hotelserver.dao;

import org.springframework.stereotype.Repository;

import com.hotelserver.entity.HotelPolicyDataEntity;

@Repository
public class HotelPolicyDataDAO extends GenericDAO<HotelPolicyDataEntity, Long> {

	private static final long serialVersionUID = 174744443368798649L;

	public HotelPolicyDataDAO() {
		super(HotelPolicyDataEntity.class);

	}
}
