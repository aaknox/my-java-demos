package com.revature.azhya.example;

import org.apache.log4j.Logger;

/**
 # Topic: Logging
 * 
 * [END OF NOTE]
 **/
public class Driver {

	private static Logger log = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethod("Hello first log message!");
		
	}
	
	public static void testMethod(String message) {
		log.info(message);
	}

}
