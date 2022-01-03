# Threads - Intro
## Purpose:
This example demonstrate to associates what a thread is, how to create a custom thread and how to start a thread.
## Topics:
* `Thread` class
* Thread usage
* `run()` method
* `start()` and `join()` methods
* custom Threads
## Resources:
[Employee](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/intro/Employee.java) `com.revature.threads.intro.Employee.java`

[ThreadDriver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/intro/ThreadDriver.java) `com.revature.threads.intro.ThreadDriver.java`
## Getting Started:
### Step 1
Explain the usage of threads throughout computer science and in java.
### Step 2
Create the `Employee` class, extend the `Thread` class and override the `run()` method.
### Step 3
Create the `ThreadDriver` class and create the main method.
### Step 4
Walk through logic while creating the main method.
### Step 5
Explain the `start()` and `join()` methods, their usage, their execution, and why they throw the exception they do.
### Step 6
Go over the different ways to create a thread including: extending the `Thread` class, implementing the `Runnable` interface, and using a lambda for a reference variable of the `Runnable` interface and in the `Thread` constructor.