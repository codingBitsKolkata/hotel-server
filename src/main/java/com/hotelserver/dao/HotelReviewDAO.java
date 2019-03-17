package com.hotelserver.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.hotelserver.entity.HotelReviewEntity;

@Repository
public class HotelReviewDAO extends GenericDAO<HotelReviewEntity, Long> {

	private static final long serialVersionUID = -8182754758399765880L;

	public HotelReviewDAO() {
		super(HotelReviewEntity.class);
	}

	public void delete() {

		try {
			Query query = sessionFactory.getCurrentSession().createSQLQuery("DELETE FROM master_hotel_review");
			query.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alter() {

		try {
			Query query = sessionFactory.getCurrentSession()
					.createSQLQuery("ALTER TABLE master_hotel_review AUTO_INCREMENT = 1");
			query.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
