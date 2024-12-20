package com.example.demo.controller;
import java.util.*;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Laptop;
import com.example.demo.repository.repo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin//(origins="http://localhost:3000")// this for integrate backend and frontend
@RestController //it will find out the controller class where it was. it will come directly to this position
public class mycontroller {
	@Autowired // default dependency injection for to use one class in another class 
	private repo Repo;// we have class as a type 

	public repo getRepo() {
		return Repo;
	}

	public void setRepo(repo repo) {
		Repo = repo;
	}
	@PostMapping("/save")// with api we can post data with this annotation
	public Laptop save(@RequestBody Laptop laptop) throws ClassNotFoundException, SQLException {// requestbody is for to set values from postman
		//TODO: process POST request
		
		return Repo.insertlaptop( laptop);
	}
	@PutMapping("/update")// to know the protocall of postman which one is using
	public Laptop update(@RequestBody Laptop laptop) throws ClassNotFoundException, SQLException {// REQ IS data from postman it will get to jdbc
		//TODO: process POST request
		
		return Repo.updatelaptop( laptop);
	}
//	@PostMapping("/save1")
//	public Laptop save1(@RequestBody Laptop laptop1) throws ClassNotFoundException, SQLException {
//		//TODO: process POST request
//		
//		return Repo.insertlaptop1( laptop1);
//		}
	@GetMapping("/print")
	public List<Laptop> print(Laptop laptop) throws ClassNotFoundException, SQLException {
		//TODO: process POST request
		
		return Repo.printlaptop( laptop);}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) throws ClassNotFoundException, SQLException {// path variable is for to get only one column
		//TODO: process POST request
		
		return Repo.deletelaptop(id);}
	
}
