package com.hotelserver.dao;

import org.springframework.stereotype.Repository;

import com.hotelserver.entity.AreaDataEntity;

@Repository
public class AreaDataDAO extends GenericDAO<AreaDataEntity, Long> {

	private static final long serialVersionUID = 7428272824417676654L;

	public AreaDataDAO() {
		super(AreaDataEntity.class);

	}
}
