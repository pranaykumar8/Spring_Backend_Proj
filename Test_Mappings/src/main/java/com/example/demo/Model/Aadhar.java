package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
@Data
@Entity
@Table (uniqueConstraints =
{
	@UniqueConstraint(columnNames= {"enroll_number"})
})

public class Aadhar {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long number;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private Long enroll_number;
	@Column(nullable=false)
	private String address;
}
	


