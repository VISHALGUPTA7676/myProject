package com.esypharma.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esypharma.models.Manufacturer;

public interface ManufacturerRepository extends MongoRepository<Manufacturer,String> {
	


}
