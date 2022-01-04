/**
 # Topic: Packages & Imports
 - A package is a group of similar types of classes, interfaces and sub-packages. 

- Packages can be categorized in two forms:
	1. built-in package (like java, lang, awt, javax, swing, net, io, util, etc.)
	2. user-defined package (like the one we just made)

- Advantages Of Packages: 
a) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
b) Java package provides access protection (becoming more modular).
c) Java package removes naming collision and confusion.

- But what if I need to access a package from another package?
	- Use **imports** to access the package from outside the package.

[END OF NOTE]
 */
package com.revature.java1;
//single line comment
/*
 * multiple line comment here
 * @author none <- notice that it didn't glow after making it like the JavaDoc did
 */
/** 
 * @author Azhya Knox
 * @see you later JavaDocs
 * 
 */
/**
 * # Topic: Comments
 * 
 * - Comments are the statements that are not executed by the compiler and interpreter.
 * - This allows devs to provide information about the variables, methods, classes, etc. within the program, which is very helpful as the complexity of the application grows.
 * - How to make a comment in Java:
 * 		- single-line comment using //
 * 		- multi-line comment using backslash, asterisk, asterisk, backslash 
 * 		- documentation comments are made in Java using slash followed by double asterisks [hey you already using JavaDocs here :)]
 * 			- In JavaDocs, there are special **tags** that are used to generate clear documentation info.
 * [END OF NOTE]
 */


public class Program {

	/**
	 * # Topic: Classes vs Objects
	 * - An object is a virtual representation of a physical entity, like a pen, a dog, a car, etc.
	 * - A class is a blueprint from which you can create objects in your program, making any object an **instance** of a class.
	 * [END OF NOTE]
	 */
	
	/**
	 * # Topic: The Main Method
	 * - Firstly, what is a method?
	 * 		- A method is a block of code which only runs when it is called. 
	 * 		- You can pass data, known as parameters, into a method. 
	 * 		- Methods are used to perform certain actions in your code.
	 * - The **main method** serves as the entry point of any java program.
	 * [END OF NOTE]
	 * 
	 * # Topic: Access Modifers vs Non-access Modifers
	 * - You noticed the method signature of the main method as:
	 * 		- public = visible to all
	 * 		- static = the particular member belongs to a type itself, rather than to an instance of that type. This means that the class loads into memory by the JVM for makes for easier calls to that method
	 * 		- void = returns nothing
	 * - But what do they do?
	 * - **Access modifiers** are...
	 * - **Non-access modifiers** are...
	 * [END OF NOTE]
	 * 
	 * # Topic: Initializer Blocks
	 * 
	 * [END OF NOTE]
	 */
	
	// DEMO: let's comment this method out and see what happens!
	// DEMO: result = code won't compile because the JVM doesn't know where to start! Thus the error!
	// DEMO: now let's try this static initializer block and see what happens!
	// DEMO: by itself, program still doesn't compile :(
	// DEMO: but what if I have both blocks of code?
	// DEMO: result = both blocks run
	/*
	static {
		System.out.println("Hello initializer block!");
	}
	
	 * I'm just holding ALT key and moving up/down using the arrow keys (ALT+up/ALT+down) to move my code around. ¯\_()_/¯ simple, right?
	 */
	
	public static void main(String[] args) {
		// System.out.println("Hello Java!");
		
		// DEMO: Let's make our first object!
		//Saiyan ssj = new Saiyan("Goku", 9000, "Kamehameha", Gender.Male);
		// DEMO: why is the object showing up like this?
		// DEMO: Because we didn't override the super class (aka the Object class) method for toString!
		// System.out.println(ssj);
		
		//DEMO: now it's showing our Saiyan :)! Let's scan our Saiyan to see how strong he is.
		// System.out.println(ssj.dragonRadarScan());
		
		// DEMO: Scan complete! He's strong. Now let's see his attack!
		//System.out.println(ssj.attack());
		
		// DEMO: The attack is good, but....he has no one to fight. Let's fix that!
		//Saiyan vPrince = new Saiyan("Vegata", 8000, "Galick Gun", Gender.Male);
		
		// DEMO: Now before we battle these two, let's go back to our object class and add a defend method and battle class so we can find out who will win.
		// DEMO: Now that all that work is done, let's see if it works!
		Saiyan dad = new Saiyan(Gender.Male, "Goku", 9001, "Spirit Bomb", 10000);
		Saiyan son = new Saiyan(Gender.Male, "Gohan", 15000, "Ultimate Kamehameha", 3000);
		
		//DEMO: battle # 1
		//NOTE: Winner goes to Gohan
		//Battle stadium = new Battle(son, dad);
		//stadium.battleForTheAges();
		
		//DEMO: battle # 2
		//NOTE: Goku wins this fight
		//Battle stadium = new Battle(dad, son);
		//stadium.battleForTheAges();
		
		//DEMO: Final battles will be a set of clone wars between each fighter.
		// Assuming that the clone is always defending.
		//NOTE: DEF Goku wins here
		//Battle clonewars1 = new Battle(dad, dad);
		//clonewars1.battleForTheAges();
		
		//NOTE: ATK Gohan should win here
		//Battle clonewars2 = new Battle(son, son);
		//clonewars2.battleForTheAges();
		
		//DEMO: Yay! The math is mathing!!
	}

}
