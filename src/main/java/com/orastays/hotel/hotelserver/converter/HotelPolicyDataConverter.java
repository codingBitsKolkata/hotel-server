package com.orastays.hotel.hotelserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.hotel.hotelserver.entity.HotelPolicyDataEntity;
import com.orastays.hotel.hotelserver.helper.Util;
import com.orastays.hotel.hotelserver.model.HotelPolicyDataModel;

@Component
public class HotelPolicyDataConverter extends CommonConverter
		implements BaseConverter<HotelPolicyDataEntity, HotelPolicyDataModel> {

	private static final long serialVersionUID = 7797175037860152424L;
	private static final Logger logger = LogManager.getLogger(HotelPolicyDataConverter.class);

	@Override
	public HotelPolicyDataEntity modelToEntity(HotelPolicyDataModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelPolicyDataModel entityToModel(HotelPolicyDataEntity e) {
		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		HotelPolicyDataModel hotelPolicyDataModel = new HotelPolicyDataModel();
		hotelPolicyDataModel = (HotelPolicyDataModel) Util.transform(modelMapper, e, hotelPolicyDataModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return hotelPolicyDataModel;
	}

	@Override
	public List<HotelPolicyDataModel> entityListToModelList(List<HotelPolicyDataEntity> es) {
		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<HotelPolicyDataModel> hotelPolicyDataModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			hotelPolicyDataModels = new ArrayList<>();
			for (HotelPolicyDataEntity hotelPolicyDataEntity : es) {
				hotelPolicyDataModels.add(entityToModel(hotelPolicyDataEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return hotelPolicyDataModels;
	}

}
