package oop;

public class Dog extends Animal {
	public static void main(String[] args) {
		System.out.println("Polymorphism example: ");
		Animal a = new Animal();
		a.move();
		Animal b = new Dog();
		b.move();
		// set reference variable a to the dog object
		a = b;
		a.move();
	}
	public void move() {
		System.out.println("the dog is running");
	}
}
