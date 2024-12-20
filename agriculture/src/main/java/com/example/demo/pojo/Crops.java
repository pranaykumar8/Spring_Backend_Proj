package com.example.demo.pojo;

public class Crops {
	int id;
	String chemical;
	String crop;
	int acre;
	int quantity;
	int price;
	Double totalPrice;
//	Crops c=new Crops();
	
	
	
//	public int getTotalPrice() {
//		return totalPrice;
//	}
//	public void setTotalPrice(int totalPrice) {
//		this.totalPrice = totalPrice;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChemical() {
		return chemical;
	}
	public void setChemical(String chemical) {
		this.chemical = chemical;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public int getAcre() {
		return acre;
	}
	public void setAcre(int acre) {
		this.acre = acre;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	//	public int totalP()
//	{
//		return (quantity*price);
//	}
//	@Override
//	public String toString() {
//		return "Crops [id=" + id + ", chemical=" + chemical + ", crop=" + crop + ", acre=" + acre + ", quantity="
//				+ quantity + ", price=" + price + ", totalPrice=" + totalPrice + "]";
//	}
	@Override
	public String toString() {
		return "Crops [id=" + id + ", chemical=" + chemical + ", crop=" + crop + ", acre=" + acre + ", quantity="
				+ quantity + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
