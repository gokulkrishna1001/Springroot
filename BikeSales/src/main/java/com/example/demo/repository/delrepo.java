package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.bikedel;

import jakarta.transaction.Transactional;

public interface delrepo extends JpaRepository<bikedel, Integer> {
public List<bikedel> findBymodel(String model);
	
	@Query(value = "select * from bikedel",nativeQuery = true)
	public List<bikedel> getAllData();
	
	@Query(value = "select * from bikedel where id=:id",nativeQuery = true)
	public List<bikedel> bycid(@Param("id") int id);
	
	@Query(value="select * from bikedel where id between :start and :end",nativeQuery=true)
	public List<bikedel> startend(@Param("start") int start,@Param("end") int end);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update bikedel set model=:name where id=:id",nativeQuery = true)
	public void updatebyidname(@Param("name") String name,@Param("id") int id);
	
	

//JPQL

	@Query("select s from bikedel s where s.model=?1")
	public List<bikedel> getbyjc(String cname);
	
	@Query("select s from bikedel s where s.id between ?1 and ?2")
	public List<bikedel> betweenjc(int start,int end);
	
	@Query(value="select s from bikedel s where s.model like 'B%'")
	public List<bikedel> likejc();
	
	@Modifying
	@Transactional
	@Query(value="update bikedel s set s.model=?1 where s.id=?2")
	public void updatejc(String cname,int id);
}
