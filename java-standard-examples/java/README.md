# Overview
This Maven project contains standardized, week 1 Java code examples for Revature trainers.

The following sections go into detail about the examples in each topic, giving the classes/files in each topic,
what the topic does, and then process of teaching it. The examples also have comments throughout the code
to help understand the logic of the program.

## Java Basics - `com.revature.javaBasics`
* `HelloWorld`
  * Topics: Java syntax, main method, etc
  * What this example does
    * Introduces Java syntax
  * How to teach
    * Explain package, import statements, `static` and `new` keywords, comments, main method
* `ReverseAString`
  * Topics: problem solving, `.charAt()`, Strings
  * Resources: `src/test/java` folder: `com.revature.javaBasics.ReverseAStringTest`
  * What this example does
    * Reverses a String using only the `.charAt()` method
  * How to teach
    * You can assign this as a problem for associates to solve, and let them come up with the algorithm
    * Use the associated unit tests to show associates how to test their solution
* `Datatypes`
  * Topics: primitives vs objects, default values, instance variables
  * What this example does
    * Shows all primitives and their default values, also object default value of `null`
  * How to teach
    * Explain primitive data types, primitives vs objects
* `StaticExample`
  * Topics: `static` keyword
  * Resources: `src/test/java` folder: `com.revature.javaBasics.StaticExampleTest`
  * What this example does
    * Shows the difference between static and instance `int` variables
    * Unit test methods instantiate multiple objects and call the increment method which increments both variables
    * Assert methods for each test show that the static variable increments every time and belongs to the whole class but instance variable belongs to the specific object used
* `Arrays`
  * Topics: creating arrays, referencing elements, looping, nested looping, multi-dimensional arrays, finding length
  * What this example does
    * Instantiates, references, and iterates over some arrays
  * How to teach
    * Show two different ways of referencing and three different ways of instantiating arrays
    * Use arrays of primitives and objects
    * Iterate using standard loop and for-each loop
* `WrapperClasses`
  * Topics: wrapper classes, autoboxing / unboxing
  * What this examples does
    * Shows use of wrapper classes to find min/max values, autoboxing/unboxing, parsing values, and comparing values
  * How to teach
    * walk through method logic to teach use of wrapper classes
* `VarArgsDriver`
  * Topics: varargs
  * What this examples does
    * Utilizes methods that have varargs as a parameter
  * How to teach
    * Write the `.display()` method, explain varargs concept and syntax
    * Explain how varargs relates to arrays, iterating using for-each loop
    * Write the `.show()` method for multi-dimensional example
* `GarbageDriver`
  * Topics: garbage collection, `.finalize()` method, infinite loop, `System.exit()`, `System.gc()`, `Thread.sleep()`
  * What this example does
    * Overrides `.finalize()` method, which prints a message and then invokes `System.exit(0)`
    * Instantiates `GarbageDriver` object, waits 5 seconds, reassigns reference variable, then goes into infinite loop
    * When run, the infinite loop gets interrupted by the overridden `.finalize()` method, showing that the object is being garbage collected
  * How to teach
    * Explain what finalize method does and implement the overridden method
    * Write the program logic, explaining that `System.gc()` only SUGGESTS garbage collection, can't force it
    * Explain how object is eligible for garbage collection when no more references to it exist
    * Explain what `System.exit(0)` does

#### Control Flow - `com.revature.javaBasics.controlFlow`
* `ControlFlow`
  * Topics: If statements, switch statements, `break`, `continue` keywords
  * What this example does
    * Self-explanatory
  * How to teach
    * Walk through control flow logic and explain keywords
* `LoopsExample`
  * Topics: Loops - for, while, do-while
  * What this example does
    * Has a method for each type of loop, then a main method to run each of them
    * `LoopsExample.printEvens()` uses `continue` to print only even numbers from 1 to 100
  * How to teach
    * Write each example and then invoke from the main method, explain differences between each type of loop
* `GradeCalculator`
  * Topics: command-line arguments, enhanced for loop, varargs
  * What this examples does
    * Invokes a method to take numeric grades from the command line using varargs and prints the average grade
  * How to teach
    * Show how to use arguments from the command line (can use Eclipse/STS or run on the command line itself)
    * Implement `calculateAverage` method

