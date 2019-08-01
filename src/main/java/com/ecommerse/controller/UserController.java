package com.ecommerse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerse.entity.UserDto;
import com.ecommerse.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/rigistration")
	public ResponseEntity<String> userRegistration(@RequestBody UserDto userDto){
		
		return new ResponseEntity<>(userService.userRegistration(userDto),HttpStatus.OK );
	}
	
	@GetMapping("/login/{name}/{pwd}")
	public ResponseEntity<String> userLogin(@PathVariable String name, @PathVariable String pwd){
		
		return new ResponseEntity<>(userService.userLogin(name,pwd),HttpStatus.OK );
	}
}
