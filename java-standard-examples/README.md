# Standard Java Examples
There are two separate Maven projects in this folder:
* `java` - which contains standard, week 1 Java code examples
* `jdbc` - which contains JDBC and DAO examples only

**Currently, both projects are using a Java 8 environment.**

**Note: JDBC examples are using OJDBC7**

## Getting Started
To set up these examples locally, first clone this repository:
```
git clone https://gitlab.com/revature_training/java-team.git
```
Then import the two Maven project folders into your IDE:
* In Eclipse/STS, go to `File > Import Projects From File System`
* Select the `java-standard-examples/java` or `java-standard-examples/jdbc` directory and click "Finish"
* You're all set!

## High-level Overview
The code examples are organized into packages based on curriculum topics:
<ol>
  <li>Java basics - 13 examples
    <ol style="list-style: lower-alpha">
      <li>Control flow</li>
      <li>Constructors</li>
    </ol>
  </li>
  <li>OOP - 3 examples</li>
  <li>Strings - 4 examples</li>
  <li>Collections - 3 examples
    <ol style="list-style: lower-alpha">
      <li>Generics</li>
    </ol>
  </li>
  <li>I/O / Serialization - 4 examples</li>
  <li>Design patterns - 4 examples
    <ol style="list-style: lower-alpha">
      <li>Singleton</li>
      <li>Factory</li>
      <li>Builder</li>
      <li>Observer</li>
    </ol>
  </li>
  <li>Exceptions - 3 examples</li>
  <li>Reflections - 2 examples</li>
  <li>Log4J - 1 example</li>
  <li>JUnit - 2 examples</li>
  <li>Threads - 4 examples</li>
  <li>Advanced - 5 examples</li>
  <li>JDBC - 1 example</li>
</ol>

**TOTAL EXAMPLES: 49**

## List of Examples
Below is a list of examples broken down by topic with a short description. A more
detailed explanation is contained in the specific project README file.

*NOTE: all packages located within `com.revature`*

#### Java Examples

