package com.bhn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bhn.model.ShippingAddressModel;

public interface ShippingAddressRepo extends MongoRepository<ShippingAddressModel, Integer> {

}
