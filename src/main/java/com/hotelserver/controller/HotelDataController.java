package com.hotelserver.controller;

import java.io.File;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelserver.helper.HotelConstant;
import com.hotelserver.helper.Util;
import com.hotelserver.model.dumpdata.HotelDetails;
import com.hotelserver.model.propertylist.ResponseModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@Api(value = "Hotel Dump Data", tags = "Hotel Dump")
public class HotelDataController extends BaseController {

	private static final Logger logger = LogManager.getLogger(HotelDataController.class);
	
	@Value("${file.directory}")
	private Resource directory;
	
	//@Scheduled(cron = "0 45 00 17 * ? 2019")
	//@Scheduled(fixedRate = 1296000) // 15 Days
	public void autoFileUpload() {
		
		logger.info("autoFileUpload -- START");
		
		try {
			File dir = directory.getFile();
			File[] files = dir.listFiles();
			Map<String, HotelDetails> hotelData = readHotelDumpData.readMasterData(files[0]);
			if(hotelData.size() > 0) {
				System.err.println("hotelData.size() ==>> "+hotelData.size());
				hotelDataService.saveFileData(hotelData);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Exception in autoFileUpload -- "+Util.errorToString(e));
		}
		
		logger.info("autoFileUpload -- END");
	}
	
	@GetMapping(value = "/refresh-hotel-dump", produces = "application/json")
	@ApiOperation(value = "Refresh Hotel Dump Data", response = ResponseModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 201, message = "Please Try after Sometime!!!") })
	public ResponseEntity<ResponseModel> refreshHotelDumpData() {

		if (logger.isInfoEnabled()) {
			logger.info("refreshHotelDumpData -- START");
		}

		ResponseModel responseModel = new ResponseModel();
		Util.printLog(null, HotelConstant.INCOMING, "Refresh Hotel Dump Data", request);
		try {
			long startTime = System.currentTimeMillis();
			File dir = directory.getFile();
			File[] files = dir.listFiles();
			Map<String, HotelDetails> hotelData = readHotelDumpData.readMasterData(files[0]);
			if(hotelData.size() > 0) {
				System.err.println("hotelData.size() ==>> "+hotelData.size());
				hotelDataService.saveFileData(hotelData);
			}
			long elapsedTimeNs = System.currentTimeMillis() - startTime;
			System.err.println("Total Time Taken ==>> "+(elapsedTimeNs/1000));
			responseModel.setResponseBody("DONE");
			responseModel.setResponseCode(messageUtil.getBundle(HotelConstant.COMMON_SUCCESS_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(HotelConstant.COMMON_SUCCESS_MESSAGE));
		} catch (Exception e) {
			e.printStackTrace();
			if (logger.isInfoEnabled()) {
				logger.info("Exception in fetchHotels -- "+Util.errorToString(e));
			}
			responseModel.setResponseCode(messageUtil.getBundle(HotelConstant.COMMON_ERROR_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(HotelConstant.COMMON_ERROR_MESSAGE));
		}

		Util.printLog(responseModel, HotelConstant.OUTGOING, "Refresh Hotel Dump Data", request);

		if (logger.isInfoEnabled()) {
			logger.info("refreshHotelDumpData -- END");
		}
		
		if (responseModel.getResponseCode().equals(messageUtil.getBundle(HotelConstant.COMMON_SUCCESS_CODE))) {
			return new ResponseEntity<>(responseModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
		}
	}

	public Resource getDirectory() {
		return directory;
	}

	public void setDirectory(Resource directory) {
		this.directory = directory;
	}
}
