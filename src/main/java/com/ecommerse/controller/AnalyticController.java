package com.ecommerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<AnalyticInfo> getAll(){
		return analyticService.getAll();
	}
	
	@GetMapping("analytic/{id}")
	public AnalyticInfo getById(int id){
		return analyticService.getById(id);
	}
}
