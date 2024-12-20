package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.pojo.pesticides;

public class RowMapperImpl implements RowMapper<pesticides>{

	@Override
	public pesticides mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		pesticides Pesticides=new pesticides();
		Pesticides.setId(rs.getInt(1));
		Pesticides.setP_name(rs.getString(2));
		Pesticides.setP_brand(rs.getString(3));
		
		Pesticides.setP_purpose(rs.getString(4));
		
		return Pesticides;
	}
	

}
