package com.bengalore;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class displayC extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	
	{
		res.setContentType("text/html");
		PrintWriter pw	= res.getWriter();
	
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/aditReg","root","");
		Statement st =conn.createStatement();
		String query="select * from student";
		ResultSet rs=st.executeQuery(query);
		pw.print("<table border='1px'><tr><th>Name</th><th>Mail</th><th>Phone</th><th>city</th><th>Operation</th><tr>");
		
		
		while(rs.next()) {
			String name= rs.getString(1);
			String mail= rs.getString(2);
			String phone= rs.getString(3);
			String city= rs.getString(4);
			pw.println("<tr><td>"+name+"</td><td>"+mail+"</td><td>"+phone+"</td><td>"+city+"</td>");
			pw.println("<td><a href='crud?action=update&mail="+mail+"'>Update</a>|<a href='crud?action=delete&mail="+mail+"'>Delete</a></td></tr>");
			
			
			
		}
		pw.println("</table>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
