package com.ecommerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerse.entity.Categories;
import com.ecommerse.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Categories>> getAll(){
		return new ResponseEntity<List<Categories>>(categoryService.getAll(),HttpStatus.OK);
	}
	
	
	@GetMapping("/category/{id}")
	public ResponseEntity<Categories> getById(@PathVariable int id){
		return new ResponseEntity<Categories>(categoryService.getById(id),HttpStatus.OK);
	}
	
}
