package com.ecommerse.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerse.entity.AnalyticInfo;

@Repository
public interface AnalyticRepo extends JpaRepository<AnalyticInfo, Integer> {
	
	@Transactional
	@Query(value="select * from ecommerse.analytics where product_id=?1", nativeQuery = true)
	public AnalyticInfo findByProductId(int id);
	
	@Transactional
	@Query(value="select * from ecommerse.analytics where category_id=?1", nativeQuery = true)
	public AnalyticInfo findByCategoryId(int id);
	
	@Query(value="select * from ecommerse.analytics",nativeQuery = true)
	public List<AnalyticInfo> findAll();

}
