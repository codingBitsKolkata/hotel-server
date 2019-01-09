package com.orastays.hotel.hotelserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.orastays.hotel.hotelserver.helper.MessageUtil;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected MessageUtil messageUtil;

	//@Autowired
	//protected HotelService hotelService;
}
