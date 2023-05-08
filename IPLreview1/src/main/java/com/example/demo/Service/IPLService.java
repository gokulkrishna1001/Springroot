package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	public List<IPLModel> sortDesc(String name) 
	{	
		return irep.findAll(Sort.by(name).descending());
	}
	public List<IPLModel> sortAsc(String name)
	{
		return irep.findAll(Sort.by(name).ascending());
	}
	public List<IPLModel> pagination(int num, int size) {
		// TODO Auto-generated method stub
		Page<IPLModel> p=irep.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<IPLModel> pagesorting(int num, int size, String name) 
	{
		Page<IPLModel> p=irep.findAll(PageRequest.of(num, size,Sort.by(name).descending()));
		return p.getContent();
	}
	
}
