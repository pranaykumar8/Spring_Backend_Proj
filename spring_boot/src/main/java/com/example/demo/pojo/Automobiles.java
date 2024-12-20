package com.example.demo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="automobiles")
public class Automobiles {

	@Id
	int v_no;
	String Company;
	String cc;
	int model;
public int getV_no() {
	return v_no;
}
public void setV_no(int v_no) {
	this.v_no = v_no;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getCc() {
	return cc;
}
public void setCc(String cc) {
	this.cc = cc;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
@Override
public String toString() {
	return "Automobiles [v_no=" + v_no + ", Company=" + Company + ", cc=" + cc + ", model=" + model + "]";
}
public Automobiles(int v_no, String company, String cc, int model) {
	super();
	this.v_no = v_no;
	Company = company;
	this.cc = cc;
	this.model = model;
}
public Automobiles() {
	super();
	// TODO Auto-generated constructor stub
}

}
