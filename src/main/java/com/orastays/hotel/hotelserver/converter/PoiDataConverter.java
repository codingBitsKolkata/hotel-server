package com.orastays.hotel.hotelserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.hotel.hotelserver.entity.PoiDataEntity;
import com.orastays.hotel.hotelserver.helper.Util;
import com.orastays.hotel.hotelserver.model.PoiDataModel;

@Component
public class PoiDataConverter extends CommonConverter implements BaseConverter<PoiDataEntity, PoiDataModel> {

	private static final long serialVersionUID = 7260935394482530601L;
	private static final Logger logger = LogManager.getLogger(PoiDataConverter.class);

	@Override
	public PoiDataEntity modelToEntity(PoiDataModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PoiDataModel entityToModel(PoiDataEntity e) {
		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		PoiDataModel poiDataModel = new PoiDataModel();
		poiDataModel = (PoiDataModel) Util.transform(modelMapper, e, poiDataModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return poiDataModel;
	}

	@Override
	public List<PoiDataModel> entityListToModelList(List<PoiDataEntity> es) {
		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<PoiDataModel> poiDataModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			poiDataModels = new ArrayList<>();
			for (PoiDataEntity poiDataEntity : es) {
				poiDataModels.add(entityToModel(poiDataEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return poiDataModels;
	}

}
