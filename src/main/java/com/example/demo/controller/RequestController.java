package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Request;
import com.example.demo.service.RequestService;

@RestController
@RequestMapping("request")


public class RequestController {
	
	@Autowired
	RequestService service;
	
	@GetMapping
	public List<Request> getRequest() {
	
		return service.getAllRequest();
	//	return new Request(2, "APPROVED", 22, 23, 35, 33);
	}
	
	@PostMapping
	public Request addRequest(@RequestBody Request request) {

		return service.save(request);

	}
	
	@DeleteMapping
	public String delete() {
		
		return "test";
	}
	
	@DeleteMapping("/{id}")
    public String deleteRequestById(@PathVariable("id") int id) {
        service.deleteRequestById(id);
        return "";
    }
}
