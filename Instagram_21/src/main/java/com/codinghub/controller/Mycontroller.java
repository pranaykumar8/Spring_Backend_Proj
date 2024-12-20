package com.codinghub.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.model.Feed;
import com.codinghub.model.Instagram;
import com.codinghub.repository.Myrepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin
@RestController
public class Mycontroller {
	@Autowired
	private Myrepository repo;

	public Myrepository getRepo() {
		return repo;
	}

	public void setRepo(Myrepository repo) {
		this.repo = repo;
	}
	@PostMapping("/")
	public Instagram insert(@RequestBody Instagram instagram) throws ClassNotFoundException, SQLException {
		//TODO: process POST request
		
		return repo.save(instagram);
	}
	@GetMapping("/check/{username}/{password}")
	public String getByUsername(@PathVariable String username, @PathVariable String password) throws ClassNotFoundException, SQLException {
		return repo.getByUsername(username,password);
	}
	
	@GetMapping("/feed")
	public List<Feed> userdetails(@PathVariable Feed feed) throws ClassNotFoundException, SQLException {
		return repo.select(feed);
	}
}
