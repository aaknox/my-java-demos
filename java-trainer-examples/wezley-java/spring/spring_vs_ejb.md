# The Problem with EJBs
	
	- Early versions of J2EE's Enterprise Java Beans (EJBs) were extremely complex
		? Multiple deployment descriptors were necessary
		? Developers had to define and implement multiple interfaces
		? After all the overhead was complete, the performance of the entity beans was poor
	
	- The community still did J2EE web development, but without the use of EJBs
		? This led to the development of the Spring Framework

# Timeline:
	
	1999 - J2EE 1.2 released
	
	2001 - J2EE 1.3 released
	
	2003 - J2EE 1.4 released
	
	2004 - Spring 1.0 released
	
	2006 - Java EE 5 & Spring 2.0 released
		§ Sun Microsystems refactored EJB framework to be easier to use
		§ Essentially becomes equivalent to Spring in functionality
			? But lost first-mover advantage and has a bad reputation
				
	2009 - Java EE 6 & Spring 3.0 released
	
	2013 - Java EE 7 & Spring 4.0 released
	
	2016 - Java EE 8 & Spring 4.3 released
	
	2017 - Spring 5.0 released
		§ Requires Java 8 at minimum
		§ Deprecates legacy libraries: Tiles, Velocity, Portlets, etc.
		§ Upgraded Spring MVC to use new versions of Servlet API 4.0
		§ Added new reactive programming framework: Spring WebFlux
		§ Release Notes: https://docs.spring.io/spring/docs/current/spring-framework-reference/index.html