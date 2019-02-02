package com.hotelserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.hotelserver.entity.AreaDataEntity;
import com.hotelserver.helper.Util;
import com.hotelserver.model.AreaDataModel;

@Component
public class AreaDataConverter extends CommonConverter implements BaseConverter<AreaDataEntity, AreaDataModel> {

	private static final long serialVersionUID = 2660920754725363310L;
	private static final Logger logger = LogManager.getLogger(AreaDataConverter.class);

	@Override
	public AreaDataEntity modelToEntity(AreaDataModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaDataModel entityToModel(AreaDataEntity e) {
		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		AreaDataModel areaDataModel = new AreaDataModel();
		areaDataModel = (AreaDataModel) Util.transform(modelMapper, e, areaDataModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return areaDataModel;
	}

	@Override
	public List<AreaDataModel> entityListToModelList(List<AreaDataEntity> es) {
		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<AreaDataModel> areaDataModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			areaDataModels = new ArrayList<>();
			for (AreaDataEntity areaDataEntity : es) {
				areaDataModels.add(entityToModel(areaDataEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return areaDataModels;
	}

}
