package com.codinghub.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.model.Pestiq;
@Repository
public interface Dao extends CrudRepository<Pestiq, Long> {

	//Pestiq getById(Pestiq pestiq);

	

}
