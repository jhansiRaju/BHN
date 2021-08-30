package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.ShippingAddressModel;
import com.bhn.repository.ShippingAddressRepo;

@RestController
public class ShippingAddressController {
	@Autowired
private ShippingAddressRepo repo;
	
	@GetMapping("/findAddess")
	public List<ShippingAddressModel> getAddress()
	{
		return repo.findAll();
		
	}

}
