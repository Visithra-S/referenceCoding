package com.cerpsoft.in.studentdao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.cerpsoft.in.studentinfo.StudentInfo;
import com.mysql.jdbc.PreparedStatement;

public class StudentDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/studentdetails","root","root");
		}catch(Exception e) {
			System.out.println(e);

		}
		return con;

	}

	public static int save(StudentInfo e){  
		int status=0;  
		try{  
			Connection con = StudentDao.getConnection();  
			PreparedStatement ps= (PreparedStatement) con.prepareStatement("INSERT INTO `user`(`username`,`email`,`password`) VALUES (?,?,?);");  
			ps.setString(1,e.getUserName());  
			ps.setString(2,e.getPassword());  
			ps.setString(3,e.getEmail());  

			status=ps.executeUpdate();  

			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  

		return status;  
	}  
}
