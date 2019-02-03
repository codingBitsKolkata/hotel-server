package com.hotelserver.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelserver.exceptions.FormExceptions;
import com.hotelserver.helper.FirstCall;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.propertylist.PropertyListViewModel;
import com.hotelserver.service.HotelService;

@Service
@Transactional(readOnly = true)
public class HotelServiceImpl implements HotelService {

	private static final Logger logger = LogManager.getLogger(HotelServiceImpl.class);
	
	@Autowired
	private FirstCall firstCall;
	
	@Override
	public List<PropertyListViewModel> fetchHotels(FilterCiteriaModel filterCiteriaModel) throws FormExceptions {

		if (logger.isInfoEnabled()) {
			logger.info("fetchHotels -- START");
		}
		
		firstCall.firstCall(filterCiteriaModel);
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchHotels -- END");
		}
		
		return null;
	}

}
