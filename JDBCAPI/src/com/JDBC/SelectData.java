package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {
public static void main(String[] args) throws SQLException {
	Connection con = connectivity.conn();
	PreparedStatement ps = con.prepareStatement("insert into student (id,name,city)values(?,?,?)");
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

