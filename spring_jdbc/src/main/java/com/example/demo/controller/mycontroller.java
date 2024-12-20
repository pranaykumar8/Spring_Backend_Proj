package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.pesticides;
import com.example.demo.repository.myrepository;

@RestController
public class mycontroller {

	@Autowired
	private myrepository myrepo;
	@PostMapping("/")
	public pesticides Insertpesticides(@RequestBody pesticides Pesticides)
	{
		return myrepo.insertpesticides(Pesticides);
	}
	@PutMapping("/")
	public pesticides Updatepesticides(@RequestBody pesticides Pesticides)
	{
		return myrepo.updatepesticides(Pesticides);
	}
	@DeleteMapping("/{id}")
	public String deletepesticides(@PathVariable int id)
	{
		return myrepo.deletepesticides(id);
	}
	@GetMapping("/")
	public List<pesticides>get()
	{
		return myrepo.print();
	}
	
}
