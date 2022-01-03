 # Overview of a typical Java EE architecture

	### Web Layer Technologies
		- Angular
		- Spring MVC
		- Servlet JSP
		- Thymeleaf
		- Freemarker
		- Struts
	
	### Business Layer
		- Core Java
		- Spring
	
	### Data Layer
		- JDBC
		- Hibernate
		- Spring Data


# Dependencies and Code Coupling

	Each of these layers require that the layer(s) below them work and operate properly, making them dependent upon the layers below them.
	
		? Web Layer is dependent upon the Business Layer
		? Business Layer is dependent upon the Data Layer
	
	This concept of dependency does not just stop at the high level, diving into our Business Layer and looking the classes within them, we can see another level of dependency. For example:
	
	```
		public class MyBusinessService {
		
			SortAlgorithm sortAlgorithm;
			// implementation here...
		}
	```
	
	We can see in this simple example, that we have a class, MyBusinessService, that contains another class, SortAlgorithm. Our MyBusinessService class is going to use the SortAlgorithm class in order to perform some logic upon data. 
	
	This means that MyBusinessService class is dependent upon the SortAlgorithm class, making the SortAlgorithm class a dependency of the MyBusinessService class.
	
	So a dependency is some class that is a member of another class, and is required for the containing class to function properly.
	
	Before the Spring Framework, the way that dependencies were represented in code looked similar to the example below:

	
	```
		public class MyBusinessService {
		
			SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
			// implementation here...
		}
		
		public class BubbleSort Algorithm implements SortAlgorithm {
		
			// implementation here...
		}
	```
		
	The problem with the above implementation is that our MyBusinessService class is tightly-coupled to our BubbleSortAlgorithm class, because it is directly instantiating an object of the dependency.
	
	Consider that we wish to use a different sorting algorithm to perform the business logic within MyBusinessService. To do so, we would need to go into the MyBusinessService class and refactor its implementation.
	
	This is not ideal, so our goal - as developers - is to write code that is loosely-coupled. So that our individual class implementations are not as dependent upon the implementation of any members it contains.
	
	In order to make our example from before loosely-coupled, we can remove the direct instantiation of our sorting algorithm class. Additionally, we could create a constructor (or a setter method) that takes in a SortAlgorithm implementation as an argument, so that we can easily change the implementation we use. This is known as dependency injection:
	
	```
		public class MyBusinessService {
			SortAlgorithm sortAlgorithm;
			
			public MyBusinessService (SortAlgorithm sortAlgorithm) {
				this.sortAlgorithm = sortAlgorithm;
			}
		}
		
		public class BubbleSort Algorithm implements SortAlgorithm {
		
			// implementation here...
		}
		
		public class MyDriver {
		
			SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
			
			MyBusinessService businessService = new 
				MyBusinessService(sortAlgorithm);
		}
	```
		
	The overall goal of the above code is one of the main features of using the Spring Framework. The Spring Framework abstracts away the need to type this implementation out just to loosely-couple our code, by handling the instantiation of these objects for us. The only thing that developers need to do is tell Spring what objects it will be managing, and what dependencies the managed classes have.


# Important Annotations

	### @Component
		? goes above each class declaration which we want Spring to manage instances of
		? lets Spring know that we want it to manage instances of this class and its dependencies
	
	### @Autowired
		? goes above the dependency declarations within managed classes
		? lets Spring know that this class member is a dependency
		? the class declaration of the dependency must be annotated with the @Component
	
	```
		@Component
		public class MyBusinessService {
		
			@Autowired
			SortAlgorithm sortAlgorithm;
			// implementation here...
		}
		
		@Component
		public class BubbleSort Algorithm implements SortAlgorithm {
		
			// implementation here...
		}
	```
# Important Terminology
	
	- Beans
		§ instances which are managed by the Spring Framework
		
	- Autowiring
		§ the process in which the Spring Framework identifies dependencies within a component, finds the corresponding component implementations and instantiates the dependency (or grabs an existing instance)

	- Dependency Injection
		§ the process of the Spring Framework actually injecting an instance of a dependency into a component (through auto-wiring or manual bean wiring)
		
	- Inversion of Control
		§ the concept of the Spring Framework managing beans and performing dependency injection
		§ developers hand over control over aspects of the application to the Spring Framework

	- IOC Container
		§ a general term that is used to refer to anything that is implementing Inversion of Control
		
	- Application Context
		§ the primary IOC container of the Spring Framework
		§ alternative to the Bean Factory IOC container implementation


# Conclusion
	
	In summary, what the Spring Framework is at its core is a dependency injection framework which uses an inversion of control container (Application Context) to manage instances of specified objects, or beans (through the use of autowiring or manual bean wiring).
