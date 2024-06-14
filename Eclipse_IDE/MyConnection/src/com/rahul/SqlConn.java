package com.rahul;


import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;



public class SqlConn {
	public static void main(String[]args)  throws ClassNotFoundException, SQLException{
		//Driver registation
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		// database connection  1st step
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti4","root", "rahul");  // mention the database name (4rth step)
	    System.out.println("Connection Established: "+conn);
		
	    
	    
	    
	    //create databases  2nd step
	    
//Statement st = conn.createStatement();
//  	st.executeUpdate("create database nsti4");
	    
	    // Show Databases   3rd step
	    
//   ResultSet rs = st.executeQuery("show databases");
//        while(rs.next()) {
//		
//	System.out.println(rs);
//		System.out.println(rs.getString(1));  // database showing with name format not object format
//	 }
//   
	    
//	     mention the database name (4rth step)
	    
	    
//    create table 5th step
		
		// Create table
//		
//		String sql = "create table  ADIT(id int, name varchar(40), mail varchar(45) primary key)";
//	    Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//	    System.out.println("table created");
	    
		
		// Insert Data  6th step
		
//		String query = "Insert into ADIT values(1,'Pooja','pooja@gmail.com')";
//        String query = "Insert into ADIT values(2,'Princy','princy@gmail.com'), (3,'bulbul', 'bulbul@gmail.com'), (4,'Neha','neha@gmail.com')";
//	    Statement st = conn.createStatement();
//	    st.executeUpdate(query);
//	    System.out.println("Data Inserted Successfully");
    
		
	
		
//( table format)    7th step
		// Read 
//	   String query = "select * from ADIT";
//	   Statement st = conn.createStatement();
//	   ResultSet res =  st.executeQuery(query);
//	   System.out.println(res);
//	   while(res.next()) {
//		   System.out.println(res.getString("name") + " - " + res.getInt("id"));
//	   }
//		
//		while(res.next()) {
//			System.out.println(res.getInt("id")+ "-" + res.getString("name") +" -" + res.getString("mail"));
//		}
	    
	    //update		
//		String query = "update ADIT set name=  'Rahul' where id=2 ";
//		Statement st = conn.createStatement();	
//		st.execute(query);
//		System.out.println("Data Updated");
		
		//delete
//		String query = "delete from ADIT where name = 'bulbul'";
//		Statement st = conn.createStatement();
//		st.execute(query);
//		System.out.println("Data deleted");
	    
	    //alter/drop table
	    String query = "alter table ADIT add contact int";
//		String query = "drop table ADIT";
//		String query = "drop database nsti"
//	    String query = "alter table ADIT drop column mail";
	    Statement st = conn.createStatement();
		st.execute(query);
	   }
	}