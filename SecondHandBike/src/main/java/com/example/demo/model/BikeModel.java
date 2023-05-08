package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class BikeModel {
	@Id
	private int id;
	private String Brand;
	private String Model;
	private String Category;
	private String Colour;
	private int Mileage;
	private int Cc;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<BikeDetails> abc;
	
	
	
	public List<BikeDetails> getAbc() {
		return abc;
	}
	public void setAbc(List<BikeDetails> abc) {
		this.abc = abc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public int getCc() {
		return Cc;
	}
	public void setCc(int cc) {
		Cc = cc;
	}
}
