package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect {

private static Logger log = Logger.getRootLogger();
	
	// Only occurs after methods that execute normally
	@AfterReturning(pointcut="within(com.revature.beans.*)")
	public void logAfter(JoinPoint jp) {
		log.info(jp.getSignature());
	}
	
	// Only occurs after methods that throw exceptions
	@AfterThrowing(pointcut="within(com.revature.beans.*)")
	public void logAfterThrow(JoinPoint jp) {
		log.error(jp.getSignature());
	}
	
	@Before("execution(* bearHibernates())")
	public void logTraceAfter() {
		log.debug("bear is trying to hibernate");
	}
	
	/*
	 trace
	 debug
	 info
	 warn
	 error 
	 fatal
	 */
}
