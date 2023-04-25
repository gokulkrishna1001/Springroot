package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.IPLModel;
import com.example.demo.Repository.IPLRep;

@Service
public class IPLService {

	@Autowired
	public IPLRep irep;
	
	//posting the information
	public IPLModel saveInfo(IPLModel im)
	{
		return irep.save(im);
	}
	
	//getting the information
	public List<IPLModel> getInfo()
	{
		return irep.findAll();
	}
	
	//updating the information
	public IPLModel updateInfo(IPLModel iu)
	{
		return irep.saveAndFlush(iu);
	}
	
	//delete the information
	public String deleteInfo(int id)
	{
		irep.deleteById(id);
		return "Deleted";
	}
	
}
