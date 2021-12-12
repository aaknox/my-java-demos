# Design Patterns - Observer
## Purpose:
The observer design pattern is used for one to many relationships between objects when the single object's dependents need to be notified about modifications with the singular object. This example will demonstrate this pattern.
## Topics:
* Observer design pattern
## Resources:
[Observer](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/Observer.java) `com.revature.designpatterns.observer.Observer.java`

[Subject](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/Subject.java) `com.revature.designpatterns.observer.Subject.java`

[BinaryObserver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/BinaryObserver.java) `com.revature.designpatterns.observer.BinaryObserver.java`

[HexObserver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/HexObserver.java) `com.revature.designpatterns.observer.HexObserver.java`

[OctalObserver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/OctalObserver.java) `com.revature.designpatterns.observer.OctalObserver.java`

[ObserverDriver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/observer/ObserverDriver.java) `com.revature.designpatterns.observer.ObserverDriver.java`
## Getting Started:
### Step 1
Create the `Subject` and `Observer` classes.
### Step 2
Create the various `Observer` classes and implement the `update()` method.
### Step 3
Create the `ObserverDriver` class and build the main method. Explain the logic as the method is being built.
### Step 4
Run the program and demonstrate what is happening with the different instances.