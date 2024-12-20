package com.codinghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.model.Pestiq;
import com.codinghub.service.ServiceInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin
@RestController
public class Contr_pest {
@Autowired
ServiceInterface service;
@PostMapping("/")
public Pestiq save(@RequestBody Pestiq pestiq) {
    //TODO: process POST request
    
    return service.save(pestiq);
}

@GetMapping("/")
public List<Pestiq> getData() {
    return service.getData();
}
@GetMapping("/{order_id}")
public Pestiq getById(@PathVariable long order_id) {
    return service.getById(order_id);
}
@DeleteMapping("/{order_id}")
public String deleteById(@PathVariable long order_id ) 
{
	return service.deleteById(order_id);
}

@PutMapping("/{order_id}")
public Pestiq update(@PathVariable long order_id, @RequestBody Pestiq pestiq) {
    //TODO: process PUT request
    
    return service.update(pestiq,order_id);
}
}




