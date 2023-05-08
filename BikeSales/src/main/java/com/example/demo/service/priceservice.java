package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.bikeprice;
import com.example.demo.repository.pricerepo;
@Service
public class priceservice {
	@Autowired
	pricerepo arep;
	
	public bikeprice saveDetails(bikeprice as)
	{
		return arep.save(as);
	}
	
	public List<bikeprice> getDetails()
	{
		return arep.findAll();
	}
	
	public bikeprice updateDetails(bikeprice aup)
	{
		return arep.saveAndFlush(aup);
	}
	
	public void deleteDetails(int id)
	{
		arep.deleteById(id);
	}
	
	public List<bikeprice> getAllData()
	{
		return arep.getAllData();
	}
	
	public List<bikeprice> getbyid(int id)
	{
		return arep.bybid(id);
	}
	
	
	public List<bikeprice> between(int start,int end)
	{
		return arep.startend(start,end);
	}
	
	public void deletebyidname(int id,String name)
	{
		arep.deletebyId(id, name);
	}
	
	public void updatebyidname(int id,String name)
	{
		 arep.updatebyidname(id,name);
	}


}
