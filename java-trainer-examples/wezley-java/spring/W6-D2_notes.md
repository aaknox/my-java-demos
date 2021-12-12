# Spring Configured using Annotations

1) Discuss scanning for component classes
	- Spring will scan our Java classes for Spring annotations
	- Spring automatically registers the beans in the container

2) Scanning for component classes (Demo 1)
	- Dev Process:
		a) enable component scanning in the beans.xml
		b) add the @Component annotation to Java classes
		c) retrieve beans from the Spring container

	- Create spring-annotations project
		a) copy over POM info
		b) copy packages from spring-intro
		c) delete driver classes

	- Create AnnotationDriver class
		a) create empty main method
		
	- Create beans.xml
		a) add component-scan tag for the top level package

	- Add @Component to BaseballCoach, TrackCoach, and FootballCoach
		a) give a user-defined bean id to BaseballCoach and FootballCoach
		b) let Spring give TrackCoach a default id

	- Implement main method in AnnotationDriver to get a bean from container and run getDailyWorkout()

	- Demonstrate NullPointerException when you try to call .getMotivation()
		a) explain that it is because we did not register our MotivationServiceImpl class with Spring, so it is not managing it

	- Demonstrate getting a bean from the container when we did not specify a bean id

	- Demonstrate getting a bean from the container using the wrong bean id, to show NoSuchBeanException

	- Discuss how for dependency injection, Spring can use autowiring
		+ Spring will look for a class that matches the property (by type or by name)
		+ Spring will then inject the appropriate dependency automatically 

	- Discuss the different types of @Component (@Controller, @Service, @Repository)

		
		 Annotation | Meaning                                             
		---------------------------------------------------------------------
		 @Component | generic stereotype for any Spring-managed component 
		 @Repository| stereotype for persistence layer                    
		 @Service   | stereotype for service layer                        
		 @Controller| stereotype for presentation layer (spring-mvc)      
		

	- Add @Autowired to BaseballCoach, TrackCoach, and FootballCoach's MotivationServiceImpl fields
		+ Point out that @Autowired can be placed on the constructor, a field, a setter method, or any method that takes the dependency as an argument

3) Discuss when to use which injection method
	+ Pick an approach and stay consistent in your project
	+ You get the same functionality regardless of the type you use
 