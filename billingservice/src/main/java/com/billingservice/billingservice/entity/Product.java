package com.billingservice.billingservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private String category;
	private int size;
	private double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Product() {
		super();
	}
	public Product(Long productId, String productName, String category, int size,double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.size = size;
		this.price=price;
	}
	public Product(String productName, String category, int size,double price) {
		super();
		this.productName = productName;
		this.category = category;
		this.size = size;
		this.price=price;

	}
	
	
	

}
