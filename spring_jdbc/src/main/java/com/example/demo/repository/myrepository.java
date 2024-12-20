package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.pesticides;

@Repository
public class myrepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public pesticides insertpesticides(pesticides Pesticides)
	{
		String query="Insert into pesticides value (?,?,?,?)";
		jdbcTemplate.update(query,Pesticides.getId(),Pesticides.getP_name(),Pesticides.getP_brand(),Pesticides.getP_purpose());
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
	public List<pesticides> print()
	{
		String sql="Select * from pesticides;";
		RowMapperImpl r=new RowMapperImpl();
		//JdbcTemplate.query(sql, r);
		List<pesticides> list=jdbcTemplate.query(sql, r);
		return list;
	}
}
