

package com.user;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out	= res.getWriter();
		
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Register</title>");
			out.println("</head>");
			out.println("<body>");
			//getting all the incoming detail from the request
			String name=req.getParameter("user_name");
			String email=req.getParameter("user_email");
			String password = req.getParameter("user_password");
			out.print(name);
			out.print(email);
			out.print(password);
			//connection
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/register_db","root","");
				//query
				String  query="insert into user(name,password,email)values(?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(query);
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setString(3, email);
				
				pstmt.executeUpdate();
				out.print("<h1>done...</h1>");
				
			} catch (Exception e) {
				e.printStackTrace();
				out.println("<h1>Error</h1>");
				
			}
			
			
			
			
			
			out.println("</body>");
			out.println("</html>");
			
			
			
			
			
			
	
		

	}
	
}
