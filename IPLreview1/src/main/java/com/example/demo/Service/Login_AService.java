package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginRepo;

@Service
public class Login_AService 
{
	@Autowired
	public LoginRepo lrepo;
	public String loginCheckData(String username,String userpass)
	{
		LoginModel user = lrepo.findByusername(username);
		if(user == null)
		{
			return "No User Found Please Try Again!!!!";
		}
		else
		{
			if(user.getUserpass().equals(userpass))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel lm)
	{
		return lrepo.save(lm);
	}
}
