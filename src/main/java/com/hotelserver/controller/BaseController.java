package com.hotelserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotelserver.helper.MessageUtil;
import com.hotelserver.service.HotelService;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected MessageUtil messageUtil;

	@Autowired
	protected HotelService hotelService;
}
