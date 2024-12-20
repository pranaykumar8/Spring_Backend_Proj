package com.codinghub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Repository.Dao;
import com.codinghub.model.Pestiq;

@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
private Dao dao;
	@Override
	public Pestiq save(Pestiq pestiq) {
		// TODO Auto-generated method stub
		return dao.save(pestiq);
	}
	@Override
	public List<Pestiq> getData() {
		// TODO Auto-generated method stub
		return (List<Pestiq>)dao.findAll();
	}
	
	
	@Override
	public Pestiq getById(long order_id) {
		// TODO Auto-generated method stub
		Optional<Pestiq>optional=dao.findById(order_id);
		Pestiq pestiq=optional.get();
		return pestiq;
	}
	@Override
	public String deleteById(long order_id) {
		// TODO Auto-generated method stub
		dao.deleteById(order_id);
		return order_id+" deleted sucessfully";
	}
	@Override
	public Pestiq update(Pestiq pestiq, long order_id) {
		// TODO Auto-generated method stub
		Pestiq p=getById(order_id);
		p.setOrder_id(pestiq.getOrder_id());
		p.setOrder_name(pestiq.getOrder_name());
		p.setItems(pestiq.getItems());
		p.setPrice(pestiq.getPrice());
		p.setQuantity(pestiq.getQuantity());
		p.setLocation(pestiq.getLocation());
		p.setDelivary_type(pestiq.getDelivary_type());
		p.setPayment_type(pestiq.getPayment_type());
		p.setTotal_price(pestiq.getTotal_price());
		return dao.save(p);
		
	}
	
	

}
