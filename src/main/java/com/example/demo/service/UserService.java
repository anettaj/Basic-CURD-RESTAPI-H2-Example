package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;


@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public User save(User user) {
		User myUser=repo.save(user);
		if(myUser.getName().equals("salbin")) {
			System.out.println("sir is :)");
		}
		
		
		return myUser;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
