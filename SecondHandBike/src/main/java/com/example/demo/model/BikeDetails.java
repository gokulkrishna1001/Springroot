package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BikeDetails {
	
	@Id
	private int sno;
	private int price;
	private int year;
	private int kms;
	private String condition;
	private int owner;
	private String negotiable;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getNegotiable() {
		return negotiable;
	}
	public void setNegotiable(String negotiable) {
		this.negotiable = negotiable;
	}
	

}
