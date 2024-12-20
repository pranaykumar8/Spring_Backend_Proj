package com.example.demo.configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class myconfiguration {
	@Bean
	public DataSource dataSource()
	{
		String url="jdbc:mysql://localhost:3306/schema";
				String username="root";
				String password="root";
				DataSource d=new DriverManagerDataSource(url, username, password);
				return d;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate j=new JdbcTemplate(dataSource());
		return j;
	}
}
