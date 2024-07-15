package com.codewithrahulcon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

//import com.mysql.cj.xdevapi.Statement;

//import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterC extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw	= res.getWriter();
//		pw.println("registered");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/ibm","root","");
//			String name=req.getParameter("user");
//			String mail=req.getParameter("mail");
//			String phone=req.getParameter("phone");
//			String location=req.getParameter("location");
//			pw.println(name+"____"+mail+"____"+phone+"____"+location);
//			String query="insert into student values(?,?,?,?)";
			String query="select * from student";
//			PreparedStatement ps=conn.prepareStatement(query);
			Statement st = conn.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			pw.println("<table border='1px' style='border-collapse:collapse'>");
			pw.println("<tr><th>Name</th><th>E-mail</th><th>Phone</th><th>Location</th></tr>");
			
			while(rs.next()) {
				String name = rs.getString(1);
				String mail = rs.getString(2);
				String phone = rs.getString(3);
				String location= rs.getString(4);
				
				pw.println("<tr>"+"<td>"+name+"</td>"+"<td>"+mail+"</td>"+"<td>"+phone+"</td>"+"<td>"+location+"</td>"+"</td></tr>");
				
			}
			pw.println("</table>");
			
//			ps.setString(1, name);
//			ps.setString(2, mail);
//			ps.setString(3, phone);
//			ps.setString(4, location);
//			int inserted =ps.executeUpdate();
//			ps.executeUpdate();
//			pw.print("inserted");
//			if(inserted>0) {
//				pw.print("data inserted");
//				
//			}
//			else {
//				pw.print("some error");
//			}
//			
			
			
			
			
//			pw.print("registered");
			
			//String query ="create database ibm";
//			String query ="create table student(name varchar(30),mail varchar(40) primary key,phone varchar(40),location varchar(30))";
			
//			Statement st =conn.createStatement();
//			st.executeUpdate(query);			
			//pw.println("database created");
//			pw.println("table created");
			
			
			
//				pw.println("connected");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			pw.print(e);
		}
	}


}
