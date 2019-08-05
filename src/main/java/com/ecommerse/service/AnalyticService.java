package com.ecommerse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerse.entity.AnalyticInfo;

@Service
public interface AnalyticService {

	List<AnalyticInfo> getAll();

	AnalyticInfo getById(int id);

}
