package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.bikeprice;

import jakarta.transaction.Transactional;

public interface pricerepo extends JpaRepository<bikeprice, Integer> {
	@Query(value = "select * from bikeprice",nativeQuery = true)
	public List<bikeprice> getAllData();
	
	@Query(value = "select * from bikeprice where pid=:id",nativeQuery = true)
	public List<bikeprice> bybid(@Param("id") int id);
	
	@Query(value="select * from bikeprice where pid between :start and :end",nativeQuery=true)
	public List<bikeprice> startend(@Param("start") int start,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value = "delete from bikeprice where pid=?1 and price=?2",nativeQuery = true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);
	
	@Modifying
	@Transactional
	@Query(value = "update bikeprice set pid=:id where price=:name",nativeQuery = true)
	public void updatebyidname(@Param("id") int id,@Param("name") String name);


//JPQL
	@Query("select s from bikeprice s where s.owners=?1")
	public List<bikeprice> getbybnamej(@Param("owners")String owners);
	
	@Query("select s from bikeprice s where s.pid between ?1 and ?2")
	public List<bikeprice> betweenj(@Param("start")int start,@Param("end")int end);
	
	@Query(value="select s from bikeprice s where s.owners like 'S%'")
	public List<bikeprice> likej();
	
	@Modifying
	@Transactional
	@Query(value="update bikeprice s set s.owners=?1 where s.pid=?2")
	public void updatej(@Param("owners")String owners,@Param("id")int id);
	
	
	@Modifying
	@Transactional
	@Query(value = "delete from bikeprice s where s.pid=?1")
	public void deletej(int pid);
}
