package com.hotelserver.service;

import java.util.Map;

import com.hotelserver.model.dumpdata.HotelDetails;

public interface HotelDataService {

	void saveFileData(Map<String, HotelDetails> hotelData);
}
