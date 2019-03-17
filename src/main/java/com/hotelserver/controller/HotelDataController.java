package com.hotelserver.controller;

import java.io.File;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.hotelserver.helper.Util;
import com.hotelserver.model.dumpdata.HotelDetails;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@CrossOrigin(origins = "*")
@ApiIgnore
public class HotelDataController extends BaseController {

	private static final Logger logger = LogManager.getLogger(HotelDataController.class);
	
	@Value("${file.directory}")
	private Resource directory;
	
	//@Scheduled(cron = "0 45 00 17 * ? 2019")
	@Scheduled(fixedRate = 1296000) // 15 Days
	public void autoFileUpload() {
		
		logger.info("autoFileUpload -- START");
		try {
			File dir = directory.getFile();
			File[] files = dir.listFiles();
			Map<String, HotelDetails> hotelData = readHotelDumpData.readMasterData(files[0]);
			if(hotelData.size() > 0)
				hotelDataService.saveFileData(hotelData);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Exception in autoFileUpload -- "+Util.errorToString(e));
		}
		logger.info("autoFileUpload -- END");
	}

	public Resource getDirectory() {
		return directory;
	}

	public void setDirectory(Resource directory) {
		this.directory = directory;
	}
}
