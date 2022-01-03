package logging;

import org.apache.log4j.Logger;

public class MyLogger {
	
	final public static Logger logger = Logger.getLogger(MyLogger.class);
	

	public static void main(String [] spaghetios) {
		
		logger.info("information messages");
		logger.warn("warning messages");
		logger.error("error messages");
		logger.debug("debug messages");
		logger.fatal("fatal messages");

		
		
	}

}
