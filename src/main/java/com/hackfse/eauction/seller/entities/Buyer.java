package com.hackfse.eauction.seller.entities;

import java.util.List;



public class Buyer {

	private Integer id;

	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private int pin;
	
	private int phone;
	
	private String email;
	
	private List<Bid> buyProductRel;

	
	
	
	public Buyer(Integer id, String firstName, String lastName, String address, String city, String state, int pin,
			int phone, String email, List<Bid> buyProductRel) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.phone = phone;
		this.email = email;
		this.buyProductRel = buyProductRel;
	}

	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
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

	public List<Bid> getBuyProductRel() {
		return buyProductRel;
	}

	public void setBuyProductRel(List<Bid> buyProductRel) {
		this.buyProductRel = buyProductRel;
	}

		
}
