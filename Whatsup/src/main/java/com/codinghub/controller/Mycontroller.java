package com.codinghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.model.Whatsup;
import com.codinghub.repository.Repo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Mycontroller {
	@Autowired
private Repo repo;
	
	@PostMapping("/")
	public Whatsup insert(@RequestBody Whatsup whatsup) {
		//TODO: process POST request
		
		return repo.save(whatsup);
	}
	@GetMapping("/")
	public List<Whatsup> get() {
		return (List<Whatsup>)repo.findAll();
	}
	
	
}
