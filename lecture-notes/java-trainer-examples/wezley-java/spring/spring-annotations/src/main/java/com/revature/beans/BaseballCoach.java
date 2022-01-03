package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.services.MotivationService;

@Component("myBaseballCoach") // the string here represents the bean name (can be anything we want)
public class BaseballCoach implements Coach {
	
	private MotivationService motivationService;
	
	public BaseballCoach() { }
	
	@Autowired
	public BaseballCoach(MotivationService motivationService) {
		this.motivationService = motivationService;
	}

	@Override
	public String getDailyWorkout() {
		return "Today's workout: Spend 30 minutes on batting practice.";
	}

	@Override
	public String getMotivation() {
		return "The baseball coach says: " + motivationService.getMotivation();
	}

}
