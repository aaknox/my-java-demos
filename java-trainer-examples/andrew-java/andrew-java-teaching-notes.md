# Andrew Teaching Notes on Java
Below I have an overview of how I would go about teaching my examples. Since I haven't
actually taught a batch before, I am not sure how well they would translate to the
classroom, but hopefully they will be helpful to you.

I relate all of the topics below back to my code examples under `andrew-java-examples`.

## Overview
Below is the outline of the topics I would go over from a high level:
1. Set up dev environment
2. Overview of Java
3. Basic Java Programs
4. Java Examples in STS
5. Maven
6. JUnit and TDD
7. Advanced Topics

## Detailed Steps
Each step above is detailed below:

### Setting up dev environment
Usually this can be done before lunch on the first day.
* Download and install [java](http://www.oracle.com/technetwork/java/javase/downloads/index.html),
[STS](https://spring.io/tools/sts/all) (Spring Tools Suite), and [Maven](https://maven.apache.org/download.cgi)
  * For Maven, make sure to download binary zip archive, **not** the source code
* Check that installations completed successfully
  * From command line, run `java -version`. The Java version should be printed.
  * From command line, run `mvn -v`. The Maven version should be printed.
* [Install `git`](https://git-scm.com/downloads) for version control if not installed already
* Open up STS and get started!

### Overview of Java
After installations are complete, I would spend some time lecturing about Java as an
object-oriented programming language. Topics would be first-day concepts including:
* Why Java?
* What is a class / object?
* OOP concepts
  * Abstraction
  * Polymorphism
  * Inheritance
  * Encapsulation

### Basic Java Programs
Next, I would start with basic Java examples without using an IDE. I would recommend using Notepad++ or other simple text editor.
* First Java program:
  * HelloWorld example
  * Instantiating a class using `new` keyword
  * Using `javac HelloWorld.java` on the command line to compile the code
  * Run on the command line using `java HelloWorld`
* Using command line arguments
  * Edit the code to loop through and print out command line arguments
  * Run on the command line using `java HelloWorld arg1 arg2 arg3`
* Naming conventions for packages / classes / methods

### Java Examples in STS
Next, I would start up STS and explain how it abstracts away the compilation of your code
when you run it from the IDE. Then I would start with my examples:

#### Simple Examples
* Use `basics.CommandLineArgs` to show command line argument configuration in STS
* Use `basics.ControlStatements` to go over control statement and application flow
* Use `basics.Overloading` to show how basic overloading works and tie it in with polymorphism
* Define overriding and explain how we use it to create a bean in `basics.JavaBean`
* Go over access modifiers
  * Use `basics.VariableScopes` to show all access modifiers and how any variable can be accessed within its own class
  * Use `basics.VariableScopesTest` to give demo of `private` preventing access to a variable
  * Use `basics2.VariableScopesChildTest` to show how `protected` allows access to subclasses even outside package
  * Use `basics2.VariableScopesDiffPackageTest` to show how default prevents access outside package

#### Object-oriented programming
Use package `oop` to teach OOP concepts:
* `GenericObject` shows how to achieve abstraction
* Use `SpecificObject` to show inheritance of state and behavior from parent class
  * it overrides the `doSomething()` method of `GenericObject` - explain polymorphic behavior
* A general interface (`MyInterface`) that contains one method
* Class `Dog` extends `Animal` and overrides the `move()` method
* Use `EncapsulationExample` to show difference between `SampleObject` and `EncapsulationObject` which uses getters/setters
* Finally, I would explain how OOP principles apply to Java APIs like exceptions and collections

#### Strings
Use package `strings`:
* Use the `ImmutableStringExample` class to show the immutability of strings and `StringBuilder` mutability
* Compare `String`, `StringBuilder`, and `StringBuffer` performance in the `StringClassesComparison` class
  * Explain *why* `String` is slower
* Use `StringThreadSafety` to show the thread-safe nature of `StringBuffer` (this may be moved to the threads section)

#### Collections API
Next, I would explain the collections API, starting with the inheritance hierarchy.
Discuss the advantages/disadvantages of each implementation.
I would show a flow chart for deciding when to use each type of collection.

Use `collections` package:
* Use `CollectionsExample` to show an array, `ArrayList`, `HashSet`, `HashMap`, and `ArrayDeque` implementations
* Use `ForEachLoops` to show iteration over each type of collection
* `SetComparison` shows the difference between `HashSet`, `TreeSet`, and `LinkedHashSet`

#### Exceptions
Next, I would explain the Exceptions class hierarchy.
Explain the difference between checked and unchecked exceptions.

Then go into examples using the `exceptions` package:
* `BasicExceptionExample` to show `try`/`catch`/`finally` blocks as well as the `throws` declaration in the method signature
  * Note how multiple catch blocks are allowed and order is most specific to least
* Create custom exception with `CustomException` class that extends `Exception`
  * Try it out with `CustomExceptionExample`
* Use `UncheckedExceptions` to explain how unchecked exceptions do not need to be declared or caught
  * Handle invalid input and display user-friendly message with `.doBadMath()` method

#### Design Patterns
I think this would be a good time to go over design patterns - explain why we need to
organize code with design patterns - design patterns as abstractions of solutions.

At this point I would go into factory and singleton design patterns as ways to solve
the problem of encapsulating the logic for instantiating an object.

Then I would go into code examples (`designpatterns` package):
* Show how to create a `Singleton` class with private constructor and public static method to retrieve instance
* Create the `Implementation` class
  * show that using the `new` keyword to instantiate the singleton is not allowed
  * use the public static method to instantiate / retrieve the singleton
  * create another variable with reference to the singleton and show that the two reference variables point to the same object
* Create a `Car` and `Truck` which implement the `Vehicle` interface and override the `.drive()` method
* Create a `Factory` class which has a `.getVehicle()` method to retrieve a `Car` or `Truck` based on the string argument passed in
* Return to the `Implementation` class and test the factory class by getting a car and a truck
* Explain how the Factory and Singleton patterns can work together

#### Threads
I would begin with Threads by explaining what they are, why we may need to use them, and what
the advantages and disadvantages for using them are. Next, I would talk about the two ways of
creating threads:
1. Extending the Thread class
2. Implementing the Runnable interface

Next, I would use the `threads` package containing Thread examples:
* `ExtendThread` class that extends the Thread class and implements the `Runnable` interface
* `ImplementRunnable` class that implements the `Runnable` interface
* Create the `RunThreads` class to start the threads
* Use the `ThreadsafeExample` to show that `Vector` is thread-safe while `ArrayList` is not
  * Creates two threads with `ThreadsafeJob`s which add elements to each collection and reports results
  * Optionally, use the commented-out code to run multiple times and collect statistics:
    * Number of exceptions thrown / caught when adding to the `ArrayList`
    * Number of `null` values inserted in the `ArrayList`
* `ProducerConsumer` has an example of using threads to solve the producer / consumer problem
  * The producer class generates integers from which the consumer class reads

#### FileIO
I would start this section with an overview of the necessity of reading / writing to files and serialization
generally.

The `io` package contains I/O examples:
* For each example, I would show the files before and after running the code to understand how the program is working
* I would start with `FileReaderWriterExample` to show the ease of reading from / writing to a
file using the API.
* Next is a fun example that I came up with: copying an image file (of a cat) using the `FileInputOutputStreamExample` class
  * Write the method to read the image into an `ArrayList<Integer>` and print the size of the data
  * Write another method to copy the data to a new file
  * Write another method (`.copyAndCorruptImage()`) to copy the image but corrupt it along the way (increment some of the bytes in the `ArrayList` when copying) - may need to ignore some initial data to preserve ability to open file
* Explain object serialization in Java using `ObjectIOStreamExample`
  * First create the `FootballPlayer` class that we will serialize - be sure to emphasize that we need to implement `Serializable`
  * Next, create the example implementation:
    * In the main method, instantiate a new `FootballPlayer`
    * Create a method to serialize the object
      * Explain how `ObjectOutputStream` is wrapped around the `FileOutputStream`
    * Create a similar method for deserialization
    * Call both methods to write the `FootballPlayer` object to a file and then read it back from the file
    * This is a great place to demonstrate the usefulness of the `transient` keyword
* Finally, build the `ConsoleApp` as a simple example of using the `Scanner` class to build a console application

### Maven
I think this is a good point to introduce Maven as a dependency manager / build tool
because all the Java basics have been covered and libraries like JUnit need to be added.
* Discuss project object model (`pom.xml`)
* Discuss local (`.m2`) / remote repositories and how dependencies are fetched
* Maven lifecycle
* Usage on the command line (`mvn`)
* Creating a Maven project in STS

### Unit Testing and TDD
Now that they understand how Maven works, you can start including dependencies like JUnit
or TestNG to go over the testing side of development.

#### JUnit
Before talking about TDD, I would give an overview of what testing is and why we do it.
Explain JUnit as a testing framework and all the annotations that come with it:
* Using `junit.MathOperations` as the outline, create a simple class that performs some mathematical operation
* Create a JUnit test case class (`TestAddMethod`) that tests that `.add()` method of the `MathOperations` class
  * Start with the `@Test` annotation and method, and explain what we are doing
  * Add in all other annotations and explain the order of execution
* Continue on with testing the `.subtract()` method
* For the `.divide()` method, show that we can expect an exception to be thrown (sad-path)
  * Use this to explain happy-path vs sad-path

#### Test-driven development
Now that we've written simple tests, it's easier to explain what "Test-driven development" means.
I would start by explaining that we **write tests first**, then write the application code
that makes the test pass.

### Advanced Topics
If you have time...
* Lambdas / functional interfaces
* new Java 10 syntax
