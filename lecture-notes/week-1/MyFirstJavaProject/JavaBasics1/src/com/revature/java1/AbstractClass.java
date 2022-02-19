package com.revature.java1;

// DEMO: Note when I remove the abstract keyword from the class signature, it showed up as a error.
// So if any class contains abstract methods, that class must also be abstract.
// Also note: A class cannot be both abstract and final (since a final class cannot be extended).
public abstract class AbstractClass {
	
	//DEMO: An abstract class may contain both abstract methods as well normal methods.
	public static void myRegularMethod() {
		System.out.println("Hello normal people!");
	}
	
	//Note that all abstract methods are set to default --by default!
	abstract void myMethod();
}
