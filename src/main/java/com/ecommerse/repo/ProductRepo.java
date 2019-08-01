package com.ecommerse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerse.entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
