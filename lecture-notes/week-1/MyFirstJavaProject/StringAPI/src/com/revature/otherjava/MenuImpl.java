package com.revature.otherjava;

public class MenuImpl implements Menu {

	@Override
	public String mainMenu() {
		// DEMO: Let's use StringBuffer here to compose our main menu
		StringBuffer buff = new StringBuffer();
		buff.append(
			"\nWelcome to my application!\n"
			+ "Choose from the following options:\n"
			+ "1) convert your id number into a double\n"
			+ "2) convert your id number into a int\n"
			+ "3) convert your id number into a object and check if it equals 100\n"
			+ "0) exit app\n\n"
		);
		return buff.toString();
	}
	
	
	/**
	 * Topic: Annotations
	 * 
	 * [END OF NOTE]
	 **/
	@Override
	public String welcomeMessage(int id) {
		return "Welcome, user #" + id;
	}
	
	
	/**
	 * Topic: Casting
	 * 
	 * [END OF NOTE]
	 **/
	@Override
	public double convertToDouble(int id) {
		return id;
	}

	@Override
	public int convertToInt(double id) {
		return (int)id;
	}

	@Override
	public boolean convertToObject(int id) {
		/**
		 * Topic: Wrapper Classes
		 * 
		 * [END OF NOTE]
		 **/
		String obj = String.valueOf(id);
		return obj.equals("100");
	}

}
