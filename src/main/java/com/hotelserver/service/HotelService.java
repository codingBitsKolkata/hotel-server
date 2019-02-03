package com.hotelserver.service;

import java.util.List;

import com.hotelserver.exceptions.FormExceptions;
import com.hotelserver.model.propertylist.FilterCiteriaModel;
import com.hotelserver.model.propertylist.PropertyListViewModel;

public interface HotelService {

	List<PropertyListViewModel> fetchHotels(FilterCiteriaModel filterCiteriaModel) throws FormExceptions;

}
