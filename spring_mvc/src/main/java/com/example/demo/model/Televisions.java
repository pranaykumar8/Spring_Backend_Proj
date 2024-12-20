package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Televisions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String type;
	private int price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Televisions [id=" + id + ", brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	public Televisions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Televisions(long id, String brand, String type, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
}
