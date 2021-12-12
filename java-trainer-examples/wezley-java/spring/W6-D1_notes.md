# Spring Intro Lecture

-------------------------------------------------------------------

1) Introduce Spring Framework (Board Notes)
	- Lecture Notes: spring_30000.md
	- Lecture Notes: spring_vs_ejb.md
	- Lecture Notes: spring_framework_overview.md
	- Lecture Notes: spring_projects.md

--------------------------------------------------------------------

2) Intro to Spring using XML (Demo 1)
	a) Create project
		a1) Talk about how this app needs to be able to get daily workouts from some coach object
		a2) Needs to be configurable

	b) Add Spring dependencies to POM

	c) Create BaseballCoach class
		c1) implement getDailyWorkout()

	d) Create Driver class
		d1) implement main method (create coach object, and use it - simple Java 101 stuff)

	e) Discuss best practice of coding to an interface, rather than directly to a POJO

	f) Create a Coach interface
		f1) declare getDailyWorkout() stub
		f2) have BaseballCoach implement Coach

	g) Create TrackCoach class
		g1) implement Coach interface

	h) Refactor Driver to use TrackCoach instead of BaseballCoach
		h1) Talk about how this is still hard-coded, and why we need a configuration file to our app

	i) Discuss ideal solution to our hard-coded example:
		i1) Driver should be able to talk to some sort of object provider that references a configuration file
		i2) This configuration file should tell the object provider what kind implementation to provide
		i3) Talk about how we will leverage Spring to be this "object provider"

	j) Review primary functions of the Spring framework:
		j1) Create and manage objects (beans) through Inversion of Control
		j2) Inject object dependencies with dependency injection

	k) Discuss methods of configuring Spring Container
		k1) XML configuration (legacy)
		k2) Java annotations
		k3) Java class configuration

	l) Discuss Spring development process:
		l1) Configure Spring beans (POJOs)
		l2) Create a Spring Container (ApplicationContext)
			l2-a) Implementations:
				- ClassPathXmlApplicationContext
				- AnnotationConfigApplicationContext
				- GenericWebApplicationContext
				- more...
		l3) Retrieve beans from the Spring container

	m) Create beans.xml
		m1) Configure a bean using the implementation of TrackCoach	

	n) Create SpringDriver class
		n1) Load the Spring configuration file
		n2) Retrieve a bean from the Spring container
		n3) Call a method on the retrieved bean
		b4) Close the Spring container

	o) Change the configuration file to use the implementation of BaseballCoach

-------------------------------------------------------------------

3) Review Dependency Injection
	- Car Factory and Car analogy

	- Dependency injection = the objects that make up the car

	- Contrast with the object provider from Demo 1

	- Discuss Demo 2 overview:
		+ Coach will also provide motivational quotes using the MotivationService
		+ MotivationService will be a dependency of Coach objects

	- Talk about different types of dependency injection:
		+ Constructor injection
		+ Setter injection
		+ Auto-wiring (uses annotations)

----------------------------------------------------------------

4) Dependency Injection using XML (Demo 2)
	- Development Process - Constructor Injection
 		+ Define the dependency interface and class
		+ Create a constructor in our class for injections
		+ Configure the dependency injection in the Spring config file (beans.xml)

	a) Create MotivationService interface and MotivationServiceImpl
		a1) getMotivation()

	b) Refactor Coach interface to include getMotivation() stub
		b1) Refactor implementing classes

	c) Add sysout() to SpringDriver to make use of new method in Coach classes

	d) Switch Coach bean to different implementation

	e) Reconfigure beans.xml
		e1) Add bean (MotivationService)
		e2) Use <constructor-arg> tag to inject MotivationService into Coach bean

	f) Discuss how we can do the same thing using setter injection
		f1) Discuss how the name of the property in the beans.xml will be used to reference a setter method

	g) Create FootballCoach and implement Coach methods
		g1) Include sysout() in no-arg constructor and setter method

	h) Add new bean to beans.xml for FootballCoach
		h1) Add property to bean for setter injection
	
	i) Add some code to utilize this new bean into the SpringDriver class
		i1) Point out that the sysout() from FootballCoach are executed when the ApplicationContext is loaded

	j) Discuss how we can inject literal values into our objects
		- Development process:
			+ Add some private fields to FootballCoach
			+ Create setter methods in class for injections
			+ Configure the injection in beans.xml

	k) Add private fields to FootballCoach
		+ email & team
	
	l) Create getter/setter methods for new fields

	m) Configure setter injection in beans.xml

	n) Discuss how we could use a properties file to accomplish the same thing

	o) Create app.properties file
		- coach.email=someValue
		- coach.team=someValue

	p) Add <context:property-placeholder> tag to load properties file into the Spring Container
	
	q) Replace the FootballCoach bean's property values with property injections from the app.properties file
		q1) ${coach.email} & ${coach.team}

--------------------------------------------------------------------

5) Discuss Bean Scopes
	- Scope can be explicitly decalred in the beans.xml file using the "scope" attribute for a <bean>

	- Scope refers to the lifecycle of a Spring bean
		+ How long does the bean live?
		+ How many instances of the bean are created?
		+ How is the bean shared within the Spring environment?

	- Scopes
		+ singleton (default)
			* The Spring Container creates only one instance of the bean
			* This bean is cached into memory
			* All requests for the bean will return a shared reference to the same bean

		+ prototype
			* Creates a new bean instance for each container request

		+ request
			* Bean is scoped to an HTTP web request
			* Only used in web applications
	
		+ session
			* Bean is scoped to an HTTP web session
			* Only used in web applications

		+ global-session
			* Bean is scoped to a global HTTP web session
			* Only used in web applications

---------------------------------------------------------------------------

6) Bean Scopes (Demo 3)
	- Development Process
		+ Create beanScope-beans.xml
			* Remove all but the myCoach and motivationService beans
			* leave scopes default

		+ Create BeanScopeDriver class
			* Load Spring Config
			* Get two objects from the container referencing the same bean name
			* Compare them using == to show they are the same

		+ Edit the beanScope-beans.xml to have the myCoach bean be of prototype scope

-----------------------------------------------------------------------

7) Bean Lifecycle
	1) Container started
	2) Beans are instantiated
	3) Dependencies are injected
	4) Internal Spring Processing
	5) Custom init() method
		- can be used to call some custom business logic methods (setting up handles to resources - DB, sockets, etc.)
		- use "init-method" attribute of <bean>, value will be some no-arg method in the bean

	6) Bean is ready for use
	7) Container shutdown
	8) Custom destroy() method
		- can be used to call some custom business logic methods (clean up handles to resources - DB, sockets, etc.)
		- use "destroy-method" attribute of <bean>, value will be some no-arg method in the bean

------------------------------------------------------------

8) Custom Lifecycle Methods using XML (Demo 4)
	- Add init-method and destroy-method to the <bean> tag for myMotivationService
	- Add corresponding methods to demonstrate custom lifecycle methods
	- After first demo switch scope of bean to prototype to talk about how the lifecycle of beans with this scope are not managed by Spring
		+ custom destroy methods are not invoked in prototype scope
			* we must explicitly call our clean up methods from our own code to ensure it happens