package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private static ConnectionFactory cf;
	private static boolean build = true;
	
	private ConnectionFactory() {
		build = false;
	}
	
	public static synchronized ConnectionFactory getInstance() {
		return (build) ? cf = new ConnectionFactory() : cf;
	}
	
	public Connection getConnection() {
		
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
			
			prop.load(new FileReader("C:\\Users\\Wezley\\batch-repos\\1806-Jun18-Java-USF\\"
					+ "Week_2-SQL_JDBC\\jdbc-demo\\src\\main\\resources\\application.properties"));
			
			Class.forName(prop.getProperty("driver"));
			
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("pw"));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
