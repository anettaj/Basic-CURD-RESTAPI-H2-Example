package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vehicle;
@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{

}