# Abstraction - Abstract Classes and Interfaces
## Purpose:
This example shows abstract classes and interfaces, how they work, and how we can work with them.
## Topics:
* Abstract Classes
* Interfaces
* Inheritance
* Abstraction
* Abstract Methods
* Concrete Classes
* Concrete Methods
## Resources:
[Animal](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Animal.java) `com.revature.oop.abstraction.Animal.java`

[Cat](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Cat.java) `com.revature.oop.abstraction.Cat.java`

[AnimalExample](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/AnimalExample.java) `com.revature.oop.abstraction.AnimalExample.java`

[Swimmable](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Swimmable.java) `com.revature.oop.abstraction.Swimmable.java`

[Amphibious](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Amphibious.java) `com.revature.oop.abstraction.Amphibious.java`

[Ectothermic](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Ectothermic.java) `com.revature.oop.abstraction.Ectothermic.java`

[Frog](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/oop/abstraction/Frog.java) `com.revature.oop.abstraction.Frog.java`
## Getting Started:
### Step 1
Talk about the points of Abstract classes including instantiation and concrete vs abstract methods.
### Step 2
Create the `Cat` class and provide implementation for the inherited methods.
### Step 3
Create and use the `AnimalExample` to showcase the examples that were created.
### Step 4
Explain the use of an interface. Create the interface `Swimmable`. Then explain that interfaces can inherit from one another and create interface `Amphibious`. Finally, create another interface `Ectothermic`. Make note of the method with the same signature in both `Ectothermic` and `Amphibious`. (Be sure and leave out the default floatOnWater method the first time through.)  

### Step 5
Create the `Frog` class and implement the methods from `Swimmable`, `Amphibious` and `Ectothermic`. Possibly leave out `swim` at first and then show that `Frog` inherits `swim` because of the relationship between `Swimmable` and `Amphibious`. 

### Step 6
Use the main method to demonstrate the interfaces and instantiation of the class with its inherited methods.

### Step 7 
Decide you want to expand on the functionality of what it means to be `Swimmable`. Show how adding an abstract method will break your `Frog` class. Thus, demonstrate how the default keyword can be used to avoid this pitfall. (Add the code in to demo this in the main method of `Frog`.)  