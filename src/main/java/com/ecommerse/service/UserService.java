package com.ecommerse.service;

import com.ecommerse.entity.UserDto;

public interface UserService {

	String userRegistration(UserDto userDto);

	String userLogin(String name, String pwd);

}
