/**
 * @author Wezley Singleton
 * with some modifications from Andrew
 * with some modifications from Bryn 
 */

package com.revature.oop.abstraction;

public class Frog extends Animal implements Amphibious, Ectothermic {
	
	public static void main(String[] args) {
		Frog first = new Frog();
		first.doSomethingElse();
		
		Swimmable second = new Frog();
		//second.floatOnWater(); Add in during later step
		
		Amphibious third = new Frog();
		third.swim();
		
	}
	
	
	//Recall that Amphibious extends Swimmable-
	//Frog will inherit the abstract swim() method from Swimmable 
	//because it implements Amphibious.
	@Override
	public void swim() {
		System.out.println("Do some stuff...");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coolDown() {
		System.out.println("Its too hot, time to cool down");
	}

	@Override
	public void heatUp() {
		System.out.println("Its too cold, time to heat up");
	}

	//Where is this method being inherited from?
	//Note that it exists in both Amphibious and Ectothermic
	//Essentially this method in one swoop fulfills the implementation for both. 
	@Override
	public void sameMethodSignature() {
		System.out.println("Fulfill requirements of both intfaces.");
		
	}


}
