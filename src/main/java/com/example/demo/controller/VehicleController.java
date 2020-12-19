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

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("vehicle")

public class VehicleController {
	@Autowired
	VehicleService service;
	
	@GetMapping
	public List<Vehicle> getVehicle() {

		return service.getAllVehicle();
	}
	
	@PostMapping
	public Vehicle addVehicle(@RequestBody Vehicle vehicle ) {

		
		return service.save(vehicle);

	}
	
	@DeleteMapping
	public String delete() {
		
		return "test";
	}
	
	@DeleteMapping("/{id}")
    public String deleteVehicleById(@PathVariable("id") int id) {
        service.deleteVehicleById(id);
        return "";
    }
}