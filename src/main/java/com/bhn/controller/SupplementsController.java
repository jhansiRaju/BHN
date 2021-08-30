package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.SupplementalsModel;
import com.bhn.repository.SupplementalsRepo;

@RestController
public class SupplementsController {
@Autowired
	private SupplementalsRepo repository;

@GetMapping("/findSupplementals")
private List<SupplementalsModel> getDetails()
{
	return repository.findAll();
}
}
