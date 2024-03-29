package com.ecommerse.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerse.entity.Categories;


@Repository
public interface CategoryRepo extends JpaRepository<Categories, Integer>{

	Categories findByCategoryId(int id);

}
