package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	Connection cn = null;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/message", "root", "");
			System.out.println("Connectio Done..");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}
