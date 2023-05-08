package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BikeModel;
import com.example.demo.repository.modrepo;

@Service
public class modservice {

		@Autowired
		 modrepo crep;
		
		public BikeModel saveDetails(BikeModel cs)
		{
			return crep.save(cs);
		}
		
		public List<BikeModel> getDetails()
		{
			return crep.findAll();
		}
		
		public BikeModel updateDetails(BikeModel cup)
		{
			return crep.saveAndFlush(cup);
		}
		
		public List<BikeModel> getAllData()
		{
			return crep.getAllData();
		}
		
		public List<BikeModel> getbyid(int id)
		{
			return crep.bycid(id);
		}
		
		
		public List<BikeModel> between(int start,int end)
		{
			return crep.startend(start,end);
		}
		
		public void updatebyidname(String name,int id)
		{
			 crep.updatebyidname(name,id);
		}
	}
