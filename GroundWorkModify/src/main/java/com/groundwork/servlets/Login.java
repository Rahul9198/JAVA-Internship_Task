package com.groundwork.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DB.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");


//		UserDAO dao=new UserDAO(DBConnect.getConnection());
//		User user=dao.getLogin(email,password);
//
//		if(user!=null) {
//			HttpSession session=request.getSession();
//			session.setAttribute("user-ob",user);
//			response.sendRedirect("profile.jsp");//profile yaha par karenge
//
//
//
//		}else {
//			PrintWriter out=response.getWriter();
//			out.println("Invalid email & password");
//
//		}
//








		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				response.sendRedirect("profile.jsp");
			} else {

				response.sendRedirect("Login_page.jsp");


			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
