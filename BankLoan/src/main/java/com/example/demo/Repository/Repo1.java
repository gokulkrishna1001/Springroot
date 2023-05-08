package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usermodel;

public interface Repo1 extends JpaRepository<Usermodel,Integer>{
	
	

}