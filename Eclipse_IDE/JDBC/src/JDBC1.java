//package javajdbc;
import java.sql.*;

public class JDBC1 {
	public static void main(String[]args) throws ClassNotFoundException  {
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		String user = "root";
//		String pass = "rahul";
//		
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rahul");
		conn.close();

		
		
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		
		//		Statement st = conn.createStatement();
		
		System.out.println("Connected");
		
	}

}