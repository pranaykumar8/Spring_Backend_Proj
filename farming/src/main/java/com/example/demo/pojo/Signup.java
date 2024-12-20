package com.example.demo.pojo;

public class Signup {
	int id;
	String firstname;
	String lastname;
	String address;
	String district;
	String state;
	int pincode;
	String username;
	long aadharno;
	long passbookno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public long getPassbookno() {
		return passbookno;
	}
	public void setPassbookno(long passbookno) {
		this.passbookno = passbookno;
	}
	public Signup(int id, String firstname, String lastname, String address, String district, String state, int pincode,
			String username, long aadharno, long passbookno) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.username = username;
		this.aadharno = aadharno;
		this.passbookno = passbookno;
	}
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Signup [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + ", username=" + username
				+ ", aadharno=" + aadharno + ", passbookno=" + passbookno + "]";
	}
	
	}
	

