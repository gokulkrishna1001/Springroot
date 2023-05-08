package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.example.demo.Model.bikedel;
import com.example.demo.repository.delrepo;
import com.example.demo.service.delservice;
@RestController
@RequestMapping("/detail")
public class delcontroller {
	@Autowired
	delservice cser;
	
	@Autowired
	public delrepo crepo;
	
	@Tag(name = "Add Car Details In The ONE TO MANY PROJECT",description = "Add the details to the database")
	@PostMapping("")
	public bikedel saveDetails(@RequestBody bikedel cs)
	{
		return cser.saveDetails(cs);
	}
	
	@Tag(name = "GET ALL  CAR DETAILS IN THE ONE TO MANY PROJECT",description = "provides the details in the database")
	@GetMapping("")
	public List<bikedel> getDetails()
	{
		return cser.getDetails();
	}
	
	@Tag(name = "UPDATE CAR DETAILS IN THE ONE TO MANY PROJECT",description = "update the details in the database")
	@PutMapping("")
	public bikedel updateDetails(@RequestBody bikedel cup)
	{
		return cser.updateDetails(cup);
	}
	
	@Tag(name = "GET ALL CAR DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/getall")
	public List<bikedel> getall()
	{
		return cser.getAllData();
	}
	
	@Tag(name = "GET CAR DETAILS BY ID USING QUERY",description = "provides the details of requested table using id")
	@GetMapping("/getbyid/{id}")
	public List<bikedel> getbyid(@PathVariable int id)
	{
		return cser.getbyid(id);
	}
	
	@Tag(name = "GET CAR DETAILS USING BETWEEN QUERY ",description = "provides the details of requested table between the given ids using query")
	@GetMapping("/getbybetween/{start}/{end}")
	public List<bikedel> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return cser.between(start, end);
	}
	
	@Tag(name = "UPDATE CAR DETAILS USING QUERY",description = "update the details of requested table using query")
	@PutMapping("/putbyidname/{name}/{id}")
	public void updatebyidname(@PathVariable String name,@PathVariable int id)
	{
		cser.updatebyidname(name,id);
	}

	//JPQL
		@Tag(name = "JPQL",description = "get car details by cname")
		@GetMapping("/getbyjpql/{cname}")
		public List<bikedel> getJPQLbname(@PathVariable("cname") String cname)
		{
			return crepo.getbyjc(cname);
		}
		
		@Tag(name = "JPQL",description = "get car details between pid s ")
		@GetMapping("/jpqlbetween/{start}/{end}")
		public List<bikedel> jpqlbetween(@PathVariable("start") int start,@PathVariable("end") int end)
		{
			return crepo.betweenjc(start, end);
		}
		
		@Tag(name = "JPQL",description = "get car details using like keyword")
		@GetMapping("/jpqllike")
		public List<bikedel> jpqllike()
		{
			return crepo.likejc();
		}
		
		@Tag(name = "JPQL",description = "update cname by using pid")
		@PutMapping("/jpqlupdate/{cname}/{id}")
		public String updateDetails(@PathVariable("cname") String cname,@PathVariable("id") int id)
		{
			crepo.updatejc(cname, id);
			return "Updated";
		}

}
