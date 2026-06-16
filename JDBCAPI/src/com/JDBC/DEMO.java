package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DEMO {

    public static void main(String[] args) 
            throws ClassNotFoundException, SQLException {
    	Scanner sc = new Scanner(System.in);
    	int id;
    	String name;
    	String city;
    	System.out.println("Enter id");
    	id = sc.nextInt();
    	System.out.println("Enter Name");
    	name = sc.next();
    	System.out.println("Enter City");
    	city = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/college_db","root","Nilu@2004");

       PreparedStatement ps = con.prepareStatement("insert into student(id,name,city)value(?,?,?)");
      
       ps.setInt(1, id);
       ps.setString(2, name);
       ps.setString(3, city);
       int r = ps.executeUpdate();
       
       if (r>0) {
    	   System.out.println("Data Inserted");
       }
       else {
    	   System.out.println("Data Not insertes");
    	   System.out.println("This is test msg");
       }
       
    }
}