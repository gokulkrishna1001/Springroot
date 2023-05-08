package com.example.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;
import com.example.demo.Service.Login_AService;

@RestController
public class LoginController 
{
	@Autowired
	public Login_AService lser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String userpass = loginDataMap.get("userpass");
		String result = lser.loginCheckData(username, userpass);
		return result;
	}
	@PostMapping("/adduser")
	public LoginModel addDetails(@RequestBody LoginModel lm)
	{
		return lser.addUser(lm);
	}
}