package com.ecommerse.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="analytics")
@Setter
@Getter
public class AnalyticInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int analyticId;
	//@Column(columnDefinition = "int default 0")
	private int productCount;
	
	//@Column(columnDefinition = "int default 0")
	private Integer categoryCount=null;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserId")
	//@Column(columnDefinition = "int default 0")
	UserEntity userEntity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CategoryId")
	//@Column(columnDefinition = "int default 0")
	Categories categories;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ProductId")
	//@Column(columnDefinition = "int default 0")
	Products products;
}
