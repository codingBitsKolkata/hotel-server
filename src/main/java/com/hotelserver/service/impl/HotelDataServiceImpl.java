package com.hotelserver.service.impl;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelserver.dao.HotelDataDAO;
import com.hotelserver.entity.HotelDataEntity;
import com.hotelserver.helper.Status;
import com.hotelserver.helper.Util;
import com.hotelserver.model.dumpdata.HotelDetails;
import com.hotelserver.service.HotelDataService;

@Service
@Transactional
public class HotelDataServiceImpl implements HotelDataService {

	private static final Logger logger = LogManager.getLogger(HotelServiceImpl.class);
	
	@Autowired
	private HotelDataDAO hotelDataDAO;
	
	@Override
	public void saveFileData(Map<String, HotelDetails> hotelData) {
		
		if (logger.isInfoEnabled()) {
			logger.info("saveFileData -- END");
		}
		
		hotelDataDAO.delete();
		hotelDataDAO.alter();
		for (Map.Entry<String, HotelDetails> entry : hotelData.entrySet()) {
			
			HotelDataEntity hotelDataEntity = new HotelDataEntity();
			hotelDataEntity.setCheckInTime(entry.getValue().getCheckInTime());
			hotelDataEntity.setCheckOutTime(entry.getValue().getCheckOutTime());
			hotelDataEntity.setCreatedBy(1L);
			hotelDataEntity.setCreatedDate(Util.getCurrentDateTime());
			hotelDataEntity.setDescriptiveText(entry.getValue().getDescriptiveText());
			hotelDataEntity.setHotelCode(entry.getKey());
			hotelDataEntity.setHotelName(entry.getValue().getHotelName());
			hotelDataEntity.setLatitude(entry.getValue().getLatitude());
			hotelDataEntity.setLongitude(entry.getValue().getLongitude());
			hotelDataEntity.setReviewCount(entry.getValue().getReviewCount());
			hotelDataEntity.setReviewRating(entry.getValue().getReviewRating());
			hotelDataEntity.setStatus(Status.ACTIVE.ordinal());
			
			hotelDataDAO.saveOrUpdate(hotelDataEntity);
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("saveFileData -- END");
		}
	}
}
