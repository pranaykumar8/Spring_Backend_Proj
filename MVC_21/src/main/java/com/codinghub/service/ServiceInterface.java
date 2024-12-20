package com.codinghub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codinghub.model.Pestiq;
@Service
public interface ServiceInterface {

	Pestiq save(Pestiq pestiq) ;

	List<Pestiq> getData();

	Pestiq getById(long order_id);

	String deleteById(long order_id);

	Pestiq update(Pestiq pestiq, long order_id);

	



}
