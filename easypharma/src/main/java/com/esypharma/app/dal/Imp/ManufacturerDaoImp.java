package com.esypharma.app.dal.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.esypharma.app.dal.ManufacturerDao;
import com.esypharma.models.Manufacturer;
import com.esypharma.repository.ManufacturerRepository;

@Component
public class ManufacturerDaoImp implements ManufacturerDao {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	

	
	@Override
	public void saveManufacture(Manufacturer manufacturer) {
		manufacturerRepository.insert(manufacturer);
	}

}
