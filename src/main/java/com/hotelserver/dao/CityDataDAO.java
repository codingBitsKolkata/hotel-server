package com.hotelserver.dao;

import org.springframework.stereotype.Repository;

import com.hotelserver.entity.CityDataEntity;

@Repository
public class CityDataDAO extends GenericDAO<CityDataEntity, Long> {

	private static final long serialVersionUID = 6306397537946401737L;

	public CityDataDAO() {
		super(CityDataEntity.class);

	}
}
