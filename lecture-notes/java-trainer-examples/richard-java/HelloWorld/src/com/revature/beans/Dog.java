package com.revature.beans;

public class Dog extends Animal {
	private String name;
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Fido");
		System.out.println(d.getName());
		Animal a = d;
		a.speak();
		
		System.out.println("Animal's name: "+a.name);
		System.out.println("Dog's name: "+d.name);
		d.breathe();
	}
	
	public String getName() {
		System.out.println("Dog's get name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("Bark");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog []");
		return builder.toString();
	}
		
}
