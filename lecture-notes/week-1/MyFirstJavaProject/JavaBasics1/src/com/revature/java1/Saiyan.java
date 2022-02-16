package com.revature.java1;

public class Saiyan {
	/**
	 * # Topic: More on Classes
	 * - Each class can have properties (attributes like name, powerLevel, move, etc) and behaviors (methods like attack, defend).
	 * - In order to be able to create an instance of our objects from our class or **instantiate** our class, we must use a **constructor**.
	 * [END OF NOTE]
	 */
	
	private Gender gender;
	private String name;
	private int powerLevel;
	private String ultimateMove;
	// DEMO: For our battle, each saiyan will get a defense level to show how much damage they can take before they are defeated.
	private int defenseLevel;
	
	/**
	 * # Topic: Constructors
	 * 
	 * [END OF NOTE]
	 */
	
	public Saiyan() {
		super();
	}
	
	public Saiyan(Gender gender, String name, int powerLevel, String ultimateMove, int defenseLevel) {
		super();
		this.gender = gender;
		this.name = name;
		this.powerLevel = powerLevel;
		this.ultimateMove = ultimateMove;
		this.defenseLevel = defenseLevel;
	}

	/**
	 * # Topic: Getters & Setters
	 * - Note that our variables in this class are set to private in order to properly **encapsulate** sensitive data from our users.
	 * - In order to update our private fields, we must use public get/set methods.
	 * - Getters will return the variable value.
	 * - Setters will set or assign the value to the variable.
	 * [END OF NOTE]
	 */
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	public String getUltimateMove() {
		return ultimateMove;
	}

	public void setUltimateMove(String ultimateMove) {
		this.ultimateMove = ultimateMove;
	}

	public int getDefenseLevel() {
		return defenseLevel;
	}

	public void setDefenseLevel(int defenseLevel) {
		this.defenseLevel = defenseLevel;
	}

	/*
	 * These are our user-defined methods.
	 */
	public String attack() {
		return this.name + " attacks using " + this.ultimateMove + "!";
	}
	
	public String defend(int damage) {
		// DEMO: we will use a control flow statement here to subtract our defense when a saiyan defends an opponent's attack.
		/**
		 * # Topic: Control Flow Statements
		 * 
		 * - The Java compiler executes code from top to bottom.
		 * - Control flow statements are the order in which instructions, statements and function calls being executed or evaluated 
		 * when a program is running.
		 * 
		 * - Types of control flow statements:
		 * -- if/else if/else
		 * -- switch
		 * -- for
		 * -- while/do while
		 * -- enhanced for-each
		 * 
		 * - You can also label your control flow statements with a custom name in your code.
		 * -- You can also skip the execution step using break or resume execution with continue.
		 * 
		 * [END OF NOTE]
		 */
		// DEMO: first, let's find the difference between the current defense level and the incoming damage.
		int remainingDefense = this.defenseLevel - damage;
		
		defenseStatus: if(remainingDefense <= 0) {
			//DEMO: if remaining is 0 or negative, return 0 defense to that saiyan.
			this.setDefenseLevel(0);
			return this.name + " defended the attack! [0 defense remaining.]";
		}else {
			//DEMO: if remaining is not 0 and positive, then set the remaining as the new defense level of that saiyan and return the defend statement.
			this.setDefenseLevel(remainingDefense);
			return this.name + " defended the attack! [" + remainingDefense + " defense remaining.]";
		}
	}
	
	public String dragonRadarScan() {
		return this.gender.getPronoun() + " has a power level over " + this.powerLevel + "!!!";
	}
	
	/**
	 * # Topics: The Object Class and its methods
	 * - Every class in Java is directly or indirectly derived from the Object class.
	 * - Therefore, the Object class serves as the root of inheritance of all Java classes.
	 * - There are some methods that are within this class that we can use by overriding them:
	 * -- toString() = provides a string representation of your object
	 * -- hashCode() = provides a JVM-generated, unique number that represents the internal address of your object by using internal algorithm
	 * -- equals(Object obj) = compares the given object (in the parameters) to “this” object (your object that is calling the method)
	 * -- finalize() = called to flag an object for garbage collection (DOES NOT force GC)
	 * [END OF NOTE]
	 */

	@Override
	public String toString() {
		return "Name: " + name + ", powerLevel: " + powerLevel + ", defenseLevel: " + defenseLevel;
	}
}
