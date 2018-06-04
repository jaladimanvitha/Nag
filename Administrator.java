package com.model;

public class Administrator {
private int CIN;
private String password;
private String name;
private int phone;
private String email;
public Administrator(int CIN,String password,String name,int phone,String email){
this.CIN = CIN;
this.password = password;
this.name = name;
this.phone = phone;
this.email = email;
}
public int getCIN() {
	return CIN;
}
public void setCIN(int cIN) {
	CIN = cIN;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Administrator [CIN=" + CIN + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email="
			+ email + "]";
}


   
}
