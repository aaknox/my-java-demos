package com.revature.java1;

public class Battle {

	Saiyan attacker;
	Saiyan defender;
	
	public Battle(Saiyan attacker, Saiyan defender) {
		super();
		this.attacker = attacker;
		this.defender = defender;
	}

	/**
	 * # Topics: Variable Scopes in Java
	 * - Scope is referring to where the variable is accessible in your program.
	 * - 3 Level of scopes in Java:
	 * -- Class/static scope = only accessible within the class
	 * -- Method scope = only accessible within the method
	 * -- Block scope = only accessible within that block of code (ex. int i in a for loop is only usable within that loop)
	 * [END OF NOTE]
	 */
	public void battleForTheAges() {
		boolean isBattleStarted = true;
		int attackerPower = this.attacker.getPowerLevel();
		
		System.out.println("Welcome to the World Tournament! Let's Play!");
		//DEMO: Let's check out our fighters!
		System.out.println("Attacking will be: " + attacker.getName() + ". Attack: " + attacker.getPowerLevel());
		System.out.println("...and Defending will be: " + defender.getName() + ". Defense: " + defender.getDefenseLevel());
		while(isBattleStarted) {
			//DEMO: Now we have our players, let's begin the battle:
			// DEMO: First we must attack!
			System.out.println(attacker.attack());
			
			// DEMO: Next we will call our new defend method from the Saiyan class from our defender object.
			System.out.println(defender.defend(attackerPower));
			
			//DEMO: To determine the winner, we must first find out how much defense does the defender have left.
			int defenderPower = this.defender.getDefenseLevel();
			
			//DEMO: Now let's announce the winner!
			if(defenderPower <= 0) {
				//DEMO: if the defender is down to 0, attacker wins
				System.out.println(attacker.getName() + " wins! What a powerful attack!");
			}else {
				//DEMO: if defender withstand the attack, defender wins
				System.out.println(defender.getName() + " wins! Defense for the win!");
			}
			
			//DEMO: Finally let's close this fight by making the boolean change.
			isBattleStarted = false;
		}
		System.out.println("Is this fight over? Find out on the next episode of DBZ!");
	}
}
