package com.ProjectOnOop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/construction_db","root","Nilu@2004");
			if(con != null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected");
			}
			
		} catch (ClassNotFoundException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		DBConnection.getConnection();
	}
	}

