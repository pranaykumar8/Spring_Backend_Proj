package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentServiceInterface;

@RestController
@RequestMapping

public class StudentController {
	@Autowired
	private StudentServiceInterface service;
	@PostMapping("/")
	public Student insert(@RequestBody Student student)
	{
		return service.insert(student);
	}

}
