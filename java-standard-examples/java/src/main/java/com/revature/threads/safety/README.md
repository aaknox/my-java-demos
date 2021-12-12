# Threads - Thread Safety
## Purpose:
This will demonstrate thread safety using collections as a demonstration of the topic.
## Topics:
* thread safety
* ArrayList
* Vector
## Resources:
[ThreadSafeJob](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/safety/ThreadsafeJob.java) `com.revature.threads.safety.ThreadSafeJob.java`

[ThreadSafeExample](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/threads/safety/ThreadsafeExample.java) `com.revature.threads.safety.ThreadsSafeExample.java`
## Getting Started:
### Step 1
Explain thread safety and mention the differences between different collections, such as `Vector` and `ArrayList`, to help the understanding of thread safety, efficiency, and concurrency issues in unsafe conditions.
> Note: Show associates the documentation for both classes to show the difference in the synchronized methods. This helps associates become more comfortable with researching, especially doing so using documentation. An example would be the difference between the `size()` method in each class.
### Step 2
Build the `ThreadSafeJob` class and explain the purpose for its functionality.
### Step 3
Create the `ThreadSafeExample` class and create the `runExample()` method.
> Help the associates walk through the logic. There are a lot of `System.out` methods in the example for clarity, but it is usually daunting for some associates at first because of the bulk appearance. 
### Step 4
Invoke the `runExample()` method from the main and explain what is happening in each step of the example.
### Step 5
(optional) add in the statistics in the main method to provide more clarity on the example and subject.