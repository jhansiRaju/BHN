package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.CardsModel;
import com.bhn.repository.CardsRepo;

@RestController
public class CardsController {
	@Autowired
private CardsRepo repository;
@GetMapping("/findCards")
	private List<CardsModel> getDetails()
	{
		return repository.findAll();
	}
}
