package com.users.userservice.dao;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.users.userservice.entity.User;
import com.users.userservice.exception.UserNotFoundException;
import com.users.userservice.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {
	 @Autowired
	    private UserRepository userRepository;

	@Override
	public List<User> searchUser(String userName) {
		// TODO Auto-generated method stub
		
		return userRepository.findByUserNameAndRole(userName,"user").orElseThrow(() -> 
		new UserNotFoundException());
	}
//	private User populateUserData(final User user) {
//        User user= new User();
//        user.setId(user.getId());
//        customerData.setFirstName(customer.getFirstName());
//        customerData.setLastName(customer.getLastName());
//        customerData.setEmail(customer.getEmail());
//        return customerData;
//    }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAllByRole("user");
	}
	@Override
	public User validateUser(String userName, String pwd, String role){
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndPasswordAndRole(userName,pwd,role).orElseThrow(() -> 
		new UserNotFoundException());
	}
	@Override
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean updatePassword(String userName, String oldpwd, String newpwd){
		// TODO Auto-generated method stub
		User user;
		user=userRepository.findByUserNameAndPassword(userName,oldpwd);
		user.setPassword(newpwd);
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
