package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.ReturnAddressModel;

public interface ReturnAddressRepo extends MongoRepository<ReturnAddressModel, Integer> {

}
