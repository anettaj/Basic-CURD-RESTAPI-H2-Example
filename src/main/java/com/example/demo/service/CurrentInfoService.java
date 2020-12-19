package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CurrentInfo;
import com.example.demo.repository.CurrentInfoRepo;


@Service

public class CurrentInfoService {

	@Autowired
	CurrentInfoRepo repo;
	
	public CurrentInfo save(CurrentInfo currentInfo) {
		
		return repo.save(currentInfo);

	}
	public List<CurrentInfo> getAllCurrentInfo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public void deleteCurrentInfoById(int id) {
		// TODO Auto-generated method stub
		
	repo.deleteById(id);
	}
	
	
}
