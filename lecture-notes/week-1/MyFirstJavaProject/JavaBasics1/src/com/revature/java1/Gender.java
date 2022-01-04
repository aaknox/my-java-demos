package com.revature.java1;

/**
 * # Topics: Enums in Java
 * 
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
