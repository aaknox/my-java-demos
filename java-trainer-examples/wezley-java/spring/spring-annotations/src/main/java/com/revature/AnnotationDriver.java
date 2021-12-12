package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Coach;

public class AnnotationDriver {
	
	public static void main(String[] args) {
	
		// Read the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get beans from the container
		Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class); // using user-defined bean name
		Coach trackCoach = context.getBean("trackCoach", Coach.class); // using default bean name
//		Coach footballCoach = context.getBean("footballCoach", Coach.class); // using incorrect bean name to show NoSuchBeanDefinitionException
		
		// Call some methods on the retrieved beans
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getMotivation());
		System.out.println(trackCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
