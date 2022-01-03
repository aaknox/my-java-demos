## QC Questions

### Core Questions
These should be asked every QC:
* What is Java?
* What is JRE / JDK / JVM?
* What is an object / class?
* What is the root class from which every class extends?
* What are the 4 pillars of OOP / Explain each?
* What is the difference between an abstract class and an interface?
* What are the primitive data types in Java?
* What is the difference between method overloading and overriding?
* Difference between `extends` and `implements`?
* What are collections in Java?
* What are the interfaces in the Collections API?
* What is the difference between a `Set` and a `List`?
* What is the difference between a `Array` and a `ArrayList`?
* What is the difference between `ArrayList` and `Vector`?
* What is the difference between `TreeSet` and `HashSet`?
* What is the difference between `HashTable` and `HashMap`?
* Are `Map`s in the Collections API?
* Where are `String`s stored?
* What are generics? What is the diamond operator (`<>`)?
* What are enumerations (`enums`s)?
* What are annotations?
* Explain stack vs heap?
* How do you serialize / deserialize an object in Java?
* What is a POJO? What is a bean?
* How can you force garbage collection in Java?
* What is the difference between `final`, `.finalize()`, and `finally`?
* Do you need a `catch` block? Can have more than 1? Order of them?
* What is base class of all exceptions? What interface do they all extend?
* List some checked and unchecked exceptions?
* What is a Marker interface?
* Why are strings immutable in Java?
* What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
* What are the access modifiers in Java? Explain them.
* What are the non-access modifiers in Java?
* What is the difference between `static` and `final` variables?
* What are the default values for all data types in Java?
* What are the implicit modifiers for interface variables / methods?
* What are `transient` variables?
* What is a wrapper class?
* What is autoboxing / unboxing?
* What is the Reflections API?
* Is Java pass-by-value or pass-by-reference?
* What is multi-threading and how do you create a thread?
* Lifecycle of a thread
* What is deadlock?
* What is `synchronized` keyword?
* What is the difference between `==` and `.equals()`?
* What are functional interfaces?
* What are lambdas?
* `throw` vs `throws` vs `Throwable`?
* First line of constructor?
* What are Singleton / Factory design patterns?

### JUnit / Maven
* What is JUnit?
* What are the annotations in JUnit? Order of execution?
* Give an example of a test case?
* What is Maven?
* What is the Maven lifecycle?
* Where does Maven retrieve dependencies from (and when)? Where are they stored locally?
* What is the POM and what is the pom.xml?

### Advanced Questions
* What methods are available in the `Object` class?
* What is an enhanced `for` loop and what is a `forEach` loop?
* What is try-with-resources? What interface must the resource implement to use this feature?
* How to make numbers in your code more readable (use `_` in numeric literals)?
* What are covariant return types?
* What are 3 usages of super keyword?
* Can you overload / override a main method? static method? a private method? a default method? a protected method?
* Difference between `FileReader` and `BufferedReader`?
* How to pass multiple values with a single parameter into a method?
* What is static block?
* What is static imports?
* How would you clone an object?
* What makes a class immutable?
* If two objects are equal, do they have the same hashcode? If not equal?

### Break them
* What data types are supported in `switch` statements?
* List all non-access modifiers?
* Which collections cannot hold `null` values?
* Can overriden constructors declare more exceptions (or more broad exceptions) than the parent class constructor / compare this with methods?
* If 2 interfaces have default method and you implement both, what happens?
* If 2 interfaces have same variable names and you implement both, what happens?
* Why does `HashTable` not take `null` key?
* What new syntax for creating variables was introduced with Java 10?
* Is there an interactive REPL tool for Java like there is for languages like Python?
* What are collection factory methods?
* Multi-catch block - can you `catch` more than one exception in a single catch block?