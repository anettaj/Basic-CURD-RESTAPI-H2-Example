package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepo;


@Service

public class VehicleService {
	@Autowired
	VehicleRepo repo;
	
	public Vehicle save(Vehicle vehicle) {
		
		return repo.save(vehicle);

	}
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public void deleteVehicleById(int id) {
		// TODO Auto-generated method stub
		
	repo.deleteById(id);
	}
	

}
