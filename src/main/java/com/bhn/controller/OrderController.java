package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.OrderModel;
import com.bhn.repository.OrderRepository;

@RestController
public class OrderController {
	@Autowired
	private OrderRepository repository;
	
	@GetMapping("/findOrder")
	private List<OrderModel> getDetails()
	{
		return repository.findAll();
	}
}
