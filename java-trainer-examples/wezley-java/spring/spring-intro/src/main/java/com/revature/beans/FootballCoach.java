package com.revature.beans;

import com.revature.services.MotivationService;

public class FootballCoach implements Coach {

	private String email;
	private String team;
	private MotivationService motivationService;
	
	public FootballCoach() {
		System.out.println("[DEBUG] - Inside FootballCoach no-arg constructor");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("[DEBUG] - Inside FootballCoach.setEmail()");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("[DEBUG] - Inside FootballCoach.setTeam()");
		this.team = team;
	}

	// The dependency is injected using setting injection rather than using a constructor
	public void setMotivationService(MotivationService motivationService) {
		System.out.println("[DEBUG] - Inside FootballCoach.setMotivationService()");
		this.motivationService = motivationService;
	}

	@Override
	public String getDailyWorkout() {
		return "Today's workout: Do suicide runs to the 40, 60, 80, and 100 yard lines.";
	}

	@Override
	public String getMotivation() {
		return "The football coach says: " + motivationService.getMotivation();
	}
}
