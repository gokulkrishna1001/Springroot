package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanApplication;

public interface Repo2 extends JpaRepository<LoanApplication,Integer>{

}