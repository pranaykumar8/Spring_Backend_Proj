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

import com.example.demo.pojo.Automobiles;
import com.example.demo.repository.Repo;

@RestController
public class Mycontroller {
	@Autowired
	Repo repo;
	
	@PostMapping("/")
	public Automobiles insert(@RequestBody Automobiles automobiles)
	{
		return 	repo.save(automobiles);
		
	}
	@DeleteMapping("/{v_no}")
	public String delete(@PathVariable int v_no,@RequestBody Automobiles automobiles)
	{
		repo.deleteById(v_no);
		return "deleted success";
	}
	
	@GetMapping("/")
	public List<Automobiles> print(){
		return (List<Automobiles>) repo.findAll();
	}
//	@PutMapping("/{v_no}")
//	public Automobiles upsert(@PathVariable int v_no,@RequestBody Automobiles automobiles)
//	{
//		Automobiles old_au =findById(v_no);
//		old_au.setv_no(new_au.getCc());
//		old_au.setCc(new_au.getCc());
//		
//		return repo.save(automobiles);
//	}
	@PutMapping("/{v_no}")
	  public Automobiles upsert(@PathVariable int v_no, @RequestBody Automobiles automobiles)
	   {
		Automobiles oldAutomobiles = repo.findById(v_no).get();
	         
		oldAutomobiles.setV_no(automobiles.getV_no());
		oldAutomobiles.setCompany(automobiles.getCompany());
		oldAutomobiles.setCc(automobiles.getCc());
		oldAutomobiles.setModel(automobiles.getModel());

	              
	              return repo.save(oldAutomobiles);
	   }
	

}
