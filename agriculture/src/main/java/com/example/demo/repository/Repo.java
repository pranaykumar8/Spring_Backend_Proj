package com.example.demo.repository;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Crops;
import com.example.demo.pojo.Users;

@Repository
public class Repo {
	public Crops insertcrops(Crops crops) throws ClassNotFoundException, SQLException// method
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver it is a interface like compiler mediator btwn java and db
		String url="jdbc:mysql://localhost:3306/schema";//url of db to connect db
		Connection con=DriverManager.getConnection(url,"root","root");// username and password of url
		String s="Insert into crops values(?,?,?,?,?,?)";//command of sql query to insert
		PreparedStatement pst=con.prepareStatement(s);// to run the query
		pst.setInt(1, crops.getId());
		pst.setString(2, crops.getChemical()); //to set the values and get the values
		pst.setString(3,crops.getCrop());
		pst.setInt(4, crops.getAcre());
		pst.setInt(5, crops.getQuantity());
		pst.setInt(6, crops.getPrice());
		
		
		int rows=pst.executeUpdate(); //it will storing in a variable
		return crops;
	}
	public Crops updatecrops(Crops crops) throws ClassNotFoundException, SQLException// method
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver it is a interface like compiler mediator btwn java and db
		String url="jdbc:mysql://localhost:3306/schema";//url of db to connect db
		Connection con=DriverManager.getConnection(url,"root","root");// username and password of url
		String s="Update crops set chemical=?, crop=?, acre=?, quantity=?, price=? where id=?";//command of sql query to insert
		PreparedStatement pst=con.prepareStatement(s);// to run the query
		pst.setString(1, crops.getChemical()); //to set the values and get the values
		pst.setString(2,crops.getCrop());
		pst.setInt(3, crops.getAcre());
		pst.setInt(4, crops.getQuantity());
		pst.setInt(5, crops.getPrice());
		pst.setInt(6, crops.getId());
		int rows=pst.executeUpdate(); //it will storing in a variable
		return crops;
	}
	public String deletecrops(int id) throws ClassNotFoundException, SQLException
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/schema";
	Connection con=DriverManager.getConnection(url, "root", "root");
	String s="Delete from crops where id=? ";
	PreparedStatement pst=con.prepareStatement(s);
	pst.setInt(1,id);
	pst.executeUpdate();
	return "Deleted";
	}
	public List<Crops>printcrops(Crops crops)throws ClassNotFoundException, SQLException
	{
	List list=new ArrayList();
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/schema";
	Connection con=DriverManager.getConnection(url,"root","root");
	String s="select * from crops";
	PreparedStatement pst=con.prepareStatement(s);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		Crops c=new Crops();
		c.setId(rs.getInt(1));
		c.setChemical(rs.getString(2));
		c.setCrop(rs.getString(3));
		c.setAcre(rs.getInt(4));
		c.setQuantity(rs.getInt(5));
		c.setPrice(rs.getInt(6));
		c.setTotalPrice(rs.getDouble(7));
		list.add(c);
		//list.add(rs.getBigDecimal(7));
	}
	return list;
		
	}
	
	//users repository code from here
	
	public Users insertusers( Users users) throws ClassNotFoundException, SQLException// method
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver it is a interface like compiler mediator btwn java and db
		String url="jdbc:mysql://localhost:3306/schema";//url of db to connect db
		Connection con=DriverManager.getConnection(url,"root","root");// username and password of url
		String s="Insert into users values(?,?,?,?,?,?,?)";//command of sql query to insert
		PreparedStatement pst=con.prepareStatement(s);// to run the query
		pst.setInt(1, users.getId());
		pst.setString(2, users.getName());
		pst.setString(3, users.getSurname()); //to set the values and get the values
		pst.setInt(4,users.getAge());
		pst.setString(5, users.getAddress());
		pst.setLong(6, users.getAadharno());
		pst.setString(7, users.getDob());
		
		
		int rows1=pst.executeUpdate(); //it will storing in a variable
		return users;
	}
}
