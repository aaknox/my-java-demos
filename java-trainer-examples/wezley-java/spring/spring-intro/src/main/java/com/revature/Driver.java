package com.revature;

import com.revature.beans.BaseballCoach;
import com.revature.beans.Coach;
import com.revature.beans.TrackCoach;

@SuppressWarnings("unused")
public class Driver {
	
	public static void main(String[] args) {
		
		// Demo 1 -  Create some Coach objects
//		BaseballCoach coach = new BaseballCoach();
//		Coach coach = new BaseballCoach();
		Coach coach = new TrackCoach();
		
		// Demo 1 -  Use the BaseballCoach object
		System.out.println(coach.getDailyWorkout());
		
	}

}
