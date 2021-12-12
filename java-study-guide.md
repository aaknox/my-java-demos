## Java Study Guide

You should be able to explain and apply the following topics:

### Fundamentals
- Features, benefits, and drawbacks of the Java language
  - WORA (write once, run anywhere)
  - Backed by Oracle
  - Rich APIs (e.g. Collections API)
  - Object-oriented
  - Strongly/strictly typed
  - High level (e.g. memory handled via automatic garbage collection)
  - Verbose
- POJO vs Bean
- Stack vs Heap
- Purpose and contents of the JDK, JRE, and JVM
- Garbage collection
- Main method signature and significance
- Compiling and executing Java code on the command line
- JavaDocs
- Primitive data types
  - boolean
  - byte
  - char
  - short
  - int
  - float
  - double
  - long
- Operators
  - pre / post-increment
  - ternary
  - logical
- Scopes of variables
  - static / class
  - object / instance
  - method
  - block
- Control flow statements
  - for
  - enhanced for loop
  - if/else 
  - while
  - do-while
  - switch
- Class members
  - Fields
  - Methods
  - Constructors
  - Nested classes (advanced)
- Access modifiers
  - public
  - protected
  - default
  - private
- Non-access modifiers
  - static
  - final
  - abstract
  - synchronized
  - transient
- Packages and import statements
  - static imports
- this and super keywords
- Constructor chaining
- JRE library classes
  - Object
    - equals, hashCode, and toString methods
  - System
  - String
  - StringBuilder
  - StringBuffer
  - Collections
  - Arrays
- Wrapper classes
  - Autoboxing / unboxing
- String pool
- == vs .equals()
- Making objects immutable
- Varargs

### OOP
- Object-oriented programming principles
  - Abstraction
    - Abstract classes
    - Interfaces
  - Polymorphism
    - Overloading
    - Overriding
    - Covariant return types
  - Inheritance
    - Inheriting from classes vs interfaces
  - Encapsulation
    - Using access modifiers with getters/setters
- Object vs class
- Abstract classes
  - Difference between abstract and concrete class
- Interfaces
  - Implicit modifiers for variables and methods
  - When to use instead of abstract class

### Collections & Generics
- Collections API
  - Inheritance hierarchy
  - List, Set, Map, and Queue interfaces and their differences
  - Concrete implementations of above interfaces and their differences
  - Using enhanced for loops
  - Comparable and Comparator interfaces
  - Iterable vs Iterator interfaces
- Annotations
  - @Override
  - @Deprecated
- Generics
  - Generic classes
  - Generic methods
  - Diamond operator and type inference
- Serializable interface

### Exceptions
- Class hierarchy
- Error
- Exception
- RuntimeException
- Checked vs unchecked exceptions
- Handling or declaring exceptions
- try/catch/finally blocks
  - rules for multiple catch blocks
  - try-with-resources
- Creating custom exceptions

### Threads
- Lifecycle of a thread
- Thread states
- Creating threads
- Thread class & thread methods
- Runnable interface
- Deadlock and ways to prevent it
- Livelock

### Reflections API
- Benefits and purpose of Reflection API
- Classes and interfaces
  - Class
  - Method
  - Modifier

### Java 8
- Functional interfaces
- Lamdba functions
- Default method implementation in interfaces

### Design Patterns
- Singleton
- Factory

### Maven, JUnit, Log4j
- Maven
  - build automation
  - dependency management
  - maven repository locations (central vs local)
  - pom.xml file and tags
  - Project artifacts
    - group-id
    - artifact-id
    - version
- Test-driven development (TDD)
- JUnit annotations
  - @Test
  - @Before
  - @After
  - @BeforeClass
  - @AfterClass
  - @Ignore
  - Order of execution of these annotated methods
- Assert class methods
- Testing best practices
  - Dependency injection
  - Writing testable code
  - Mocking
  - Measuring code coverage
  - Externalize data
  - Deterministic (non-flaky) tests
- Benefits / purpose of logging
- Log4j logging levels and threshold
  - ALL
  - DEBUG
  - INFO
  - WARN
  - ERROR
  - FATAL
  - OFF
