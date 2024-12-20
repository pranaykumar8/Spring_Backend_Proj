package com.example.demo.repository;
import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Laptop;
@Repository
public class repo {

	public Laptop insertlaptop(Laptop laptop) throws ClassNotFoundException, SQLException// method
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver it is a interface like compiler mediator btwn java and db
		String url="jdbc:mysql://localhost:3306/schema";//url of db to connect db
		Connection con=DriverManager.getConnection(url,"root","root");// username and password of url
		String s="Insert into laptop values(?,?,?,?)";//command of sql query to insert
		PreparedStatement pst=con.prepareStatement(s);// to run the query
		pst.setInt(1, laptop.getId()); //to set the values and get the values
		pst.setString(2,laptop.getBrand());
		pst.setString(3, laptop.getProcessor());
		pst.setInt(4, laptop.getPrice());
		int rows=pst.executeUpdate(); //it will storing in a variable
		return laptop;
	}
	public Laptop updatelaptop(Laptop laptop) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schema";
		Connection con=DriverManager.getConnection(url,"root","root");
		String s="Update laptop set brand=?, processor=?, price=? where id=? ";
		PreparedStatement pst=con.prepareStatement(s);
		
		pst.setString(1,laptop.getBrand());
		pst.setString(2, laptop.getProcessor());
		pst.setInt(3, laptop.getPrice());
		pst.setInt(4, laptop.getId());
		int rows1=pst.executeUpdate();
		return laptop;
	}
//	public Laptop insertlaptop1(Laptop laptop1) throws ClassNotFoundException, SQLException
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url="jdbc:mysql://localhost:3306/schema";
//		Connection con=DriverManager.getConnection(url,"root","root");
//		String s="Insert into laptop values(?,?,?,?)";
//		PreparedStatement pst=con.prepareStatement(s);
//		pst.setInt(1, laptop1.getId());
//		pst.setString(2,laptop1.getBrand());
//		pst.setString(3, laptop1.getProcessor());
//		pst.setInt(4, laptop1.getPrice());
//		int rows=pst.executeUpdate();
//		return laptop1;
//	}
	public String deletelaptop(int id) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schema";
		Connection con=DriverManager.getConnection(url,"root","root");
		String s="Delete from laptop  where id=? ";
		PreparedStatement pst=con.prepareStatement(s);
		
		pst.setInt(1,id);
		
		pst.executeUpdate();
//		return "Deleted";
		return "Deleted";
	}
	public List<Laptop>printlaptop(Laptop laptop) throws ClassNotFoundException, SQLException
	{
		List list=new ArrayList();// to show the multiple objects
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schema";
		Connection con=DriverManager.getConnection(url,"root","root");
		String s="select * from laptop";
		PreparedStatement pst=con.prepareStatement(s);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Laptop l1=new Laptop();
			l1.setId(rs.getInt(1));
			l1.setBrand(rs.getString(2));
			l1.setProcessor(rs.getString(3));
			l1.setPrice(rs.getInt(4));
			list.add(l1);
		}
		return list;
	}
		
	
}
