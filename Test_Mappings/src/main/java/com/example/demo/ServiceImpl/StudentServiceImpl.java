package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentDao;
import com.example.demo.Service.StudentServiceInterface;
@Service
public class StudentServiceImpl implements StudentServiceInterface {

	//@Override
	@Autowired
	private StudentDao dao;
	public Student insert(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

}
