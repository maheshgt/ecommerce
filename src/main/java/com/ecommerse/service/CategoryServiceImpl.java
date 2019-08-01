package com.ecommerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.Categories;
import com.ecommerse.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepo categoryRepo;
	@Override
	public List<Categories> getAll() {
		return categoryRepo.findAll();
	}

}
