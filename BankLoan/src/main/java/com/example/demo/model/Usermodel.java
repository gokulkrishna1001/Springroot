package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;



@Entity

@Table(name="Usermodel")

public class Usermodel {

	

	@Id



	private int Id;

	private String email;

	private String Username;

	private String MobileNumber;

	private String UserRole;

	public int getId() {

		return Id;

	}



	public void setId(int id) {

		Id = id;

	}



	public String getEmail() {

		return email;

	}



	public void setEmail(String email) {

		this.email = email;

	}



	public String getUsername() {

		return Username;

	}



	public void setUsername(String username) {

		Username = username;

	}



	public String getMobileNumber() {

		return MobileNumber;

	}



	public void setMobileNumber(String mobileNumber) {

		MobileNumber = mobileNumber;

	}



	public String getUserRole() {

		return UserRole;

	}



	public void setUserRole(String userRole) {

		UserRole = userRole;

	}

	

	



}
