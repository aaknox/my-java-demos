/**
 * @author Wezley Singleton
 * with some modifications from Bryn
 */

package com.revature.oop.abstraction;

//Interfaces are implicitly abstract, you can add it - but it makes no difference.
public interface Swimmable {

	// All fields declared within an interface are implicitly public static final
	int MY_INT = 35;
	
	// the abstract keyword and public access modifier are implied on any method stubs
	void swim();
	
	// Since Java 8, we can declare and provide implementation for default methods
//	default void floatOnWater() {
//		System.out.print("The Swimmable object is doing something else...");
//	}
	//Add in during later step. 
}