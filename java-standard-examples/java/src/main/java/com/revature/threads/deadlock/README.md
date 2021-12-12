# Threads - deadlock
## Purpose:
This example will showcase the deadlock problem associated with multi-threading.
## Topics:
* concurrency issues
* deadlock
* synchronized blocks
## Resources:
[Account](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/deadlock/Account.java) `com.revature.threads.deadlock.Account.java`

[Launcher](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/deadlock/Launcher.java) `com.revature.threads.deadlock.Launcher.java`
## Getting Started:
### Step 1
Create the `Account` class with all fields and methods.
### Step 2
Create the `Launcher` class and write the `transferHelper` method.
### Step 3
Create the main method and create the needed threads within it.
### Step 4
invoke the `start()` method on all the threads and demonstrate deadlocking.