#### Constructors - `com.revature.javaBasics.constructors`
* `A/B/C`
  * Topics: Constructors, hidden methods, using `super` keyword
  * What this example does
    * `C` extends `B` extends `A`
    * `A` has a static method that becomes hidden when `B` implements the same method signature
    * Each class has a no-arg and 1-arg constructor
  * How to teach
    * Start with class `A`, then write `B`, then `C`
    * Explain the use of `super` keyword
    * Run class `C` to show how each constructor calls the constructor of its inherited class
* `Chaining`
  * Topics: constructor chaining
  * What this example does
    * Implements no-arg, 1-arg, and 2-arg constructors
  * How to teach
    * Explain the use of `this` keyword, then run the class to show constructor chaining

## OOP - `com.revature.oop`
* `Overloading`
  * Topics: polymorphism (overloading)
  * What this method does
    * Invokes overloaded method 4 different ways
  * How to teach
    * Fairly self-explanatory, this class has 4 different overloaded methods to demo
* `AnimalExample`
  * Resources: Classes - `Animal`, `Cat`
  * Topics: Polymorphism / Covariance, Inheritance, Abstract classes
  * What this example does
    * Creates `Cat` object 4 different ways, and also uses covariance (`Animal` type)
    * Calls various methods on those objects
  * How to teach
    * First, create abstract `Animal` class and explain concepts related to abstraction and abstract classes / methods
    * Next, create concrete `Cat` class that extends `Animal` and explain the concept of inheritance and giving concrete implementations of inherited abstract methods
    * Finally, create `AnimalExample` class and show the concept of covariance as well as the overloaded constructor for creating cats
    * Run the `AnimalExample` class
* `InterfaceExample`
  * Resources: Interfaces - `InterfaceA`, `InterfaceB`; Classes - `Animal`
  * Topics: Interfaces, Inheritance, Polymorphism
  * What this example does
    * `InterfaceB` extends `InterfaceA`, `InterfaceExample` implements both and extends `Animal`
    * Creates `InterfaceExample` objects using all 3 different types, calls methods on each to see which implementation is used
  * How to teach
    * Start with `InterfaceA`, then `InterfaceB`, then create `InterfaceExample`
    * Explain method invocation for each object

## Strings - `com.revature.strings`
* `StringDriver`
  * Topics: String pool, String literals, comparing and using `String` methods
  * What this example does
    * Creates Strings using literals, `new` keyword
    * Compares Strings using `==` and `.equals()` method
    * Uses `.replaceAll()`, `.charAt()`, `.toLowerCase()`, `.endsWith()` methods
  * How to teach
    * Explain the String pool, `==` vs `.equals()`, and each String method
* `ImmutableStringExample`
  * Topics: String immutability
  * What this example does
    * Uses method variables to show string immutability and compare with `StringBuilder`
  * How to teach
    * Write the `.proveImmutability()` method to show how Strings cannot be changed once created
    * Write the `.compareStrAndStrBuilder()` method to show the difference between String and `StringBuilder`
    * Write the `.useConcat()` method to show the proper use of `.concat()` method
* `StringClassesComparison`
  * Topics: String, `StringBuilder`, `StringBuffer`
  * What this example does
    * Creates a String and uses `.concat()` in a for loop `n` times to create a long String
    * Does similar operation, using `.append()` method on `StringBuilder`
    * Compares the speed of `String` with `StringBuilder` and `StringBuffer`
  * How to teach
    * Explain `.concat` and `.append` methods, then write and execute the class to show how much faster `StringBuilder` is
* `StringThreadSafety`
  * Topics: `StringBuffer`, `StringBuilder`
  * What this example does
    * Creates a String using two threads with both `StringBuilder` and `StringBuffer`
  * How to teach
    * Make sure threads are covered before showing this examples
    * Implement and explain code
    * Show how console output for `StringBuilder` contains gaps but `StringBuffer` does not

## Collections - `com.revature.collections`
* `CollectionDriver`
  * Topics: Collections, Lists, Sets, Maps, Queues
  * Resources: `User` class
  * What this example does
    * Creates, adds elements, and iterates over each Collection type
  * How to teach
    * Create `User` class first
    * Explain the data structure for each type of collection and methods for accessing elements
* `Pokemon`
  * Topics: `Comparator`, sorting
  * What this examples does
    * Creates collections of `Pokemon` and sorts using `Comparator` and `Comparable` interfaces
  * How to teach
    * Explain the use of `Comparable`, `Comparator`, and `Collections.sort()` method

