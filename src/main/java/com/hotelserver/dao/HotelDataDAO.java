package com.hotelserver.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.hotelserver.entity.HotelDataEntity;

@Repository
public class HotelDataDAO extends GenericDAO<HotelDataEntity, Long> {

	private static final long serialVersionUID = -849987361608725339L;

	public HotelDataDAO() {
		super(HotelDataEntity.class);
	}

	public void delete() {

		try {
			Query query = sessionFactory.getCurrentSession().createSQLQuery("DELETE FROM master_hotel_data");
			query.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alter() {

		try {
			Query query = sessionFactory.getCurrentSession()
					.createSQLQuery("ALTER TABLE master_hotel_data AUTO_INCREMENT = 1");
			query.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
