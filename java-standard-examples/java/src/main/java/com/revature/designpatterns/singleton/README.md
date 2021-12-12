# Design Patterns - Singleton
## Purpose:
A singleton is a design pattern to not allow more than one instance of a class to exist. This example demonstrates different ways to achieve this.
## Topics:
* Eager vs Lazy
* Singleton design pattern
* thread safety
## Resources:
[EagerSingleton](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/singleton/EagerSingleton.java) `com.revature.designpatterns.singleton.EagerSingleton.java`

[LazySingleton](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/singleton/LazySingleton.java) `com.revature.designpatterns.singleton.LazySingleton.java`

[LazyLockedSingleton](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/singleton/LazyLockedSingleton.java) `com.revature.designpatterns.singleton.LazyLockedSingleton.java`

[OnDemandSingleton](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/singleton/OnDemandSingleton.java) `com.revature.designpatterns.singleton.OnDemandSingleton.java`

[SingletonDriver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/singleton/SingletonDriver.java) `com.revature.designpatterns.singleton.SingletonDriver.java`
## Getting Started:
### Step 1
Create the `SingletonDriver` class with the main method.
### Step 2
Explain the need for the singleton design pattern and create the `LazySingleton` class. Demonstrate its usage in the `SingletonDriver` main method.
### Step 3
Create the `LazyLockedSingleton` class and explain the difference between it and the `LazySingleton` class. Demonstrate in the `SingletonDriver` main method.
### Step 4
Create the `EagerSingleton` and demonstrate its usage in the `SingletonDriver` main method.
### Step 5
Create the `OnDemandSingleton` class and explain the structure of it and how it differs from other singleton patterns. Demonstrate its usage in the `SingletonDriver` main method.