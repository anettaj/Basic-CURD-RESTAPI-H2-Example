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

import com.example.demo.entity.CurrentInfo;
import com.example.demo.service.CurrentInfoService;

@RestController
@RequestMapping("currentinfo")


public class CurrentInfoController {

	@Autowired
	CurrentInfoService service;
	
	@GetMapping
	public List<CurrentInfo> getCurrentInfo() {

		return service.getAllCurrentInfo();
	}
	
	@PostMapping
	public CurrentInfo addCurrentInfo(@RequestBody CurrentInfo currentInfo) {

		
		return service.save(currentInfo);

	}
	
	@DeleteMapping
	public String delete() {
		
		return "test";
	}
	
	@DeleteMapping("/{id}")
    public String deleteCurrentInfoById(@PathVariable("id") int id) {
        service.deleteCurrentInfoById(id);
        return "";
    }
}
