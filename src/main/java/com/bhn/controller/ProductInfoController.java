package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.ProductInfoModel;
import com.bhn.repository.ProductInfoRepo;

@RestController
public class ProductInfoController {
@Autowired
	private ProductInfoRepo repository;
@GetMapping("/findProductInfo")
private List<ProductInfoModel> getDetails()
{
	return repository.findAll();
}
}
