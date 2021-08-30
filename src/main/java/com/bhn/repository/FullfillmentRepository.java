package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.FullfillmentModel;


public interface FullfillmentRepository extends MongoRepository<FullfillmentModel, Integer>{

}