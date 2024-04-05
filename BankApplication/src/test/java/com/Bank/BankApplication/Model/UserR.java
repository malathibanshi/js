package com.Bank.BankApplication.Model;

import jakarta.persistence.*;

@Entity

public class UserR {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)	
private int id;
private String uname;
private int upn;
private String uemail;
private String upass;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getUpn() {
	return upn;
}
public void setUpn(int upn) {
	this.upn = upn;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public UserR(int id, String uname, int upn, String uemail, String upass) {
	super();
	this.id = id;
	this.uname = uname;
	this.upn = upn;
	this.uemail = uemail;
	this.upass = upass;
}
public UserR() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "UserR [id=" + id + ", uname=" + uname + ", upn=" + upn + ", uemail=" + uemail + ", upass=" + upass + "]";
}
}

	