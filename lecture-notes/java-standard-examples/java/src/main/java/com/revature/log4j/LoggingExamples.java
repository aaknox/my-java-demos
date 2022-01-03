/**
 * @author Yuvi
 * modified by Andrew Crenwelge
 */

package com.revature.log4j;

import org.apache.log4j.Logger;

public class LoggingExamples {

	final static Logger log = Logger.getLogger(LoggingExamples.class);
	
	public static void main(String[] args) {
		// notice the levels used here. The order corresponds to what type of information is going
		//	to be logged. By changing the configuration file setting to different levels,
		//	we can control what messages are logged and to where.
		System.out.println("regular sysout without log4j");
		log.trace("trace message - very fine-grained");
		log.debug("this statement should be useful for debugging the application");
		log.info("informational messages use this level of logging");
		log.warn("something bad potentially could be happening");
		log.error("something went wrong...");
		log.fatal("something catastrophic happened!");
		new LoggingExamples().verifyExceptions();
	}
	
	@SuppressWarnings("unused")
	public void verifyExceptions() {
		if (10 == 20) 
			log.error("what? are you talking about? ");
		 else 
			log.info("its not cool!!!");
	}

}
