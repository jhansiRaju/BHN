package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.OrdercentralModel;
import com.bhn.repository.OrderCentralRepository;


@RestController
public class OrderCentralController {
	@Autowired
	private OrderCentralRepository repository;
	
	@GetMapping("/findOrderCentral")
	private List<OrdercentralModel> getDetails()
	{
		return repository.findAll();
	}
}

