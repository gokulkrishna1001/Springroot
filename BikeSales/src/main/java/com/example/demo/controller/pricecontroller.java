package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.bikeprice;
import com.example.demo.repository.pricerepo;
import com.example.demo.service.priceservice;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/price")
public class pricecontroller {
	@Autowired
	priceservice aser;
	
	@Autowired
	public pricerepo arepo;
	
	@Tag(name = "ADD PRICE DETAILS IN ONE TO MANY PROJECT",description = "save the details in database")
	@PostMapping("")
	public bikeprice saveDetails(@RequestBody bikeprice as)
	{
		return aser.saveDetails(as);
	}
	
	@Tag(name = "GET ALL PRICE DETAILS ",description = "provides all the price details ")
	@GetMapping("")
	public List<bikeprice> getDetails()
	{
		return aser.getDetails();
	}
	
	@Tag(name = "UPDATE PRICE DETAILS ",description = "update the price details")
	@PutMapping("")
	public bikeprice updateDetails(@RequestBody bikeprice aup)
	{
		return aser.updateDetails(aup);
	}
	
	@Tag(name = "DELETE ACCOUNT DETAILS IN ONE TO MANY PROJECT",description = "deletes  the  account details of given id")
	@DeleteMapping("/{id}")
	public String  deleteDetails(@PathVariable int id)
	{
		aser.deleteDetails(id);
		return "Deleted";
	}
	
	@Tag(name = "GET ALL PRICE DETAILS USING QUERY",description = "provides all the price details ")
	@GetMapping("/getallac")
	public List<bikeprice> getall()
	{
		return aser.getAllData();
	}
	
	@Tag(name = "GET  PRICE DETAILS BY ID USING QUERY",description = "provides the requested price details ")
	@GetMapping("/getbybid/{id}")
	public List<bikeprice> getbyid(@PathVariable int id)
	{
		return aser.getbyid(id);
	}
	
	@Tag(name = "GET ALL PRICE DETAILS USING BETWEEN QUERY",description = "provides all the price details between given ids")
	@GetMapping("/getacbybetween/{start}/{end}")
	public List<bikeprice> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return aser.between(start, end);
	}
	
	@Tag(name = "DELETE PRICE DETAILS USING QUERY",description = "delete the price details ")
	@DeleteMapping("/bybidname/{id}/{name}")
	public String deletebyid(@PathVariable int id,@PathVariable String name)
	{
		aser.deletebyidname(id, name);
		return "Deleted";
	}
	
	@Tag(name = "UPDATE PRICE DETAILS USING QUERY",description = "update the price details using query")
	@PutMapping("/putbybidname/{id}/{name}")
	public void updatebyidname(@PathVariable int id,@PathVariable String name)
	{
		 aser.updatebyidname(id,name);
	}
	//JPQL
			@Tag(name = "JPQL FOR PRICE",description = "get price details by bname")
			@GetMapping("/getbyjpql/{bname}")
			public List<bikeprice> getJPQLbname(@PathVariable String bname)
			{
				return arepo.getbybnamej(bname);
			}
			
			@Tag(name = "JPQL FOR PRICE",description = "get price details between pid s ")
			@GetMapping("/jpqlbetween/{start}/{end}")
			public List<bikeprice> jpqlbetween(@PathVariable int start,@PathVariable int end)
			{
				return arepo.betweenj(start, end);
			}
			
			@Tag(name = "JPQL FOR PRICE",description = "get price details using like keyword")
			@GetMapping("/jpqllike")
			public List<bikeprice> jpqllike()
			{
				return arepo.likej();
			}
			
			@Tag(name = "JPQL FOR PRICE",description = "update bname by using pid")
			@PutMapping("/jpqlupdate/{bname}/{id}")
			public String updateDetails(@PathVariable String bname,@PathVariable int id)
			{
				arepo.updatej(bname, id);
				return "Updated";
			}
			
			@Tag(name = "JPQL FOR PRICE",description = "delete PRICE detail by using pid")
			@DeleteMapping("/jpqldelete/{pid}")
			public String deletejp(@PathVariable int pid)
			{
				arepo.deletej(pid);
				return "Account deleted Successfully";
			}


}
