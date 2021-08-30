package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.ProductInfoModel;

public interface ProductInfoRepo extends MongoRepository<ProductInfoModel, Integer> {

}