#### Generics - `com.revature.collections.generics`
* `GenericDriver`
  * Topics: Generics
  * What this example does
    * Introduces concept of generics
  * How to teach
    * Explain importance of type safety and why generics were introduced
    * Explain generic syntax while creating the class, also explain diamond operator

## Serialization / IO - `com.revature.serialization`
* `FileReaderWriterExample`
  * Topics: `FileReader` / `FileWriter`, try-with-resources
  * Resources: Files - `files/dummydata.txt`, `files/outputfile.txt`, `files/otheroutput.txt`
  * What this example does
    * Reads strings from text file line by line, then writes to a new file
    * Introduces `try-with-resources`
  * How to teach
    * Write the method to read from the text file first
    * Explain `FileReader` usage
    * Write the method to write to a new text file
    * Explain `FileWriter` usage
* `FBPlayerSerialization`
  * Topics: `ObjectInputStream` / `ObjectOutputStream`, `transient` keyword
  * Resources: Files - `files/playerinfo.txt`
  * What this example does
    * Serializes a "football player" object to a file, then reads it from the file
  * How to teach
    * Start with `FootballPlayer` class
    * Explain FileIO concepts, what serialization means and how it works
    * Start with the serialize method, why IOException must be handled
    * Show the file the player is serialized to
    * Make the `salary` field transient
    * Finish example with the method to deserialize from the file
    * Show how `transient` prevents a field from being serialized, doesn't show when read from file

* `FileIOCatExample`
  * Topics: I/O
  * Resources: Files - `src/main/resources/cat.jpg`
  * What this example does
    * Uses `java.io.FileInputStream` and `java.io.FileOutputStream`
    * Copies an image file of a cat using the `FileInputOutputStreamExample` class, also one method that corrupts
  * How to teach
    * Write the method to read the image into an `ArrayList<Integer>` and print the size of the data
    * Write another method to copy the data to a new file
    * Write another method `.copyAndCorruptImage()` to copy the image but corrupt it along the way (increment some of the bytes in the `ArrayList` when copying) - may need to ignore some initial data to preserve ability to open file

* `SimpleConsoleApp`
  * Topics: I/O
  * What this example does
    * Uses `java.util.Scanner` class to create simple console application
    * When run, displays menu on the console
    * Simple infinite loop example echos user input
    * Mock user login
    * Simple code trivia game
  * How to teach
    * Build menu in main method, then refactor to separate method
    * Add functionality in separate methods

## Design Patterns

#### Singleton - `com.revature.designpatterns.singleton`
* `SingletonDriver`
  * Topics: singleton design pattern
  * What this example does
    * Uses all of the singleton classes:
      * `EagerSingleton`
      * `LazySingleton`
      * `LazyLockedSingleton`
      * `OnDemandSingleton`
  * How to teach
    * Construct a singleton class first, explain the concept of singleton and why this design pattern is needed
    * Then write the logic in the `SingletonDriver` class for that particular singleton
    * Show the proper way of getting the singleton reference and that all references point to the same object
    * Repeat for each singleton class

#### Factory - `com.revature.designpatterns.factory`
*  `FactoryDriver`
  * Topics: factory design pattern
  * Resources: `Currency` interface, `Euro`, `USDollar`, `Yuan`, `Bitcoin`, and `CurrencyFactory` classes
  * What this example does
    * Uses the `CurrencyFactory` to get and display currencies for each country
  * How to teach
    * Create the `Currency` interface, then each implementation - override the `getSymbol` method
    * Create `CurrencyFactory` to implement instantiation logic
    * Write and run the `FactoryDriver` class

#### Builder - `com.revature.designpatterns.builder`
* `BuilderDriver`
  * Topics: builder design pattern
  * Resources: `Cake`
  * What this example does
    * Creates a `Cake` via its internal `Builder` class
  * How to teach
    * Create `Cake` class first, then show how to use the builder methods to more easily construct an object
    * Discuss pros/cons of the design pattern

