package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BikeModel;

import jakarta.transaction.Transactional;

public interface modrepo extends JpaRepository<BikeModel, Integer> {

	
	@Query(value = "select * from Customer",nativeQuery = true)
	public List<BikeModel> getAllData();
	
	@Query(value = "select * from customer where id=:id",nativeQuery = true)
	public List<BikeModel> bycid(@Param("id") int id);
	
	@Query(value="select * from customer where cid between :start and :end",nativeQuery=true)
	public List<BikeModel> startend(@Param("start") int start,@Param("end") int end);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update customer set cname=:name where id=:id",nativeQuery = true)
	public void updatebyidname(@Param("name")String name,@Param("id") int id);

}
