package com.revature.beans;

import com.revature.services.MotivationService;

public class TrackCoach implements Coach {

	// Demo 2 - Define a private field for the dependency
	private MotivationService motivationService;
	
	// Demo 2 - Add no-args constructor to fix errors in Driver.java
	public TrackCoach() { }

	// Demo 2 - Define a constructor for dependency injection
	public TrackCoach(MotivationService motivationService) {
		this.motivationService = motivationService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Today's workout: Run a 30-minute 5K.";
	}

	@Override
	public String getMotivation() {
		return "The track coach says: " + motivationService.getMotivation();
	}

}
