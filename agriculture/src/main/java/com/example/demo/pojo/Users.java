package com.example.demo.pojo;

public class Users {
	int id;
String name;
String surname;
int age;
String address;
long aadharno;
String dob;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getAadharno() {
	return aadharno;
}
public void setAadharno(long aadharno) {
	this.aadharno = aadharno;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Users [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", address=" + address
			+ ", aadharno=" + aadharno + ", dob=" + dob + "]";
}

}



