
package com.ecommerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.AnalyticInfo;
import com.ecommerse.entity.Categories;
import com.ecommerse.entity.Products;
import com.ecommerse.repo.AnalyticRepo;
import com.ecommerse.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	AnalyticRepo analyticRepo;

	@Override
	public List<Products> getAll() {
		return productRepo.findAll();
	}

	@Override
	public Products getById(int id) {
		Products pro = productRepo.findByProductId(id);
		Categories id1 = pro.getCategories();	
		AnalyticInfo ai = analyticRepo.findByProductId(id);
		int count = ai.getProductCount();
		ai.setProductCount(++count);
		ai.setProducts(pro);
		ai.setCategories(id1);
		analyticRepo.save(ai);	
		return pro;

	}

}
