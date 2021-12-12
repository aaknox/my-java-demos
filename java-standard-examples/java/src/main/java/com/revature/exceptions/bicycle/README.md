# Exception Example: Bicycle
## Purpose:
This example will build a custom exception, a class that throws the exception, and a driver that will demonstrate handling exceptions and using the class that throws them.
## Topics:
* Custom exceptions
* When and why to throw and declare a method throws exceptions
## Resources:
[Bicycle:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/exceptions/bicycle/Bicycle.java) `com.revature.exceptions.bicycle.Bicycle.java`

[NegativeSpeedException:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/exceptions/bicycle/NegativeSpeedException.java) `com.revature.exceptions.bicycle.NegativeSpeedException.java`

[BicycleDriver:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/exceptions/bicycle/BicycleDriver.java) `com.revature.exceptions.bicycle.BicycleDriver.java`

## Getting Started:
### Step 1
Create the `Bicycle` class and begin creating the different fields and methods without throwing any exceptions yet.
### Step 2
In the `speedDown()` method, explain the need for a custom exception and create the `NegativeSpeedException` class.
> Associates commonly either forget or do not understand how to create "custom exceptions" so make sure to explain the steps necessary for creating a custom exception and use different terminology to get them accustom to answering the question.
### Step 3
Use the newly created custom exception in the `speedDown()` method.
### Step 4
Create the `BicycleDriver` class with the main method. Walk through the creation of the method with the associates as it is made explaining how the exception is thrown and is being caught/handled.