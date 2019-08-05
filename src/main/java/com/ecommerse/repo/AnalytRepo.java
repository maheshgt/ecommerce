package com.ecommerse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerse.entity.AnalyticInfo;

@Repository
public interface AnalytRepo extends JpaRepository<AnalyticInfo, Integer>{

}
