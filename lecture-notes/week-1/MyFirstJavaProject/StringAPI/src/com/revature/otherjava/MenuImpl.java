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
	 * - Annotations are special constructs in Java that provide metadata for your Java code.
	 * - Denoted by the @ sign
	 * - There are built-in annotations in Java, like @Depreciated, @Override, and @SuppressWarnings for example
	 * [END OF NOTE]
	 **/
	@Override
	public String welcomeMessage(int id) {
		return "Welcome, user #" + id;
	}
	
	
	/**
	 * Topic: Casting
	 * - You can typecast to convert a variable of one data type to another.
	 * 		- Upcasting = (wide) = converts small data types to larger ones.
	 * 		- Downcasting = (narrow) = converts large data types to smaller ones.
	 * - The rules of casting:
	 * - Remember: Java doesn't like debbie downers when casting its net but does like its eggs sunnyside up.
	 * 		- Java can automatically upcast.
	 * 		- Java will throw an error when trying to automatically downcast.
	 * 		- This is because data is often lost when downcasting.
	 * 		- Downcasting must be done manually (aka programmatically done by you).
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
		 * - Wrapper classes are class that encapsulates around their respective primitives (this concept can also be called boxing).
		 * 		- allows us to use primitives as objects
		 * 		- ex. int -> Integer, double -> Double, char -> Character, etc.
		 * 		- So:
		 * 			from primitive to wrapper -> Autoboxing (as name suggests, Java does this for us automatically)
		 * 				- placing a toy into a giftbox
		 * 			from wrapper to primitive -> Unboxing
		 * 				- removing toy from giftbox
		 * - NOTE: Wrapper classes ARE NOT generics, but are used commonly with generic collections (will come up in QC).
		 * [END OF NOTE]
		 **/
		String obj = String.valueOf(id);
		return obj.equals("100");
	}

}
