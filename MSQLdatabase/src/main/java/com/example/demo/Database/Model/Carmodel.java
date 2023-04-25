package com.example.demo.Database.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Porsche")
public class Carmodel {
	@Id
private int cid;
private string cname;
private int cnumber;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public string getCname() {
	return cname;
}
public void setCname(string cname) {
	this.cname = cname;
}
public int getCnumber() {
	return cnumber;
}
public void setCnumber(int cnumber) {
	this.cnumber = cnumber;
}

}
