package com.model;

public class Customer {
	private int CIN;
	private String password;
	private String user_name;
	private int phone;
	private String email;
	private int plan_id;
	public Customer(int CIN,String password,String user_name,int phone,String email,int plan_id){
	this.CIN = CIN;
	this.password = password;
	this.user_name = user_name;
	this.phone = phone;
	this.email = email;
	this.plan_id = plan_id;
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	@Override
	public String toString() {
		return "Customer [CIN=" + CIN + ", password=" + password + ", user_name=" + user_name + ", phone=" + phone
				+ ", email=" + email + ", plan_id=" + plan_id + "]";
	}
	
}
