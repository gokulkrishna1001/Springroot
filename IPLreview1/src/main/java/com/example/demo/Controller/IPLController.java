package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.IPLModel;
import com.example.demo.Service.IPLService;

@RestController
public class IPLController {
	
	@Autowired
	public IPLService iser;
	@PostMapping("/saveIPL")
	public IPLModel addDetails(@RequestBody IPLModel ia)
	{
		return iser.saveInfo(ia);
	}
	@GetMapping("/getIPL")
	public List<IPLModel> getDetails()
	{
		return iser.getInfo();
	}
	@PutMapping("/updateIPL")
	public IPLModel updateDetails(@RequestBody IPLModel id)
	{
		return iser.saveInfo(id);
	}
	@DeleteMapping("/deleteIPL/{pid}")
	public String deleteDetails(@PathVariable("pid") int playerid)
	{
		iser.deleteInfo(playerid);
		return "Player Id "+playerid+" is deleted";
	}
	
	//delete by using @RequestParam\
	@DeleteMapping("/deletebyReq")
	public String deletebyRequestParam(@RequestParam("playerId") int playerId)
	{
		iser.deleteInfo(playerId);
		return "Player Id "+playerId+" is deleted";
	}	
	@GetMapping("/sortdesc/{name}")
	public List<IPLModel>sortD(@PathVariable("name")String name)
	{
		return iser.sortDesc(name);
	}
	@GetMapping("/sortasc/{name}")
	public List<IPLModel>sortA(@PathVariable("name")String name)
	{
		return iser.sortAsc(name);
	}
	@GetMapping("/pagination/{pnum}/{psize}")
	public List<IPLModel> pagination(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return iser.pagination(num,size);
	}
	 
	@GetMapping("/paginationsorting/{pnum}/{psize}/{name}")
	public List<IPLModel> pagesorting(@PathVariable("pnum")int num,@PathVariable("psize")int size,@PathVariable("name")String name)
	{
		return iser.pagesorting(num,size,name);
	}
}