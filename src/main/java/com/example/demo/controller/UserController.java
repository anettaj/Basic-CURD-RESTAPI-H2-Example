package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping
	public List<User> getUser() {

		return service.getAllUser();

	}

	@PostMapping
	public User addUser() {

		User user = new User();
		user.setName("Salbin");
		user.setId(1);
		user.setAge(15);
		
		return service.save(user);

	}
}
