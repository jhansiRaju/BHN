package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.BomInfoModel;

public interface BomInfoRepo extends MongoRepository<BomInfoModel, Integer>{

}