#### Observer - `com.revature.designpatterns.observer`
* `ObserverDriver`
  * Topics: observer design pattern
  * Resources: `Subject` class, `Observer` abstract class, `BinaryObserver`, `HexObserver`, and `OctalObserver` classes
  * What this example does
    * Instantiates a subject and three different implementations of observers
    * Asks the user for a number, sets the state of the `Subject`, and recursively calls itself 5 times
    * Every time the state of the `Subject` is set, all the `Observer`s print a specific transformation of the `Subject`'s state
  * How to teach
    * Start with `Observer` abstract class and `Subject` classes, explaining how they relate to each other
    * Implement observer concrete classes
    * Run the `ObserverDriver` class and explain the program flow

## Exceptions
* `BasicExceptionExample`
  * Topics: `try/catch/finally`, ducking, multiple catch blocks - order of exceptions
  * What this example does
    * Implements a method with try/catch/finally blocks and another that throws various exceptions
  * How to teach
    * Explain use of try/catch blocks, order of exceptions if you have multiple catch blocks
    * Implement/run the class, varying the argument to the method that throws the exceptions
* `BicycleDriver`
  * Topics: custom exception, throwing exceptions
  * Resources: `Bicycle`
  * What this example does
    * Creates multiple `Bicycle`s
  * How to teach
    * Implement `Bicycle` class first, and throw the `NegativeSpeedException` from the `.slowDown()` method
    * Create the `NegativeSpeedException` class - explain that you're extending the `Exception` class
    * Implement and run the `BicycleDriver` class, showing how the exception is thrown and caught/handled
* `FinallyExamples`
  * Topics: `StackOverflowError`, `OutOfMemoryError`, `finally` block execution
  * What this example does
    * Tests the scenarios for `finally` block execution
  * How to teach
    * Go through each scenario:
      * `OutOfMemoryError` thrown - `finally` still executes
      * `StackOverflowError` thrown - `finally` still executes
      * `System.exit()` called - `finally` doesn't execute

## Reflections - `com.revature.reflections`
* `Reflection`
  * Topics: Reflections API
  * Resources: `Frankenstein`
  * What this example does
    * Uses the Reflections API to find and show all the methods, constructors, and fields of the `Frankenstein` class
  * How to teach
    * Create `Frankenstein` class
    * Create `Reflection` class, explain `.getDeclaredMethods()`, `.getMethods()`, `.getDeclaredFields()`
* `RunInspection`
  * Topics: Reflections API
  * What this example does
  * How to teach

## Log4J - `com.revature.log4j`
* `LoggingExamples`
  * Topics: Log4j
  * Resources: `src/main/resources/log4j.properties`
  * What this example does
    * Uses Log4j to log messages of all different logging levels
  * How to teach
    * Write `log4j.properties` file
    * Explain log4j, why it is needed, logging levels, etc
    * Run example

## JUnit - `com.revature.junit`
* `TestMathOps`
  * Resources: Classes - `junit.MathOps`, `junit.TestMathOps`
  * What this example does
    * Uses assert methods to test basic math operations defined in `MathOps`
    * Uses all JUnit annotations to demo the order of operation
  * How to teach
    * For TDD: write `TestMathOps` class first to test addition, subtraction, division functionality
    * Run tests to see them fail, and explain order of execution
    * Add functionality in `MathOps` class
    * Run tests to see them pass
* `ParameterizedMathTest`
  * Topics: JUnit parameterized tests
  * What this example does
    * Generates test data and uses parameterized test to test the `.divide()` method of `MathOps`
  * How to teach
    * Explain `@RunWith`, `@Parameters`, `@Parameter` annotations
    * Write the static `@Parameters` method to generate test data
    * 2 ways to use this example:
      * `@Parameter` annotations

## Threads - `com.revature.threads`
* `ThreadDriver`
  * Topics:
  * What this example does
  * How to teach
* `DiningPhilosophersProblem`
  * Topics:
  * What this example does
  * How to teach
* `ThreadsafeExample`
  * Topics:
  * What this example does
  * How to teach

#### Deadlock - `com.revature.threads.deadlock`
* `Launcher`
  * Topics: Deadlock

## Advanced - `com.revature.advanced`
* `LambdaExample`
  * Topics: Functional interfaces, lambda function invocation, `Iterable.forEach` method
* `Date`
  * Topics:
  * What this example does
  * How to teach
* `LambdaComparator`
  * Topics:
  * What this example does
  * How to teach
* `Stream`
  * Topics:
  * What this example does
  * How to teach
* `PredicateExample`
  * Topics: `Predicate` and `Consumer` interfaces
  * What this example does
  * How to teach
