package com.example.demo.controller;

import java.sql.SQLException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Crops;
import com.example.demo.pojo.Users;
import com.example.demo.repository.Repo;
@RestController
public class Controller {
	@Autowired 
	private Repo repo;

	public Repo getRepo() {
		return repo;
	}

	public void setRepo(Repo Repo) {
		repo = Repo;
	}
	@PostMapping("/save")
	public Crops save(@RequestBody Crops crops) throws ClassNotFoundException, SQLException {
		
		return repo.insertcrops(crops);
	}
		@PutMapping("/update")
		public Crops update(@RequestBody Crops crops) throws ClassNotFoundException, SQLException {
			return repo.updatecrops(crops);
	}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable int id) throws ClassNotFoundException, SQLException {
			return repo.deletecrops(id);
	}
		@GetMapping("/print")
		public List<Crops> print(Crops crops) throws ClassNotFoundException, SQLException {
			return repo.printcrops(crops);
	}
		@PostMapping("/u_po")
		public Users u_po(@RequestBody Users users) throws ClassNotFoundException, SQLException {
			
			return repo.insertusers(users);
		}
}
