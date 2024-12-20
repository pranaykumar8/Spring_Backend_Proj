package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Repo;
import com.example.demo.model.Televisions;

@Service
public class Serviceimpl implements Myservice 
{
	@Autowired
	private Repo repo;

	@Override
	public Televisions insert(Televisions televisions) {
		// TODO Auto-generated method stub
		return repo.save(televisions);
	}
//	public Televisions findByPrice(int price)
//	{
//		return repo.findByPrice(price);
//	}
	@Override
	public List<Televisions> findByPrice(int price)
	{
		return repo.findByPrice(price);
	}
	@Override
	public List<Televisions> gettelevisions() {
		// TODO Auto-generated method stub
		return repo.gettelevisions();
	}
}
