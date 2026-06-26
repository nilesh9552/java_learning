package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class DeleteData {
public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	Connection con = connectivity.conn();
	PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
	ps.setInt(1, id);
	ps.execute();
	con.close();
	
}
}
