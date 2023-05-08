package com.example.demo.Service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





import com.example.demo.model.LoanApplication;

import com.example.demo.model.Usermodel;

import com.example.demo.Repository.Repo1;

import com.example.demo.Repository.Repo2;





@Service

public class Serviceuser {

	

	@Autowired

	

	public Repo1 rep;

	

	public Usermodel adduser(Usermodel usmodel)

	{

	return rep.save(usmodel);

	}



	public Optional<Usermodel> getUsermodelbyId(int id)

	{

	return rep.findById(id);

	}

	public Usermodel update (Usermodel id)

	{

	return rep.saveAndFlush(id);

	}

	public void delete(int id)

	{

	rep.deleteById(id);

	}

	

public Repo2 repe;

	

	public LoanApplication adduser(LoanApplication usmodel)

	{

	return repe.save(usmodel);

	}



	public Optional<LoanApplication> getLoanApplicationbyId(int loanId)

	{

	return repe.findById(loanId);

	}

	public LoanApplication update (LoanApplication loanId)

	{

	return repe.saveAndFlush(loanId);

	}

	public void delete1(int loanId)

	{

	repe.deleteById(loanId);

	}

	

	







}
