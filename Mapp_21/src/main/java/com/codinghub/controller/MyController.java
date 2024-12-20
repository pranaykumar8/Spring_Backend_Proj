package com.codinghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.ServiceInterface;
import com.codinghub.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/employee")
public class MyController {
	
	@Autowired
	private ServiceInterface service;
	
	@PostMapping("/")
	public Employee save(@RequestBody Employee employee) {
		//TODO: process POST request
		
		return service.save(employee);
	}
	@GetMapping("/")
	public List<Employee> getByAll() {
		return service.getByAll45();
	}
	
	

}
