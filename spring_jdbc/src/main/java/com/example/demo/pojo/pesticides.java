package com.example.demo.pojo;

public class pesticides {

	int id;
	String p_name;
	String p_brand;
	String p_purpose;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_brand() {
		return p_brand;
	}
	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}
	public String getP_purpose() {
		return p_purpose;
	}
	public void setP_purpose(String p_purpose) {
		this.p_purpose = p_purpose;
	}
	@Override
	public String toString() {
		return "pesticides [id=" + id + ", p_name=" + p_name + ", p_brand=" + p_brand + ", p_purpose=" + p_purpose
				+ "]";
	}
	public pesticides(int id, String p_name, String p_brand, String p_purpose) {
		super();
		this.id = id;
		this.p_name = p_name;
		this.p_brand = p_brand;
		this.p_purpose = p_purpose;
	}
	public pesticides() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
