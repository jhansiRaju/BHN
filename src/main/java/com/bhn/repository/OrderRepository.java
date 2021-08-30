package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.OrderModel;

public interface OrderRepository extends MongoRepository<OrderModel, Integer>{

}
