package com.codinghub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Pestiq 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private long order_id;
	@Column(name="name", nullable=false)
	private String order_name;
	@Column(name="items", nullable=false)
	private String items;
	@Column(name="quantity", nullable=false)
	private int quantity;
	@Column(name="price", nullable=false)
	private double price;
	@Column(name="location", nullable=false)
	private String location;
	@Column(name="delivery", nullable=false)
	private String delivary_type;
	@Column(name="payment")
	private String payment_type;
	//total_price=quantity*price;
	private double total_price;
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDelivary_type() {
		return delivary_type;
	}
	public void setDelivary_type(String delivary_type) {
		this.delivary_type = delivary_type;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "Pestiq [order_id=" + order_id + ", order_name=" + order_name + ", items=" + items + ", quantity="
				+ quantity + ", price=" + price + ", location=" + location + ", delivary_type=" + delivary_type
				+ ", payment_type=" + payment_type + ", total_price=" + total_price + "]";
	}
	

}
