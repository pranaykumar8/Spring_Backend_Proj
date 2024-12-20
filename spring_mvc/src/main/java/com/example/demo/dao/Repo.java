package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Televisions;

@Repository
public interface Repo extends CrudRepository<Televisions, Long> 
{
	//public Televisions findByPrice(int Price);
	//public List<televisions>
	List<Televisions> findByPrice(int price);
	@Query("from Televisions")
	List<Televisions> gettelevisions();
}
