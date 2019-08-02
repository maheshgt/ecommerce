package com.ecommerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerse.entity.Products;
import com.ecommerse.service.ProductService;

@Controller
@RequestMapping("/category/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Products>> getAll(){
		return new ResponseEntity<List<Products>>(productService.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Products> getById(@PathVariable int id){
		return new ResponseEntity<Products>(productService.getById(id),HttpStatus.OK);
	}
}
