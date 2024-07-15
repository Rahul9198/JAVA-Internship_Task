package com.bengalore;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regC")
public class registrationC extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw	= res.getWriter();
//		pw.println("registered");
		try {
			
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/aditreg","root","");
			
		    String name=req.getParameter("user");
			String mail=req.getParameter("mail");
			String phone=req.getParameter("phone");
			String city=req.getParameter("city");
			String query="insert into student values(?,?,?,?);";
			PreparedStatement ps= conn.prepareStatement(query);
		    ps.setString(1, name);
			ps.setString(2, mail);
		    ps.setString(3, phone);
			ps.setString(4, city);
			int inserted =ps.executeUpdate();
			if(inserted>0) {
				pw.print("inserted successfully");
				
			}
			else {
				pw.print("not inserted");
				
			}
//		
			
			
//			String query ="create database AditReg";
//			String query ="create table student(name varchar(30),mail varchar(40) primary key,phone varchar(40),city varchar(30))";
////			
			Statement st =conn.createStatement();
			st.executeUpdate(query);
			
//			pw.println("database created");
//			pw.println("table created");
			
			
			
//				pw.println("connected");
			
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
			pw.print(e);
		}
	}
		
	}


