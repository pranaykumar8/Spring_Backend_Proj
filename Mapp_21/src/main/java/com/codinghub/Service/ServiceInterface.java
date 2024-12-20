package com.codinghub.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codinghub.model.Employee;

@Service
public interface ServiceInterface {

	Employee save(Employee employee);

	List<Employee> getByAll();

}
