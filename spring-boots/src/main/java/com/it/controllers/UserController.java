package com.it.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.bean.User;
import com.it.bean.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/getuser")
	public @ResponseBody User getUser(){
		
		User user = userRepository.findByUserName("xxx");
		
		return user;
	} 
	@RequestMapping("/count")
	public @ResponseBody Long countUser(){
		
		Long count = userRepository.count();
		
		return count;
	} 
	@RequestMapping("/delete/{id}")
	public @ResponseBody Long delete(@PathVariable Long id){
		
		userRepository.delete((long)id);
		
		return (long) 1;
	} 
	@RequestMapping("/save")
	public @ResponseBody String saveUser(){
		
		User user = new User("111","222","333","444","sd555as",new Date());
		try {
			userRepository.save(user);
		} catch (Exception e) {
			return e.toString();
		}
		
		return "success";
	} 
    
}