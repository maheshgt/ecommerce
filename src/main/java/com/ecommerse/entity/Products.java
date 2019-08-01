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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Products {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private float productPrice;
	@Column(columnDefinition = "int default 0")
	private int count;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category_Id")
	private Categories categories;
}
