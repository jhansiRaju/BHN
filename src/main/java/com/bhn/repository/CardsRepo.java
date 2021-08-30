package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.CardsModel;

public interface CardsRepo extends MongoRepository<CardsModel, Integer> {

}
