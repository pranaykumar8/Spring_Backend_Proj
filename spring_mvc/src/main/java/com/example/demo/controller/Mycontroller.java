package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Televisions;
import com.example.demo.service.Myservice;

@RestController
public class Mycontroller 
{
@Autowired
private Myservice service;
@PostMapping("/")
public Televisions insert(@RequestBody Televisions televisions)
{
	return service.insert(televisions);
}

//@GetMapping("/{price}")
//public Televisions get(@PathVariable int price)
//{
//	return service.findByPrice(price);
//}
@GetMapping("/{price}")
public List<Televisions> get(@PathVariable int price)
{
	return service.findByPrice(price);
}
@GetMapping("/")
public List<Televisions> getall(@RequestBody Televisions televisions)
{
	return service.gettelevisions();
}
}
