package com.hotelserver.service;

import java.util.Map;
import java.util.WeakHashMap;

import com.hotelserver.model.dumpdata.HotelDetails;

public interface HotelDataService {

	void saveFileData(Map<String, HotelDetails> hotelData);
	
	Map<String, HotelDetails> HOTELDATA = new WeakHashMap<>();
}
