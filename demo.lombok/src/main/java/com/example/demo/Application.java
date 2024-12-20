package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Student student = new Student(0, null, null);
		student.setId(1);
		student.setFname("Pranay");
		student.setLname("Kumar");
		
		System.out.println(student.getId());
		System.out.println(student.getFname());
		System.out.println(student.getLname());
	}

}
