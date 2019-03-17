package com.hotelserver.service;

import java.util.List;

import com.hotelserver.exceptions.FormExceptions;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.propertylist.PropertyListViewModel;
import com.hotelserver.model.propertylist.PropertyModel;

public interface HotelService {

	List<PropertyListViewModel> fetchHotels(FilterCiteriaModel filterCiteriaModel) throws FormExceptions;

	PropertyModel fetchHotelDetails(FilterCiteriaModel filterCiteriaModel) throws FormExceptions;
	
}
