package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.beans.Bear;

@Aspect
@Component
public class BearAspect {

	@Before("execution(* bearHibernates())")
	public void stockedUpForWinter(JoinPoint jp) {
		Bear b = (Bear) jp.getTarget();
		if(b.getIsFull()) {
			System.out.println("Bear was stocked up and ready for winter");
		} else {
			System.out.println("Bear is going to be hungry when he wakes up");
		}
	}
	
	// Most powerful advice type (allows for actions to be taken before and after method execution
	@Around("execution(* wake*(..))")
	public void wakeAnimal(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before around");
		long start = System.currentTimeMillis();
		pjp.proceed(); // allows the method to proceed; used with @Around
		long end = System.currentTimeMillis();
		System.out.println("after around, took: " + (end-start));
	}
	
}
