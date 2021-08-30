package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.BomInfoModel;
import com.bhn.repository.BomInfoRepo;

@RestController
public class BomInfoController {
	@Autowired
	private BomInfoRepo repository;
	
	@GetMapping("/findBomInfo")
	private List<BomInfoModel> getDetails()
	{
		return repository.findAll();
	}
}
