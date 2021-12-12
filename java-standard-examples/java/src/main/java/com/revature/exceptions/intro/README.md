# Exceptions Intro
## Purpose:
This gives a brief introduction to what an exception is and how to handle them.
## Topics:
* Exceptions
* throws and throw keywords
* try-catch-finally blocks
## Resources:
[BasicExceptionExample:](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/exceptions/intro/BasicExceptionExample.java) `com.revature.exceptions.intro.BasicExceptionExample.java`
## Getting Started:
### Step 1
Create the class and write the `throwManyExceptions()` method.
### Step 2
Reiterate the switch statement and explain each exception's purpose as you write the method (Note to associates that we need to use the throws keyword to let the compiler know that we are letting the calling method handle whatever exceptions that it throws).
### Step 3
Write the main method and call the `throwManyExceptions()` method without a try catch block to show the compiler errors when you dont properly handle a method that throws exceptions.
> Note: Swap the catch blocks to demonstrate why we catch more specific Exceptions first. Show what happens when we try to catch an IOException before a FileNotFoundException.
### Step 4
Create the try-catch-finally block to handle the different exceptions that may occur from calling the method.
> Note to trainers: this is usually a good time to explain that the statement can live without the catch or finally blocks, but not both.
### Step 5
Run the main method several times with different arguments for the `throwManyExceptions()` to show the different outcomes.
> Note to trainers: Have the associates answer questions and discuss what is happening when we run the main method each time.