package com.revature.java1;

public class Saiyan {
	/**
	 * # Topic: More on Classes
	 * 
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
	 * 
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
		// DEMO: we will use a control flow statement here to substract our defense when a saiyan defends an opponent's attack.
		/**
		 * # Topic: Control Flow Statements
		 * 
		 * [END OF NOTE]
		 */
		// DEMO: first, let's find the difference between the current defense level and the incoming damage.
		int remainingDefense = this.defenseLevel - damage;
		if(remainingDefense <= 0) {
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
	 * 
	 * [END OF NOTE]
	 */

	@Override
	public String toString() {
		return "Name: " + name + ", powerLevel: " + powerLevel + ", defenseLevel: " + defenseLevel;
	}
}
