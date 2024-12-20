package com.codinghub.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "emp_loy")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long emp_id;
private String emp_name;
private double salary;
//public long getEmp_id() {
//	return emp_id;
//}
//public void setEmp_id(long emp_id) {
//	this.emp_id = emp_id;
//}
//public String getEmp_name() {
//	return emp_name;
//}
//public void setEmp_name(String emp_name) {
//	this.emp_name = emp_name;
//}
//public double getSalary() {
//	return salary;
//}
//public void setSalary(double salary) {
//	this.salary = salary;
//}
//@Override
//public String toString() {
//	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
//}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="p_id",referencedColumnName = "id")
private Pan pan;

}
	


