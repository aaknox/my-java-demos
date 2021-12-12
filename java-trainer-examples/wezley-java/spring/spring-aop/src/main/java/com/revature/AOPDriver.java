package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Bear;

public class AOPDriver {

	public static void main(String[] args) {

		// We can use the interface ApplicationContext instead...
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		// Get Bear bean from the container
		Bear b = (Bear) ac.getBean("bear");
		
		// Setup stuff
		Bear.setIsWinter(true);
		b.setIsFull(false);
		
		try {
			// Play around with some Bear methods
			System.out.println("bear full? "+ b.getIsFull());
			b.bearHibernates();
			
			System.out.println("bear asleep? "+b.getIsAwake());
			b.wakeUpBear();
		} catch (Exception e) {
			e.printStackTrace();
		}

		((AbstractApplicationContext) ac).close();

	}
}
