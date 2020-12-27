package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Pass_Request;
@Repository



public interface Pass_RequestRepo extends JpaRepository<Pass_Request, Integer>{

}
