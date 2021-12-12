/**
 * @author Wezley Singleton
 */

package com.revature.oop.abstraction;

public class AnimalExample {
	
	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		Cat yourCat = new Cat(8, "Sphinx");
		Cat hisCat = new Cat(5, "Persian");
		Cat herCat = new Cat(2, "Savannah", true);
		
		//Covariance!
		Animal myAnimal = new Cat();
		
		System.out.println(myCat.getBreed());
		System.out.println(yourCat.isHasFur());
		System.out.println(hisCat.isHasFur());
		herCat.makeSound();
		
		System.out.println(myAnimal.numberOfLives);
		myAnimal.makeSound();
	}

}
