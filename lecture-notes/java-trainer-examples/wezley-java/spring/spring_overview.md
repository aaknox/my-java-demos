# Goals of Spring
	
	- Lightweight development with Java POJOs
	- Dependency injection to promote loose coupling
	- Declarative programming with Aspect-Oriented Programming (AOP)
	- Minimize boilerplate Java code


# Spring Framework Modules

	## Core Container
		? Factory for creating beans
		? Manages bean dependencies
		### ? Sub-modules:
			§ Beans
			§ Core
			§ SpEL (Spring Expression Language)
			§ Context
	
	## Infrastructure
		? Allows developers to add functionality to objects declaratively
			§ Logging, security, transactions, etc.
			
		### ? Sub-modules:
			§ AOP
			§ Aspects
			§ Instrumentation (used for remote monitoring of applications)
			§ Messaging
	
	## Integration (Data Access Layer)
		? Allows developers to communicate with DBs (relational or non-relational)
		? Also allows functionality for communicating with a messaging queue
		### ? Sub-modules:
			§ JDBC
			§ ORM (Works very well with Hibernate)
			§ Transactions (Makes heavy use of AOP)
			§ OXM (Object XML Mapping)
			§ JMS (Java Message Service)
	
	## Web Layer (MVC)
		? Home of the Spring MVC framework
		? Sub-modules:
			§ Servlet
			§ WebSocket
			§ Web
			§ Portlet
	
	## Test Layer
		? Supports Test-Driven-Development (TDD)
		? Allows for the mocking of objects and out-of-container testing
		### ? Sub-modules:
			§ Unit
			§ Integration
			§ Mock