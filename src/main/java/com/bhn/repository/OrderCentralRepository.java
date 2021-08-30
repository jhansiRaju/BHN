package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.OrderModel;
import com.bhn.model.OrdercentralModel;

public interface OrderCentralRepository extends MongoRepository<OrdercentralModel, Integer> {

}
