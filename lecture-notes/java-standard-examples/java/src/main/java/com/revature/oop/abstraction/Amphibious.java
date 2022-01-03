/**
 * @author Wezley Singleton
 * with some modifications from Bryn
 */

package com.revature.oop.abstraction;

/*
 * Interfaces can extend one another, and even extend multiple interfaces if desired.
 */
public interface Amphibious extends Swimmable {
	
	//Note that any implementing class of Amphibious will inherit the abstract swim method as well
	
	default void doSomethingElse() {
		System.out.println("The Amphibious object is doing something else...");
	}
	
	//Note that we define a method of the same signature in Ectothermic
	void sameMethodSignature();

}
