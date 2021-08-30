package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.FullfillmentModel;
import com.bhn.repository.FullfillmentRepository;


@RestController
public class FullfillmentController {

	@Autowired
	private FullfillmentRepository repository;
	@GetMapping("/findDetails")
public List<FullfillmentModel> getDetails()
{
	return repository.findAll();
}
}
