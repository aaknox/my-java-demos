package com.revature.beans;

public class Animal implements Breathes {
	public String name;

	public String getName() {
		System.out.println("Animal's get name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("HELLO");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void breathe() {
		System.out.println("I am breathing.");
	}
	
	
}
