/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.io.*;
import java.sql.*;

public class GFG {
	public static void main(String[] args) throws Exception
	{
		String url
			= "jdbc:mysql://localhost:3306/db"; // table details
		String username = "root"; // MySQL credentials
		String password = "Happy@8438";
		String query
			= "select *from persons"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st = con.createStatement();
		ResultSet rs
			= st.executeQuery(query); // Execute query
		rs.next();
		String name
			= rs.getString("personid"); // Retrieve name from db

		System.out.println(name); // Print result on console
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}

