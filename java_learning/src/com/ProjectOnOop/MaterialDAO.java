package com.ProjectOnOop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MaterialDAO {
public void addMaterial(Material m) {
	
	try {
		Connection con = DBConnection.getConnection();
		String sql = "insert into materials ( material_name,quantity, unit,price)values(?,?,?,?)";
		
		PreparedStatement ps =con.prepareStatement(sql);
		
		ps.setString(1,m.getMaterialName());
		ps.setInt(2, m.getQuantity());
		ps.setString(3,m.getUnit());
		ps.setDouble(4, m.getPrice());
		int r = ps.executeUpdate();
		if(r>0) {
			System.out.println("material Added successfully");
		}else{System.out.println("material Not added");}
		
		ps.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void viedMaterial(){
	
	try {
		Connection con = DBConnection.getConnection();
		String sql = "select * from materials";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			 System.out.println(
		                rs.getInt("id") + " | " +
		                rs.getString("material_name") + " | " +
		                rs.getInt("quantity") + " | " +
		                rs.getString("unit") + " | " +
		                rs.getDouble("price"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
