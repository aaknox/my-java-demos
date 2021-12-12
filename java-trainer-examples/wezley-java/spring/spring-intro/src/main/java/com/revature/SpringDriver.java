package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Coach;
import com.revature.beans.FootballCoach;

public class SpringDriver {

	public static void main(String[] args) {
		
		// Demo 1 - Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Demo 1 - Retrieve a bean from the Spring container
		Coach coach = context.getBean("myCoach", Coach.class); // Spring will automatically cast our implementation of the Coach interface
		
		// Demo 1 - Call getDailyWorkout() on the retrieved bean
		System.out.println(coach.getDailyWorkout());
		
		// Demo 2 - Call getMotivation() on the retrieved bean
		System.out.println(coach.getMotivation());
		
		System.out.println("+------------------------------------------------------------------+");
		
		// Demo 2 - Retrieve a FootballCoach bean from the Spring container
		FootballCoach footballCoach = context.getBean("myFootballCoach", FootballCoach.class);
		
		// Demo 2 - Call methods on the retrieved bean
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getMotivation());
		
		// Demo 2 - Call getters on FootballCoach fields to demonstrate literal value injection
		System.out.println(footballCoach.getEmail());
		System.out.println(footballCoach.getTeam());
		
		// Close the container
		context.close();
		
	}
	
}
