package com.codinghub.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.model.Employee;

@Repository
public interface Emp_repo extends JpaRepository<Employee, Long> {

}
