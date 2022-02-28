package com.revature.otherjava;

/**
 * Topic: Interfaces
 * - An interface acts as a contract for behaviors that a class can implement.
 * - When a class implements an interface, it must implement all the methods declared in the interface.
 * 		- LOOPHOLE IN THE CONTRACT: The implementing class doesn't have to declare the interface's methods if the class itself is abstract.
 * - By default, all methods in interfaces are public & abstract; variables are public, static, and final.
 * - Q: When to use an abstract class over interface, and vice versa?
 * 		- AC: when you need a template for any group of subclasses (ex. Animal clas as template for dog, bird, lizard subclasses)
 * 		- I: when you need a role defined despite of inheritance of classes in your program (ex. for bank system, user has 3 roles: customer, employee, and admin)
 *[END OF NOTE] 
 **/
public interface Menu {
	String mainMenu();
	String welcomeMessage(int id);
	double convertToDouble(int id);
	int convertToInt(double id);
	boolean convertToObject(int id);
}
