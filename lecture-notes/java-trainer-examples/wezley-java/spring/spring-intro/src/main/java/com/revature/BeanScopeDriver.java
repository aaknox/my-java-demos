package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Coach;

public class BeanScopeDriver {

	public static void main(String[] args) {
		
		// Demo 3 - Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopes-beans.xml");
		
		// Demo 3 - Retrieve a bean from the Spring Container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach assistantCoach = context.getBean("myCoach", Coach.class);
		
		// Demo 3 - Check if the two beans retrieved from the Spring Container are the same
		boolean result = (coach == assistantCoach);
		
		// Demo 3 - Print out the results and memory locations
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location for 'coach': " + coach);
		System.out.println("Memory location for 'assistanceCoach': " + assistantCoach);
		System.out.println(coach.getMotivation());
		
		// Demo 3 - Close the context
		context.close();
	}
	
}
