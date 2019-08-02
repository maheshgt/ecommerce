package com.ecommerse.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.ecommerse.entity.Categories;

public interface CategoryService {

	List<Categories> getAll();

	Categories getById(int id);

}
