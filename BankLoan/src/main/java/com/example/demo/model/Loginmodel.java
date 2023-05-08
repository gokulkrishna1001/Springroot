package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loginmodel {
@Id
private int lno;
private String Email;
private String Password;
public int getLno() {
return lno;
}
public void setLno(int lno) {
this.lno = lno;
}
public String getEmail() {
return Email;
}
public void setEmail(String email) {
Email = email;
}
public String getPassword() {
return Password;
}
public void setPassword(String password) {
Password =password;
}

}
