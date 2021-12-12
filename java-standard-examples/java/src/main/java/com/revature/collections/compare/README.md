# Collections
## Purpose:
This example demonstrates how we can create a default and custom sorting arrangement for our classes.
## Topics:
* Collections
* Comparable and Comparator
* Collections class
* Comparing Objects
## Resources: 
[Bean](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/collections/compare/Bean.java) `com.revature.collections.compare.Bean.java`

[BeanYieldComparator](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/collections/compare/BeanYieldComparator.java) `com.revature.collections.compare.BeanComparator.java`

[ComparingObjects](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/collections/compare/ComparingObjects.java) `com.revature.collections.compare.ComparingObjects.java`

## Getting Started:
### Step 1
Create the `Bean` (do not implement `Comparable` yet) and `ComparingObjects` classes.
### Step 2
Fill the `Bean` class with the necessary fields and methods but do not implement `Comparable`.
> It is worth noting to associates that, even though the `equals()` method is used for the `compareTo()` method, and `equals()` and `hashcode()` are overriden in pairs, the `hashcode()` method is not necessarily used in any compare method.
### Step 3
Inside `ComparingObjects`, create a collection of Integers, Strings, etc. Show how to sort them with `Collections.sort()`.
### Step 4
Create a collection of the `Bean` type and try to sort them. This shows the necessity for the `Comparable` interface.
### Step 5
Implement the `Comparable` interface with the `Bean` class and show how to write the `compareTo()` method.
### Step 6
Use `Collections.sort()` to sort the Beans and show that it now knows how to sort the objects.
### Step 7
Discuss the need for another way to sort objects. Create the `BeanYieldComparator` class and show how to write the `compare()` method. Sort the Beans with the new comparator instance in `Collections.sort()` method.
### Step 8
Demonstrate lambdas with `Comparator` inside the `ComparingObjects` class. Show using a lambda for a reference variable and using it directly in the method to reiterate what is happening.