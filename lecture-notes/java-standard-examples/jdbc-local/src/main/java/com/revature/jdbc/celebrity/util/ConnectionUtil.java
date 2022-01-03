/**
 * @author Peter Alagna
 */


package com.revature.jdbc.celebrity.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * Utility class to obtain a connection object.
 *
 */
public class ConnectionUtil {

	private static Logger logger = Logger.getLogger(ConnectionUtil.class);

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "CELEBRITY_DB";
		String password = "password";

		return DriverManager.getConnection(url, username, password);
	}

	/** Test that connection is working **/
	public static void main(String[] args) {
		/*
		 * Try with resources will close resources automatically
		 * 
		 * Classes in this kind of try's need to implement AutoCloseable
		 */
		try(Connection connection = ConnectionUtil.getConnection()) {
			logger.info("Connection successful");
		} catch (SQLException e) {
			logger.error("Couldn't connect to the database", e);
		}
	}
}
