package com.ecommerse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
@Setter
@Getter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@NotNull
	@Column(name="name")
	private String userName;
	@NotNull
	@Size(min = 4)
	@Column(name="password")
	private String userPassword;
	@NotNull
	@Column(name="gender")
	private String userGender;
	@NotNull
	@Email
	@Column(name="email")
	private String userEmail;
	@NotNull
	@Column(name="mobile")
	private Long userMobile;
	@NotNull
	@Column(name="city")
	private String userCity;

	public UserEntity() {

	}

	public UserEntity(int userId, @NotNull String userName, @NotNull @Size(min = 4) String userPassword,
			@NotNull String userGender, @NotNull @Email String userEmail, @NotNull Long userMobile, @NotNull String userCity) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userCity = userCity;
	}

}
