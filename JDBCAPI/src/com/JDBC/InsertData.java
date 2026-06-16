package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class InsertData {
public static void main(String[] args) throws SQLException {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter id");
//	int id = sc.nextInt();
//	System.out.println("Enter Name");
//	String name = sc.next();
//	System.out.println("Enter City");
//	String city = sc.next();
	Connection con = connectivity.conn();
	PreparedStatement ps = con.prepareStatement("insert into student (id,name,city)values(?,?,?)");
//	ps.setInt(1, id);
//	ps.setString(2, name);
//	ps.setString(3, city);
// int r = ps.executeUpdate();
//if(r>0) {
//	System.out.println("Data inserted Successfully");
//}else {
//	System.out.println("data not inserted");
//}
PreparedStatement get = con.prepareStatement("select * from student");
ResultSet rs = get.executeQuery();
while(rs.next()) {
	System.out.println("Id is :"+ rs.getInt("id"));
	System.out.println("Name is :"+ rs.getString("name"));
	System.out.println("City is :"+ rs.getString("city"));
	System.out.println("=================");
}

}
}
