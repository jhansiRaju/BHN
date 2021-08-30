package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.ItemModel;
import com.bhn.repository.ItemRepo;

@RestController
public class ItemController {
@Autowired
	private ItemRepo repository;
	
@GetMapping("/findItem")
private List<ItemModel> getDetails()
{
	return repository.findAll();
}
}
