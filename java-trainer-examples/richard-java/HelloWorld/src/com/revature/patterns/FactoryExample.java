package com.revature.patterns;

public class FactoryExample {
	// A factory provides us with an instance of an interface without us having to actually
	// know what the implementation of that interface is.
	public Cheesable getCheesable() {
		return new Cracker();
	}
}
