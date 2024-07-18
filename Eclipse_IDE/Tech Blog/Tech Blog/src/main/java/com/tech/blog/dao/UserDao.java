package com.tech.blog.dao;
import java.sql.*;

import com.tech.blog.entities.User;

public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
//		super();
		this.con = con;
	}
	//method to insert user to database
	public boolean saveUser(User user) {
		boolean f=false;
		
		
		
		try {
			
			//user database
			String query="insert into user(id,name,email,password,gender,about)values(?,?,?,?,?,?)";
			PreparedStatement pstmt=this.con.prepareStatement(query);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2,user.getName());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getPassword());
			pstmt.setString(5,user.getGender());
			pstmt.setString(6,user.getAbout());
			pstmt.executeUpdate();
			
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}
}
	
	


