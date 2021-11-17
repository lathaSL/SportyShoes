package com.users.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.users.userservice.entity.User;
public interface UserService {
	public List<User> searchUser(String userName);
	public List<User> getAllUsers();
	public boolean addUser(User user);
	public boolean updatePassword(String userName, String oldpwd, String newpwd);
	public boolean deleteUser(Long id);
	public boolean validateUser(String userName, String pwd, String role);
	

}
