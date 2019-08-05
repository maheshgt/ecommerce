package com.ecommerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerse.entity.AnalyticInfo;
import com.ecommerse.service.AnalyticService;

@RestController
@RequestMapping("/analytic")
public class AnalyticController {
	
	@Autowired
	AnalyticService analyticService;
	
	@GetMapping("/all")
	public ResponseEntity<List<AnalyticInfo>> getAll(){
		return new ResponseEntity<>(analyticService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("analytic/{id}")
	public ResponseEntity<AnalyticInfo> getById(int id){
		return new ResponseEntity<>(analyticService.getById(id), HttpStatus.OK);
	}
}
