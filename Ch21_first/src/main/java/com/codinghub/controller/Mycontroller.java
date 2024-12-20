package com.codinghub.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
public class Mycontroller
{
	@GetMapping("/")
	public String m1() {
		return "hello world";
	}
	@GetMapping("add")
	public int add()
	{
		int a=1;
		int b=2;
		return a+b;
	}
	@GetMapping("sub")
	public int sub()
	{
		int a=1;
		int b=2;
		return a-b;
	}
	@GetMapping("mult")
	public int mult()
	{
		int a=10;
		int b=2;
		return a*b;
	}
	@GetMapping("div")
	public double div()
	{
		double a=10;
		double b=2;
		return a/b;
	}
	
	
}
