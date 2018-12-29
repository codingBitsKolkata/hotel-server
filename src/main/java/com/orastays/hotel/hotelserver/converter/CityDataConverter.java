package com.orastays.hotel.hotelserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.hotel.hotelserver.entity.CityDataEntity;
import com.orastays.hotel.hotelserver.helper.Util;
import com.orastays.hotel.hotelserver.model.CityDataModel;

@Component
public class CityDataConverter extends CommonConverter implements BaseConverter<CityDataEntity, CityDataModel> {

	private static final long serialVersionUID = 3996197962057357955L;
	private static final Logger logger = LogManager.getLogger(CityDataConverter.class);

	@Override
	public CityDataEntity modelToEntity(CityDataModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDataModel entityToModel(CityDataEntity e) {
		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		CityDataModel cityDataModel = new CityDataModel();
		cityDataModel = (CityDataModel) Util.transform(modelMapper, e, cityDataModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return cityDataModel;
	}

	@Override
	public List<CityDataModel> entityListToModelList(List<CityDataEntity> es) {
		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<CityDataModel> cityDataModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			cityDataModels = new ArrayList<>();
			for (CityDataEntity cityDataEntity : es) {
				cityDataModels.add(entityToModel(cityDataEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return cityDataModels;
	}

}
