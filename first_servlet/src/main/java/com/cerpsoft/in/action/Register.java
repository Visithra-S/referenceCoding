package com.cerpsoft.in.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
		String usermailid = request.getParameter("usermailid");
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		
		try {
	         
            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");
             
            //creating connection with the database
            Connection con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/studentdetails","root","root");
 
            PreparedStatement ps = (PreparedStatement) con.prepareStatement
                        ("INSERT INTO `Reg` (`usermailid`, `username`, `password`, currentime) VALUES(?, ?, ?, NOW())");
 
            ps.setString(1, usermailid);
            ps.setString(2, username);
            ps.setString(3, password);
            int i = ps.executeUpdate();
             
            if(i > 0) {
                out.println("You are successfully registered");
            }
          
        }
        catch(Exception se) {
            se.printStackTrace();
        }
		
	}

}
