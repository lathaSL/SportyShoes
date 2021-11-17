package com.users.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	 
	private String userName;
	
	private String contactNo;
	private String email;
	private String address;
	private String city;
	private String password;
	private String role;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(Long userId, String userName, String contactNo, String email, String address, String city,
			String password, String role) {
		this.userId = userId;
		this.userName = userName;
		this.contactNo = contactNo;
		this.email = email;
		this.address = address;
		this.city = city;
		this.password = password;
		this.role = role;
	}
	
	public User() {
		super();

	}
	public User(String userName, String contactNo, String email, String address, String city, String password,
			String role) {
		this.userName = userName;
		this.contactNo = contactNo;
		this.email = email;
		this.address = address;
		this.city = city;
		this.password = password;
		this.role = role;
	}
	
}
