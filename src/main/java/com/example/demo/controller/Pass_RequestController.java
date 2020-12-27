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

import com.example.demo.entity.Pass_Request;
import com.example.demo.service.Pass_RequestService;

@RestController
@RequestMapping("request")


public class Pass_RequestController {
	
	@Autowired
	Pass_RequestService service;
	
	@GetMapping
	public List<Pass_Request> getRequest() {
	
		return service.getAllRequest();
	//	return new Request(2, "APPROVED", 22, 23, 35, 33);
	}
	
	@PostMapping
	public Pass_Request addRequest(@RequestBody Pass_Request request) {

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
