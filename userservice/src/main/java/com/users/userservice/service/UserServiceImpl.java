package com.users.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.userservice.dao.UserDao;
import com.users.userservice.entity.User;
@Service

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	


	@Override
	public List<User> searchUser(String userName) {
		// TODO Auto-generated method stub
		return userdao.searchUser(userName);
	}

	@Override
	public boolean validateUser(String userName, String pwd, String role){
		// TODO Auto-generated method stub
		userdao.validateUser(userName,pwd,role);
		
		return true;
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userdao.getAllUsers();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userdao.addUser(user);
	}

	@Override
	public boolean updatePassword(String userName, String oldpwd, String newpwd) {
		// TODO Auto-generated method stub
		return userdao.updatePassword( userName,  oldpwd,  newpwd);
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return userdao.deleteUser(id);
	}

}
