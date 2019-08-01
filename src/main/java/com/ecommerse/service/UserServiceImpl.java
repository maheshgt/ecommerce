package com.ecommerse.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerse.entity.UserDto;
import com.ecommerse.entity.UserEntity;
import com.ecommerse.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public String userRegistration(UserDto userDto) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		
		 if(userRepo.save(userEntity)!=null)
			 return "User Registered Successfully...";
		 else
			 return "Please try after some time...";
		 
	}

	@Override
	public String userLogin(String name, String pwd) {
		
		UserEntity user = userRepo.findByUserName(name);
		
		if(name.equals(user.getUserName()) && pwd.equals(user.getUserPassword())) {
			return "Login Successfully....";
		}
		else {
			return "Login Unsuccessful...Invalid Credentitals..";
		}
		
	}
	
}
