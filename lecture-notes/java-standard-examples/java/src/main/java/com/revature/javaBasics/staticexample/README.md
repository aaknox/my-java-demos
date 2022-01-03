# `StaticExample`
## Topics: 
* `static` keyword
* static vs instance scope
* static and instance variables and methods
## Resources: 
[source:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/javaBasics/staticexample/StaticExample.java) `com.revature.javaBasics.staticexample.StaticExample.java`

[test:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/test/java/com/revature/javaBasics/StaticExampleTest.java) `com.revature.javaBasics.StaticExampleTest`

## Getting Started
### Step 1
Explain the difference and relationship between classes and instances and enforce the idea that the class is the blueprint or template for creating an object (or instance) of that class.
### Step 2
Explain how the static keyword changes the scope of the associated property or method and, therefore, anything static will belong to the class and not any individual instance of that class (although all instances have access to it).
### Step 3
Reinforce the difference between the scopes by explaining why we can access a static variable or method inside an instance method, but the inverse is not true due to the scope that the variables and methods belong to.
### Step 4
Use the associated tests located in the resources section to demonstrate how each instance has its own
instance variable, but the static variable remains consistent across all instances.