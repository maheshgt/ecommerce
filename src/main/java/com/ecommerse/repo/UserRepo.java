package com.ecommerse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerse.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{

	public UserEntity findByUserName(String name);

	


}
