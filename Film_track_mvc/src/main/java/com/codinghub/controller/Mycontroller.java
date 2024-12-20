package com.codinghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.ServiceInterface;
import com.codinghub.model.Movie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class Mycontroller 
{
	@Autowired
	private ServiceInterface service;
	
	@PostMapping("/")
	public Movie save(@RequestBody Movie movie) {
		//TODO: process POST request
		
		return service.save(movie);
	}
	
	@GetMapping("/")
	public List<Movie> getData() {
		return service.getData();
	}
	
	@GetMapping("/{m_no}")
	public Movie getById(@PathVariable int m_no) {
		return service.getById(m_no);
	}
	
	@GetMapping("/movies/{rating}")
	public List<Movie> getRating(@PathVariable double rating) {
		return service.getRating(rating);
	}
	
	@GetMapping("/movie/{genere}")
	public List<Movie> getGenere(@PathVariable String genere) {
		return service.getGenere(genere);
	}
	
	@GetMapping("{mname}/{productionno}")
	public List<Movie> getByMnameAndProductionno(@PathVariable String mname, @PathVariable long productionno) {
		return service.getByMnameAndProductionno(mname,productionno);
	}
	@GetMapping("/mov/collections")
	public List<Movie> getByCollections(@PathVariable String collections) {
		return service.getByCollections(collections);
	}
	
	@GetMapping("/sort")
	public  List<Movie>  sort() {
		return service.sortByRecords();
	}
	
	@GetMapping("m/{pagination}")
	public List<Movie> pagination() {
		return service.pagination();
	}
	@PatchMapping("/{m_no}")
	public Movie partial(@PathVariable int m_no, @RequestBody Movie movie) {
	
		
		return service.partial(movie,m_no);
	}
	
}
