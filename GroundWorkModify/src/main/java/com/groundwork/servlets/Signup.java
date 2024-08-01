package com.groundwork.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.DB.DBConnect;
import com.groundwork.dao.UserDAO;
import com.groundwork.entites.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@MultipartConfig
@WebServlet("/signup")
public class Signup extends HttpServlet {
	@Override
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		

		User us = new User();
		us.setName(name);
		us.setUsername(username);
		us.setEmail(email);
		us.setPassword(password);
		

		UserDAO dao = new UserDAO(DBConnect.getConnection());
		boolean f = dao.userRegister(us);
		if (true) {
//			PrintWriter out = response.getWriter();
//			out.print("Data insert successfully");
			HttpSession session=request.getSession();
			session.setAttribute("reg-msg", "Registration Successfully"+" ");
			response.sendRedirect("Register_page.jsp");
		} else {
			HttpSession session=request.getSession();
			session.setAttribute("error-msg", "something went wrong");
			response.sendRedirect("Register_page.jsp");

//			PrintWriter out = response.getWriter();
//			out.println("Data not insert");
		}


		try {

			Connection conn = DBConnect.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO users (name,email,username,password) VALUES (?, ?, ?,?)");
			ps.setString(1,name);
			ps.setString(2, email);
			ps.setString(3, username);
			ps.setString(4, password);
			
			
			
			
			ps.executeUpdate();

			conn.close();
			response.sendRedirect("Login_page.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
