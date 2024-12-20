package com.codinghub.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.codinghub.model.Feed;
import com.codinghub.model.Instagram;

@Repository
public class Myrepository {

	public Instagram save(Instagram instagram) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/schema";
		String u="root";
		String p="root";
		String q="insert into Instagram values(?,?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement(q);
		pst.setString(1,instagram.getName());
		pst.setString(2, instagram.getSurname());
		pst.setString(3, instagram.getUsername());
		pst.setLong(4, instagram.getMobile());
		pst.setDate(5, instagram.getDob());
		pst.setString(6, instagram.getPassword());
		pst.setInt(7, instagram.getAge());
		pst.setString(8, instagram.getAddress());
		int rows=pst.executeUpdate();
		return instagram;
	}

	public String getByUsername(String username, String password) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/schema";
		String u="root";
		String p="root";
		String q="select * from instagram where username=? and password=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement(q);
		pst.setString(1, username);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		return "1";
		else
			return "2";
	}
	
	public List<Feed> select(Feed feed) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Feed> li=new ArrayList<>();
		
		String url="jdbc:mysql://localhost:3306/schema";
		String u="root";
		String p="root";
		String q="select * from feed";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		PreparedStatement pst=con.prepareStatement(q);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Feed fd=new Feed();
			fd.setImageUrl(rs.getString(1));
			li.add(fd);
		}
		return li;
	}
	

}
