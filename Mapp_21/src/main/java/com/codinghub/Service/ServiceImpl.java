package com.codinghub.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Dao.Emp_repo;
import com.codinghub.model.Employee;

@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired 
	private Emp_repo dao;
	
	

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}



	@Override
	public List<Employee> getByAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
