package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class bikedel {
	
	@Id
	private int id;
	private String model;
	private String fueltype;
	private String engine;
	private String transmission;
	private String cc;
	private String hp;
	private String topspeed;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<bikeprice> abc;
	
	
	public List<bikeprice> getAbc() {
		return abc;
	}
	public void setAbc(List<bikeprice> abc) {
		this.abc = abc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(String topspeed) {
		this.topspeed =topspeed;
	}

}