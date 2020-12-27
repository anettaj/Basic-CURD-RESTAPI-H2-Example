package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pass_Request;
import com.example.demo.repository.Pass_RequestRepo;


@Service


public class Pass_RequestService {

	@Autowired
	Pass_RequestRepo repo;
	
	public Pass_Request save(Pass_Request request) {
		
		return repo.save(request);

	}
	public List<Pass_Request> getAllRequest() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public void deleteRequestById(int id) {
		// TODO Auto-generated method stub
		
	repo.deleteById(id);
	}
	

	
	
	
	
}
