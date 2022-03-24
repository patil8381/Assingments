package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllJDBC {

	public static void main(String[] args) {
		//1. u need to load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. need to get connection object
		
		//Statement vs PrepareStatement vs CallableStatement(Used to store procedure)
		Statement stmt=null;
		ResultSet rs=null;
		Connection connection=null;
		
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/bookstore", "book", "book");
			
			stmt=connection.createStatement();
			rs=stmt.executeQuery("select * from book");			//executeQuery  vs executeUpdate
			
			while(rs.next()) {
				System.out.println(rs.getInt("book_id"));
				System.out.println(rs.getString("book_name"));
				System.out.println(rs.getString("book_author"));
				System.out.println(rs.getInt("book_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
