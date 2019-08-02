package com.ecommerse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerse.entity.AnalyticInfo;

public interface AnalyticRepo extends JpaRepository<AnalyticInfo, Integer>{
	
	@Query("select a analytics where a.product-Id=:id")
	public AnalyticInfo findByProductId(@Param("id") int id) ;

}
