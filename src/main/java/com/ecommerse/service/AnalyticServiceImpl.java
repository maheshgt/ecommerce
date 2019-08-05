package com.ecommerse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.AnalyticInfo;
import com.ecommerse.repo.AnalytRepo;
import com.ecommerse.repo.AnalyticRepo;

@Service
public class AnalyticServiceImpl implements AnalyticService{
	
	@Autowired
	AnalytRepo analytRepo;
	
	@Autowired
	AnalyticRepo analyticRepo;
	
	@Override
	public List<AnalyticInfo> getAll() {
		return analytRepo.findAll();
	}

	@Override
	public AnalyticInfo getById(int id) {
		return analyticRepo.findByProductId(id);
	}

}
