package com.bengalore;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/crud")
public class CrudC extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw	= res.getWriter();
		String action=req.getParameter("action");
		String mail=req.getParameter("mail");
//		pw.print(action+"______________"+mail);
		
		if(action.equals("update")) {
//			pw.print("update successfully");
			updateForm(res,mail);
			
			
		}
		else if(action.equals("delete")) {
//			pw.print("delected successfully");
			deleteData(res,mail);
			
		}
		
		
		
		

}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String action = req.getParameter("action");
		if (action.equals("update")) {
			try {
				updateData(req,res);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	private void updateData(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException, IOException {
		String name =req.getParameter("user");
		String mail=req.getParameter("mail");
		String phone =req.getParameter("phone");
		String city =req.getParameter("city");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/aditreg","root","");
			String query="update student set name=?,phone=?city=? where mail=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,mail);
			ps.setString(3,phone);
			ps.setString(4,city);
			int updated=ps.executeUpdate();
			if(updated>0) {
				pw.print("updated");
				
			}
			else {
				pw.print("error");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			pw.print(e);
		}
		
	}
	public void updateForm(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("Form");
		pw.println("<form action='crud>");
		pw.println("<input type='hidden'name='action'value='update'>");
		pw.println("<input type='hidden'name='mail'value='"+mail+"'>");
		pw.println("<input type='text'name='user'>");
		pw.println("<input type='text'name='phone'>");
		pw.println("<input type='text'name='city'>");
		pw.println("<input type='submit'value='update'>");
		
		pw.println("</form>");
		
	
		
	}

	public void deleteData(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/aditreg","root","");
			String query="delete from student where mail=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,mail);
			int deleted=ps.executeUpdate();
			if (deleted>0) {
				pw.print("deleted successfully");
				
			}
			else {
				pw.print("error");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			pw.print(e);
		}
	
	
		
		
	}
}