| #   | Fully Qualified Class Name | Short Description |
| --- |:-------------------------- | :-----------------|
| 1.1 | `javaBasics.HelloWorld` | Simple "Hello world" class to get familiar with syntax, main method, etc |
| 1.2 | `javaBasics.Datatypes` | Show default values for each primitive |
| 1.3 | `javaBasics.ReverseAString` | Example for reversing a string only using `.charAt()`; has associated unit test |
| 1.4 | `javaBasics.StaticExample` | Understanding the difference between static/instance variables; must execute associated unit test |
| 1.5 | `javaBasics.Arrays` | All about Java arrays - creating, referencing elements, looping, nested looping, multi-dimensional |
| 1.6 | `javaBasics.WrapperClasses` | Wrapper classes - max/min values, autoboxing/unboxing, parsing from `stdin`, comparing primitives/wrappers |
| 1.7 | `javaBasics.VarArgsDriver` | Varargs - optional usage, comparison with arrays |
| 1.8 | `javaBasics.GarbageDriver` | Explanation of garbage collection, `.finalize()` method, calling `System.gc()` |
| 1.9 | `javaBasics.controlFlow.ControlFlow` | If/else and switch statements, `break` keyword |
| 1.10 | `javaBasics.controlFlow.LoopsExample` | for, while, do-while, `continue` keyword |
| 1.11 | `javaBasics.controlFlow.GradeCalculator` | Enhanced for loop, command line args, varargs |
| 1.12 | `javaBasics.constructors.A,B,C` | Default no-arg constructor, `super` keyword, hidden methods, constructors and inheritance |
| 1.13 | `javaBasics.constructors.Chaining` | Constructor chaining, `this` keyword |
| 2.1 | `oop.Overloading` | Some simple overloaded methods |
| 2.2 | `oop.AnimalExample` | Abstract class, covariance, overriding |
| 2.3 | `oop.InterfaceExample` | Interfaces - implicit modifiers and default keyword, implementing multiple interfaces |
| 3.1 | `strings.StringDriver` | String pool, string literals, `==` vs `.equals()` comparison, string methods |
| 3.2 | `strings.ImmutableStringExample` | String immutability, comparison with `StringBuilder`, `.concat()` method |
| 3.3 | `strings.StringClassesComparison` | Comparing `StringBuilder`/`StringBuffer` speed to `String` |
| 3.4 | `strings.StringThreadSafety` | Comparing `StringBuilder` and `StringBuffer` (thread safety) |
| 4.1 | `collections.CollectionDriver` | `Collections`, `List`, `Set`, `Queue`, `Map`, `Iterator` |
| 4.2 | `collections.Pokemon` | Comparison / sorting of objects in collections |
| 4.3 | `collections.generics.GenericDriver` | Generics / type safety |
| 5.1 | `serialization.FileReaderWriterExample` | `FileReader`/`FileWriter` use, closing resources, `try-with-resources` |
| 5.2 | `serialization.FBPlayerSerialization` | Reading/writing football player object to/from a file, `transient` keyword |
| 5.3 | `serialization.FileIOCatExample` | Takes a cat photo (a .jpg file) and copies to a new file, also corrupts the image and saves to different file |
| 5.4 | `serialization.SimpleConsoleApp` | Use of `Scanner` class, static methods, loops |
| 6.1 | `designpatterns.singleton.SingletonDriver` | Example of all singleton types: eager, lazy, lazylocked, and on-demand |
| 6.2 | `designpatterns.factory.FactoryDriver` | Shows the `CurrencyFactory` use for retrieving currency from USA, China, Italy, and Venezuela |
| 6.3 | `designpatterns.builder.BuilderDriver` | Uses `Cake` class to show builder design pattern, explain pros/cons |
| 6.4 | `designpatterns.observer.ObserverDriver` | Demo of observer design pattern |
| 7.1 | `exceptions.BasicExceptionExample` | Intro to exceptions, `try/catch/finally` blocks, multi-catch blocks |
| 7.2 | `exceptions.BicycleDriver` | Shows practicality of exceptions - implementation of custom `NegativeSpeedException` |
| 7.3 | `exceptions.FinallyExamples` | Demonstrates under what conditions `finally` block will or will not execute |
| 8.1 | `reflections.Reflection` | Getting methods, constructors, fields at runtime |
| 8.2 | `reflections.RunInspection` | Inspecting and invoking methods at runtime |
| 9.1 | `log4j.LoggingExamples` | Log4j: logging levels, properties file |
| 10.1 | `junit.TestMathOps` | Basic JUnit test example - using annotations, expecting exception to be thrown  |
| 10.2 | `junit.ParameterizedMathTest` | Using JUnit parameterized test - `@Parameters`, constructor to consume test data vs `@Parameter` |
| 11.1 | `threads.ThreadDriver` | Creating/executing threads, setting/getting priority, `.join()` method |
| 11.2 | `threads.DiningPhilosophersProblem` | Dining Philosphers Problem - multithreading, preventing deadlock, synchronization |
| 11.3 | `threads.ThreadsafeExample` | Threadsafe `Vector` vs non-threadsafe `ArrayList` - inserting elements & inspecting `null`s and exceptions thrown |
| 11.4 | `threads.deadlock.Launcher` | Causing deadlock |
| 12.1 | `advanced.LambdaExample` | Simple lambda, functional interfaces, for-each with lambda |
| 12.2 | `advanced.Date` | `LocalDateTime` API |
| 12.3 | `advanced.LambdaComparator` | Shows `Runnable` and `Comparator` using lambdas |
| 12.4 | `advanced.Stream` | `Stream` API - `Arrays.stream()` method, filtering, iterating, getting max/average, using lambdas |
| 12.5 | `advanced.PredicateExample` | `Predicate` and `Consumer` interfaces with lambdas |

#### JDBC Examples
| #   | Fully Qualified Class Name | Short Description |
| --- |:-------------------------- | :---------------- |
| 1 | `celebrity.CelebrityRepositoryJDBC` | Basic JDBC example |
