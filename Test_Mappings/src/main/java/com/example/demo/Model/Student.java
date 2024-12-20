package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
@Data
@Entity
@Table (uniqueConstraints =
{
	@UniqueConstraint(columnNames= {"email"})
})

public class Student {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long roll;
private String name;
private String email;
@OneToOne(cascade= CascadeType.ALL)

@JoinColumn(name=" aadhar number" , referencedColumnName="number")
private Aadhar aadhar;

}
