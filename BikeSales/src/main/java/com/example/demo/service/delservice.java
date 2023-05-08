package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.bikedel;
import com.example.demo.repository.delrepo;
@Service

public class delservice {

		@Autowired
		delrepo crep;
		
		public bikedel saveDetails(bikedel cs)
		{
			return crep.save(cs);
		}
		
		public List<bikedel> getDetails()
		{
			return crep.findAll();
		}
		
		public bikedel updateDetails(bikedel cup)
		{
			return crep.saveAndFlush(cup);
		}
		
		public List<bikedel> getAllData()
		{
			return crep.getAllData();
		}
		
		public List<bikedel> getbyid(int id)
		{
			return crep.bycid(id);
		}
		
		
		public List<bikedel> between(int start,int end)
		{
			return crep.startend(start,end);
		}
		
		public void updatebyidname(String name,int id)
		{
			 crep.updatebyidname(name,id);
		}

}
