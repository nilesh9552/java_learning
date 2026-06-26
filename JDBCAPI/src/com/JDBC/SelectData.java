package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectData {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        Connection con = connectivity.conn();

        do {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            PreparedStatement get = con.prepareStatement(
                    "select * from student where id = ?");
            get.setInt(1, id);

            ResultSet rs = get.executeQuery();

            if (rs.next()) {
                System.out.println("Id is : " + rs.getInt("id"));
                System.out.println("Name is : " + rs.getString("name"));
                System.out.println("City is : " + rs.getString("city"));
                System.out.println("=================");
            } else {
                System.out.println("Student not found!");
            }

            System.out.println("Enter 0 to continue or any number to exit:");
            id = sc.nextInt();

            if (id != 0) {
                break;
            }

        } while (true);

        con.close();
        sc.close();
    }
}