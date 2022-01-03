package oop;

public abstract class GenericObject {
	/*
	 * This is an abstract class used to show abstraction 
	 * as well as inheritance by the SpecificObject class
	 */
	public GenericObject() {
		System.out.println("No-arg constructor called for generic object");
	}
	
	public GenericObject(String word) {
		this.word = word;
		System.out.println("1-arg constructor for generic object called");
	}
	
	public String word;
	public void doSomething() {
		System.out.println("doing something generically...");
	}
}
