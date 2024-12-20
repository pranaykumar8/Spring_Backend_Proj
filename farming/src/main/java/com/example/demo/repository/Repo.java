package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.pojo.Signup;


public class Repo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Signup insertpesticides(Signup signup)
	{
		String query="Insert into pesticides value (?,?,?,?)";
		jdbcTemplate.update(query,signup.getId(),signup.getP_name(),signup.getP_brand(),Pesticides.getP_purpose());
		return Pesticides;
	}
	public pesticides updatepesticides(pesticides Pesticides)
	{
		String query="Update pesticides set p_name=?,p_brand=?,p_purpose=? where id=?";
		jdbcTemplate.update(query,Pesticides.getP_name(),Pesticides.getP_brand(),Pesticides.getP_purpose(),Pesticides.getId());
		return Pesticides;
	}
	public String deletepesticides(int id)
	{
		String query="delete from pesticides where id=?";
		jdbcTemplate.update(query,id);
		return "Pesticide_deleted";
	}
}
}
