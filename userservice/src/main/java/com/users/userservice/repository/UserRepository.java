package com.users.userservice.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.userservice.entity.User;

	@Repository
	public interface UserRepository extends JpaRepository<User,Long> {
		
		 Optional<User> findByUserNameAndPasswordAndRole(String username, String password, String role);
		
		@Query("select u from User u where u.userName = ?1 and u.password=?2 and role ='admin'")
		 User findByUserNameAndPassword(String username, String password);
		
		Optional<List<User>> findByUserNameAndRole(String username, String role);
		
		List<User> findAllByRole(String role);

		
		
		
}
