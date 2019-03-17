package com.hotelserver.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelserver.dao.HotelDataDAO;
import com.hotelserver.dao.HotelReviewDAO;
import com.hotelserver.entity.HotelDataEntity;
import com.hotelserver.entity.HotelReviewEntity;
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
	
	@Autowired
	private HotelReviewDAO hotelReviewDAO;
	
	@Override
	public void saveFileData(Map<String, HotelDetails> hotelData) {
		
		if (logger.isInfoEnabled()) {
			logger.info("saveFileData -- END");
		}
		
		hotelReviewDAO.delete();
		hotelReviewDAO.alter();
		hotelDataDAO.delete();
		hotelDataDAO.alter();
		for (Map.Entry<String, HotelDetails> entry : hotelData.entrySet()) {
			
			HotelDataEntity hotelDataEntity = new HotelDataEntity();
			hotelDataEntity.setCheckInTime(entry.getValue().getCheckInTime());
			hotelDataEntity.setCheckOutTime(entry.getValue().getCheckOutTime());
			hotelDataEntity.setCreatedBy(1L);
			hotelDataEntity.setCreatedDate(Util.getCurrentDateTime());
			String description = entry.getValue().getDescriptiveText();
			description = description.replaceAll("<b>", "");
			description = description.replaceAll("</b>", "");
			description = description.replaceAll("<br>", "");
			hotelDataEntity.setDescriptiveText(description);
			hotelDataEntity.setHotelCode(entry.getKey());
			hotelDataEntity.setHotelName(entry.getValue().getHotelName());
			hotelDataEntity.setLatitude(entry.getValue().getLatitude());
			hotelDataEntity.setLongitude(entry.getValue().getLongitude());
			hotelDataEntity.setReviewCount(entry.getValue().getReviewCount());
			hotelDataEntity.setReviewRating(entry.getValue().getReviewRating());
			hotelDataEntity.setStatus(Status.ACTIVE.ordinal());
			
			List<HotelReviewEntity> hotelReviewEntities = new ArrayList<>();
			if(!CollectionUtils.isEmpty(entry.getValue().getReviews())) {
				entry.getValue().getReviews().stream().forEach(r -> {
					
					HotelReviewEntity hotelReviewEntity = new HotelReviewEntity();
					hotelReviewEntity.setAvgGuestRating(r.getAvgGuestRating());
					hotelReviewEntity.setCleanliness(r.getCleanliness());
					String comments = r.getComments();
					if(comments.contains("'")) {
						comments = comments.replaceAll("'", "\'");
					}
					hotelReviewEntity.setComments(comments);
					hotelReviewEntity.setCreatedBy(1L);
					hotelReviewEntity.setCreatedDate(Util.getCurrentDateTime());
					hotelReviewEntity.setDiningQuality(r.getDiningQuality());
					hotelReviewEntity.setHotelDataEntity(hotelDataEntity);
					hotelReviewEntity.setOverallRating(r.getOverallRating());
					hotelReviewEntity.setPostDate(r.getPostDate());
					hotelReviewEntity.setRoomQuality(r.getRoomQuality());
					hotelReviewEntity.setServiceQuality(r.getServiceQuality());
					hotelReviewEntity.setStatus(Status.ACTIVE.ordinal());
					
					hotelReviewEntities.add(hotelReviewEntity);
				});
				hotelDataEntity.setHotelReviewEntities(hotelReviewEntities);
			}
			Long hotelId = (Long) hotelDataDAO.save(hotelDataEntity);
			hotelDataEntity.setHotelId(hotelId);
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("saveFileData -- END");
		}
	}
}
