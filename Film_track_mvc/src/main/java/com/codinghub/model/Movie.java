package com.codinghub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int m_no;
	@Column(name="m_name")
	private String mname;
	private String m_hero;
	@Column(name="production_no")
	private long productionno;
	private String genere;
	private String budget;
	private double rating;
	private String collections;

}
