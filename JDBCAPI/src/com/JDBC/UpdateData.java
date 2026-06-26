package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) throws SQLException {
		Connection con = connectivity.conn();
		PreparedStatement ps = con.prepareStatement("update student set name = 'Raju' where id = 53");
		ps.execute();
	}

}
