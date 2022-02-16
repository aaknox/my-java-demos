package com.revature.java1;

/**
 * # Topics: Enums in Java
 * - An enum is a special class that stores a list of constants (aka fixed possible values).
 * - Useful when you know what the state of logic within your program should be:
 * ex. in a video game, you can either: START, PLAY, PAUSE, FINISH
 * [END OF NOTE]
 */
public enum Gender {
	Male, Female, Unsure; 
	public String getPronoun() {
		switch (this) {
		case Female: {
			return "She";
		}
		case Male:
			return "He";
		default:
			return "They";
		}
	}
}
