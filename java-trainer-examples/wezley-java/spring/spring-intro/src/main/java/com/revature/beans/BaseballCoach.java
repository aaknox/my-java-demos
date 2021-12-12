package com.revature.beans;

import com.revature.services.MotivationService;

public class BaseballCoach implements Coach {
	
	// Demo 2 - Define a private field for the dependency
	private MotivationService motivationService;
	
	// Demo 2 - Add no-args constructor to fix errors in Driver.java
	public BaseballCoach() { }

	// Demo 2 - Define a constructor for dependency injection
	public BaseballCoach(MotivationService motivationService) {
		this.motivationService = motivationService;
	}

	// Demo 1
	@Override
	public String getDailyWorkout() {
		return "Today's workout: Spend 30 minutes on batting practice.";
	}

	// Demo 2
	@Override
	public String getMotivation() {
		return "The baseball coach says: " + motivationService.getMotivation();
	}

}
