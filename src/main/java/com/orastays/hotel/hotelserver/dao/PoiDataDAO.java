package com.orastays.hotel.hotelserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.hotel.hotelserver.entity.PoiDataEntity;

@Repository
public class PoiDataDAO extends GenericDAO<PoiDataEntity, Long> {

	private static final long serialVersionUID = 2794201426819844087L;

	public PoiDataDAO() {
		super(PoiDataEntity.class);

	}
}