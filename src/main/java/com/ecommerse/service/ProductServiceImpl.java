package com.ecommerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.Products;
import com.ecommerse.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepo productRepo;
	@Override
	public List<Products> getAll() {
		return productRepo.findAll();
	}

}
