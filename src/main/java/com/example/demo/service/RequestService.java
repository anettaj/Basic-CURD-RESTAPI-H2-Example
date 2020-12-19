package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Request;
import com.example.demo.repository.RequestRepo;


@Service


public class RequestService {

	@Autowired
	RequestRepo repo;
	
	public Request save(Request request) {
		
		return repo.save(request);

	}
	public List<Request> getAllRequest() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public void deleteRequestById(int id) {
		// TODO Auto-generated method stub
		
	repo.deleteById(id);
	}
	

	
	
	
	
}
