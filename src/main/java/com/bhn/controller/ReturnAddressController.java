package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.ReturnAddressModel;
import com.bhn.repository.ReturnAddressRepo;

@RestController
public class ReturnAddressController {

	@Autowired
	private ReturnAddressRepo repository;
	@GetMapping("/findReturnAddress")
	public List<ReturnAddressModel> getDetails()
	{
		return repository.findAll();
	}
}
