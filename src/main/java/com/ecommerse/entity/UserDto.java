package com.ecommerse.entity;

import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class UserDto {

	private int userId;

	private String userName;

	private String userPassword;

	private String userGender;

	private String userEmail;

	private Long userMobile;

	private String userCity;

	public UserDto(int userId, String userName, String userPassword, String userGender, String userEmail,
			Long userMobile, String userCity) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userCity = userCity;
	}

	public UserDto() {

	}

}
