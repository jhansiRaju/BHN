package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.ItemModel;

public interface ItemRepo extends MongoRepository<ItemModel, Integer> {

}
