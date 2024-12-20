package com.codinghub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch21JdbcApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(Ch21JdbcApplication.class, args);
		String url="jdbc:mysql://localhost:3306/schema";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//;oad and Register the driver class
		Connection con=DriverManager.getConnection(url, "root", "root");
		//establish connection btwn mysql and java
		Statement st=con.createStatement();
		//prepared statement or statement
		//int rows=st.executeUpdate("DELETE FROM EMPLOYEE WHERE ID=21");
		//int rows=st.executeUpdate("update employee set salaray=111111 where id=2");
	//	ResultSet rs=st.executeQuery("SELECT * FROM EMPLOYEE");
//		while(rs.next())//cursor is pointing before the first line
//		{
//			System.out.print(rs.getInt(1)+"\t");
//			System.out.print(rs.getString(2)+"\t");
//			System.out.print(rs.getLong(3)+"\n");
//		}
		// ***prepared statements***
		
		PreparedStatement pst=con.prepareStatement("update employee set name=?,salaray=? where id=?");
		pst.setString(1, "ramu");
		pst.setLong(2, 333333333);
		pst.setInt(3, 31);
		int result=pst.executeUpdate();
		System.out.println(result+" updated");
		//execute sql queries
		System.out.println();
		//System.out.println(rows+" updated successfully");
		//System.out.println(rs+" updated successfully");
		//close the connections
		con.close(); pst.close();
		//st.close();
	}

}
