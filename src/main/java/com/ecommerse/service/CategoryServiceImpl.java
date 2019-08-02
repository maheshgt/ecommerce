package com.ecommerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.AnalyticInfo;
import com.ecommerse.entity.Categories;
import com.ecommerse.repo.AnalyticRepo;
import com.ecommerse.repo.CategoryRepo;
import com.ecommerse.repo.UserRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	AnalyticRepo analyticRepo;
	
	@Autowired
	UserRepo userRepo;
	

	@Override
	public List<Categories> getAll() {
		return categoryRepo.findAll();
	}

	@Override
	public Categories getById(int id) {
		
		Categories cat = categoryRepo.findByCategoryId(id);
		AnalyticInfo ai = new AnalyticInfo();
		int count = ai.getCategoryCount();
		ai.setCategoryCount(++count);
		ai.setCategories(cat);
		analyticRepo.save(ai);	
		return cat;

	}

}
