package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.IPLModel;

public interface IPLRep extends JpaRepository<IPLModel, Integer> {
	
}
