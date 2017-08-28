package com.it.bean;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 User findByUserName(String userName);
	 
	 List<User> findAll();
	 
}
