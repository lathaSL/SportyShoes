package com.users.userservice.dao;

import java.util.List;

import com.users.userservice.entity.User;

public interface UserDao {
	public List<User> searchUser(String userName);
	public List<User> getAllUsers();
	public boolean addUser(User user);
	public boolean updatePassword(String userName, String oldpwd, String newpwd);
	public boolean deleteUser(Long id);
	public User validateUser(String userName, String pwd, String role);

}
