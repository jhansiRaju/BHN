package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.SupplementalsModel;

public interface SupplementalsRepo extends MongoRepository<SupplementalsModel, Integer> {

}
