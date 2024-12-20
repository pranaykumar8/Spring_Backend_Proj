package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Televisions;

@Service
public interface Myservice {
	public Televisions insert(Televisions televisions);
	public List<Televisions> findByPrice(int Price);
	//public Televisions findByPrice(int Price);
	List<Televisions> gettelevisions();
}
