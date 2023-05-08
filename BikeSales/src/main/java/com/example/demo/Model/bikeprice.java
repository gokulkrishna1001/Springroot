package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class bikeprice {
	
	@Id
	private int pid;
	private String price;
	private String seat;
	private String mileage;
	private String pdate;;
	private String negotiation;
	private String owners;
	
	private String kms;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getNegotiation() {
		return negotiation;
	}
	public void setNegotiation(String negotiation) {
		this.negotiation = negotiation;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getKms() {
		return kms;
	}
	public void setKms(String kms) {
		this.kms= kms;
	}

}