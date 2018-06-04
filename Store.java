package com.model;

public class Store {
	private int store_id;
	private String location;
	private String address;
	private int phone;
	private String email;
	public Store(int store_id,String location,String address,int phone,String email){
	this.store_id = store_id;
	this.location = location;
	this.address = address;
	this.phone = phone;
	this.email = email;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return "Store [store_id=" + store_id + ", location=" + location + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
