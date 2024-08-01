package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/GroundWork1", "root", "");

//	            String Cdatab="create database GroundWork";
//		  		  String ctable="CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50) NOT NULL,email VARCHAR(255) NOT NULL,password VARCHAR(50) NOT NULL,gender VARCHAR (25) NOT NULL,about VARCHAR(500) NOT NULL);";
//			String ctable="CREATE TABLE contactUs (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(50) NOT NULL,email VARCHAR(100) NOT NULL,message VARCHAR(150) NOT NULL);";
//		  		  Statement statement=conn.createStatement();

//		  		  statement.executeUpdate(ctable);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
