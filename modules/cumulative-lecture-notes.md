# Java Lecture Notes
## Module - Core Java

This page covers the core of Java syntax and constructs and all the topics defined for this module.

### Helpful References
* [Javadocs (Java 8)](https://docs.oracle.com/javase/8/docs/api/)
* [Setting up your local environment for Java development](../../setup.md)

### Introduction to Java
Java is a high-level, compiled, strongly typed object-oriended programming (OOP) language. The advantages of Java are many: it is platform independent, has a C-language inspired syntax, provides automatic memory management, has an extensive built-in runtime library, is supported by the Oracle corporation, and has a rich open source community.

When we say Java is *object-oriented*, we mean that it has the constructs of **classes** and **objects** built into the language. It also allows us to use various principles of object-oriented programming, which are covered in a separate module. An object in code can represent a real-world entity, or a conceptual entity. Classes are the *blueprints* for how to create objects that contain  a certain **state** - which is represented by *fields* (variables) - and **behavior** - which is defined via *methods*. Objects are instances of class definitions. However, Java is not 100% object-oriented because it still has [**primitive values**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) (or just: primitives), which are defined below:

| Primitive type | Size | Description |
| -------------- | ---- | ----------- |
|`boolean` | not specified (JVM-dependent) | represents true and false values |
|`byte` | 8-bit | numerical, integral value |
|`short` | 16-bit | signed numerical, integral value |
|`char` | 16-bit | unsigned numerical, Unicode character |
|`int` | 32-bit | numerical, integral value |
|`long` | 64-bit | numerical, integral value |
|`float` | 32-bit | floating point value |
|`double` | 64-bit | floating point value |

#### JVM, JRE, JDK

When we say Java is platform independent, we mean that Java programs are not constrained to a single operating system - Java code can be run on many different systems. Another way of saying this is that with Java, we can **write once, run anywhere** (WORA). Portability is possible because Java code is compiled to **bytecode** and runs on a **JVM - or Java Virtual Machine**. The JVM is specific to the operating system - there is a JVM for Windows, one for Mac, one for Linux, etc. The JVM reads the compiled Java bytecode and translates it to machine code to be executed on the given system. Actually, in order to run Java code, you also need a **JRE - Java Runtime Environment**, which contains all the runtime libraries that your code will be calling and using. The JRE contains the JVM within it, so if you want to run a Java program, all you need to install is the JRE.

But how do we actually compile the Java code that we write down to bytecode that the JVM will understand? For that, you need a **JDK - Java Development Kit**, which provides developer tools like a compiler, debugger, documentation tools (`javadoc`), and other command-line utilities. The JDK also has a JRE inside of it, so if you install a JDK you can compile your Java code as well as execute it. 

So, to recap - the JDK contains tools for Java development as well as a JRE, which contains the built-in Java libraries as well as a JVM, which actually executes your Java bytecode and runs it on the specific operating system it is installed upon.

### First Java Program - HelloWorld
Let's walk through a simple HelloWorld program. You must have a JDK intalled in order to do this.
1. Open up your command-line terminal application
2. Check that you have a JDK installed:
```bash
javac -version
# if you get something like "command not found" on your terminal, you don't have the JDK installed
```
3. Create a directory, move to it, and create a file called `HelloWorld.java`
```bash
mkdir java-practice
cd java-practice
touch HelloWorld.java
```
Now open this file with a simple text editor program and write the HelloWorld application.
```java
package com.revature.mypackage;
public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}
```

4. Now that the source code is written, we can compile it into bytecode using the compiler (`javac`):
```bash
javac HelloWorld.java
# Hello, world!
```
You should now see a `HelloWorld.class` file in your directory - this contains the compiled bytecode of the program. If you open it up in a text editor, it will appear as gibberish because the bytecode is not human-readable, it is merely instructions that the JVM can understand and run.
    
5. Finally we can run the compiled bytecode using the `java` command
```bash
java HelloWorld
```
This command loads and executes the `HelloWorld.class` file. Note that we **do not** include the `.class` extension when using the `java` command.

### Modifiers, Members, Scopes, and More

Now let's walk through each keyword in the code we just wrote and explain what they mean.

#### Packages
```
package com.revature.mypackage;
```
This line declares the **package** in which the class will reside. This must always be the first (non-commented) line in a `.java` file. Packages are a way of organizing classes, interfaces, and enums in a hierarchical manner. Packages follow a naming convention of lowercase characters separated by periods in the reverse way you would specify a web domain - thus, `com.revature.mypackage` instead of `mypackage.revature.com`.

Also, classes can be referenced anywhere in a program by their "fully qualified class name" - which is the package declaration followed by the class, in order to uniquely identify the class. In our example, the fully qualified class name is `com.revature.mypackage.HelloWorld`.

But typically we do not want to write out a verbose package and class name together. Instead, we can use an `import` statement after our package declaration to pull in other classes. We can then just use the class name without the package. By default, everything in the `java.lang` package is imported (which gives us the `System` class we used in the example). Other packages and classes must be imported by the programmer explicitly.

#### Class declaration
```
public class HelloWorld {}
```
This line declares a class with name "HelloWorld". `public` is an **access modifier** we'll talk about later. `class` is a keyword we use to declare the class itself. The class is defined by wrapping it with curly braces (`{}`). It is important to note that **the name of the public class must match the name of the file in which it is declared**.

#### `main` method
```
public static void main(String[] args) {}
```
This line declares a **method** called `main`. Again, `public` is an access modifier we'll talk about in a minute. `static` is a **non-access modifier** which we will also discuss below. `void` is the "return type" of the method - in this case, the method does not return any data. Finally, the method takes an **array** of String objects as its only parameter. The method definition is wrapped in curly braces to define the beginning and end of the method.

One more note on the `main` method - the array of `String`s defined in the method parameters are passed from the command line when the `java` command is run. For example, the following command: 
```
java HelloWorld string1 string2 string3
```
will pass an array of three `String`s containing "string1", "string2", and "string3" to the `HelloWorld` program. The program can then use the `String`s passed at runtime just like any other variable.

All methods in a class are defined by their access modifier, any non-access modifiers, return type, method name, and (optionally) a `throws` exception declaration (covered in a separate module). Together, these form the **method signature**. The "main" method is a special method - when the code is executed, the JVM looks specifically for and invokes this unique method signature, which specifies the "entry point" of the application.

Methods are just one example of constructs that can be contained in a class. Other class members include fields (variables), constructors, initialization blocks, and even inner classes, interfaces, or enums.

#### Variable scopes
When a variable is declared in a Java program, it is attached to a specific **scope** within the program, which determines where the variable resides. The different **scopes of a variable** in Java are:
* Instance, or object, scope
* Class, or static, scope
* Method scope
* Block scope

Instance scope means that the variable is attached to individual objects created from the class. When an instance-scoped variable is modified, it has no effect on other, distinct objects of the same class.

Class scoped variables reside on the class definition itself. This means that when objects update a class-scoped variable, the change is reflected across all instances of the class. Class scope is declared with the `static` keyword. Methods can also be declared as class scope. However, `static` methods cannot invoke instance methods or variables (think about it: which specific object would they reference?). Static methods and variables should be referenced through the class directly, not through an object. For example: `MyClass.myStaticMethod()` or `MyClass.myStaticVariable`.

Method scope is the scope of a variable declared within a method block, whether static or instance. Method-scoped variables are only available within the method they are declared; they do not exist after the method finishes execution (the stack frame is popped from the stack and removed from memory after execution).

Block scoped variables only exist within the specific control flow block, of which there are several in Java: `for`, `while`, and `do-while` loops, `if/else-if/else` blocks, `switch` cases, or even just regular blocks of code declared via curly braces (`{}`). After the block ends, variables declared within it are no longer available.

#### Modifiers

We already saw two different **modifiers** on the `main` method above - one is an **access modifier** and the other is a **non-access modifier**. 

##### Access Modifiers

Access modifiers are keywords which define the ability of other code to access the given entity. Modifiers can be placed on classes, interfaces, enums, and class members. The access modifiers are listed below:

| Modifier | Access Level |
| --- | --- |
| `public` | Available anywhere |
| `protected` | Within the same package, and this class' sub-classes |
| `default` | Within the same package |
| `private` | Only within the same class |

The `default` access level requires additional clarification - this access level is "default" because **there is no keyword** to be used. This access level is also known as "package private".

Using `private` modifiers on instance variables - along with public getter and setter methods - helps with **encapsulation**, which is one of the pillars of object-oriented programming.

##### Non-Access Modifiers

Java also has **non-access** modifiers which can be placed on various class members:
* `static` - denotes "class" scope, meaning the member resides on the class itself, not object instances.
  * `static` variables can be accessed through the class, e.g. `MyClass.staticVariable`
  * `static` methods can be called directly without needing an instance of the class, e.g. `MyClass.someMethod()`
* `final`
  * when applied to a variable, it means the variable **cannot be re-assigned**
  * when applied to a class, it means the class **cannot be extended**
  * when applied to a method, it means the method **cannot be overriden**
* `abstract`
  * when applied to a class, the class **cannot be instantiated** directly (instead, it should be *inherited*)
  * when applied to a method, only the method signature is defined, not the implementation. Also, the class where the method resides must also be abstract. Concrete subclasses **must implement the abstract method**.
* `synchronized` - relevant to threads and preventing deadlock phenomena (discussed in a separate module)
* `transient` - marks a variables as non-serializable, meaning it will not be persisted when written to a byte stream (discussed in another module)
* `volatile` - marks a variable to never be cached thread-locally. Obscure, rarely-used keyword.
* `strictfp` - restricts floating point calculations for portability. Obscure, rarely-used keyword.

Below is a class with various class members which have different modifiers associated with them:
```
package com.revature.mypackage;

public class Example {
    // <-- this notation specifies a comment
	public boolean a; // this variable can be accessed anywhere, on an object of type Example
	protected byte b; // accessible within com.revature.mypackage or subclasses of Example
	static int c; // class scope with default access
	private String d; // can only be accessed within this class
	
	public static void main(String[] args) {
		Example myExample = new Example();
		myExample.printValues();
		// prints out the default values:
		// The value of a is: false
		// The value of b is: 0
		// The value of c is: 0
		// The value of d is:
	}
	
	public void printValues() {
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is: " + d);
	}
}
```

### Strongly Typed
As shown above, the `new` keyword is used to instantiate objects from classes. We declare the **type** of the variable `myExample` as the class `Example`. We can then call the methods and reference the variables located on that specific type, as we do with `myExample.printValues()`. If we tried to call a method that is not defined on the class `Example`, the code will not compile. Also, we cannot reassign the variable `myExample` to any object that is not an `Example` (which may include sub-classes of `Example` - covered in another module). The type of any variable is known at compile-time, and the compiler enforces rules about types. This is what we mean when we say Java is **strongly typed**. This feature of Java means that entire categories of programming issues can be caught and addressed at compile-time instead of runtime, avoiding unpredictable results.

### Code Comments
In Java, inline code comments are designated by `//`. Multi-line comments start with `/*` and end with `*/`. These types of comments can help explain to other developers (and yourself) what the code is doing or why a particular solution or style was chosen. Comments should be clear, concise, and descriptive. Don't comment unnecessarily, either, as this can lead to clutter and detract from the readability of the code.

#### Javadocs
Java has a tools to handle code documentation within the source code itself - using **Javadocs**. [Javadocs](https://en.wikipedia.org/wiki/Javadoc) are written in a special comment starting with `/**` and ending with `*/`. You can place on anything in your code you want to document - a class, a method, a constructor, an interface. Inside, you can provide a description of the construct, or explain important information about its API.

Inside your Javadoc comment, you can also make use of HTML tags for marking up and formatting your documentation. You can also include metadata, like the author of the code, and link to other docs using `@`. When your project is built, typically with a tool like Maven (covered in another module), your Javadocs can be built into a full HTML site to provide API documentation on your project.

Simply look into some built-in Java library source code to get an idea for how developers of the Java language itself use Javadocs to document various classes, interfaces, and methods.

### Stack and Heap
Inside the JVM, our application memory is divided into the "[stack][1]" and the "[heap][2]". The stack is where method invocations and reference variables are stored in stack frames. For example, when the JVM invokes the `main` method a stack frame is created for it and placed on the stack. Multiple stacks are possible - for example, when a thread is created it is given its own stack.

The heap, in contrast, is a central location in memory where all objects are stored. New objects are created via the `new` keyword and (optionally) assigned to a reference variable, which can then be re-assigned to reference different objects later. Thus, multiple reference variables could point to the same object in memory.

**Note:** Errors at runtime can be thrown if a program runs out of memory addresses for new stack frames (`StackOverflowError`), or if no memory is available in the heap for object creation (`OutOfMemoryError`).

### Garbage Collection
Consider the following Java code snippet:
```java
Object o1 = new Object(); // 1
Object o2 = new Object(); // 2
Object o3 = o1;           // 3
o2 = o3;                  // 4
```

How many objects have we created on the heap? We determine this by counting the number of `new` keywords: in this case, 2. However, we have declared 3 reference variables that point to these objects in memory. The third line does not create a new object, it simply creates a new reference variable pointing to the object created on the first line. The last line reassigns the `o2` variable to reference the object `o3` is referencing, which is the first object created.

But what happened to the object created on the second line? After line 4, there are no reference variables pointing to it, thus it can never be used again in the program. When a condition like this occurs, the object becomes eligible for garbage collection - **the process of removing objects from the heap which have no references to them**. In lower-level programming languages, memory is manipulated directly in the code, but Java abstracts these details away from the developer by allowing the JVM to handle memory management itself. We already know that the JVM creates objects in the heap when we invoke the `new` keyword. It also will clean up objects for us, freeing up memory for new objects to be created.

As demonstrated, garbage collection is run in the background by the JVM. **There is no way we can explicitly force garbage collection to happen**, but we can *request* garbage collection to be run through the use of one of the following:
* `System.gc()`
* `Runtime.getRuntime().gc()`
* `System.runFinalize()`

### Constructors
When we use the `new` keyword in order to create an object, the JVM is invoking a special class member called a **constructor**. A constructor declares how an object is to be instantiated and initialized from the class "blueprint". A constructor is declared like a method, except **its method signature does not contain a return type, and a constructor always has the same name as the class**. The new object returned from the constructor is always of the class in which the constructor is declared. A simple example is shown below:
```java
public class ConstructorExample {

  int myNumber;

  public static void main(String[] args) {
    ConstructorExample ce = new ConstructorExample(3); // a
	System.out.println(ce.myNumber); // b
  }
  
  public ConstructorExample(int myNumber) { // c
    this.myNumber = myNumber; // d
  }
}
```

#### `this` keyword
When this program is run, it will print `3`. How does this happen? The constructor is defined on line "c" with one input parameter. Note that the constructor does not have a return type. On line "d", the **parameter** myNumber is assigned to the **instance variable** myNumber via the `this` keyword. `this` refers to the object which is being instantiated - it is used to initialize instance variables, or - to call other constructors (this is called constructor chaining).

When the program above is run, the `main` method is executed. On line "a", a new `ConstructorExample` object is created and assigned to the variable `ce`. The constructor is invoked with the `new` keyword and the int `3` is passed as the argument. This assigns the value 3 to the instance variable `myNumber` on the object returned, as explained above. Finally, the instance variable is printed out and the program finishes execution.

#### `super` keyword
There is another keyword important for constructors - the `super` keyword, which references the "super", or parent, class. When invoked as a method (`super()`), the parent class constructor will be called. A `super()` call (or a `this()` call) **must** be the first line of any constructor. If not explicitly provided, the compiler will inject it on the first line.

#### Default constructor
Earlier, in our `Example` class, we saw a constructor with no arguments used with the `new` keyword. But we didn't define a constructor, so how is this possible? It turns out the compiler will inject a "default" constructor for us if we are too lazy to define one ourselves. The "default" constructor takes no arguments and simply calls `super()` (see above) - sometimes it is referred to as the "default, no-args" constructor. However, be warned that if we define our own constructor(s) in the class, we will **not** receive a default constructor from the compiler.

Thus, the simple class:
```java
public class MySimpleClass {}
```
has a default no-args constructor that can be called: `MySimpleClass someVariable = new MySimpleClass();`

### Object class
We also saw earlier in the garbage collection example about an `Object` - this is a [special class](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) in Java which is the root class from which all other classes inherit, either direcly or indirectly. Thus, all objects have at least the methods defined in the `Object` class:
1. `Object clone()`
2. `boolean equals(Object o)`
3. `void finalize()`
4. `Class<?> getClass()`
5. `int hashCode()`
6. `void notify()`
7. `void notifyAll()`
8. `String toString()`
9. `void wait()`
10. `void wait(long timeout)`
11. `void wait(long timeout, int nanos)`

#### Object class methods

The `toString()` method is automatically called if you print an Object. Usually, this is overridden to provide human-readable output. Otherwise, you will print out `fully.qualified.ClassName@memoryAddress`

The `equals(Object o)` method compares two Objects. The `==` operator also compares objects, but only the memory address (i.e. will return `true` if and only if the variables refer to the exact same object in memory). By default, and unless you explicitly override it, the `equals` method simply calls the `==` operator.

The `hashCode()` method returns a hash code - a number that puts instances of a class into a finite number of categories. There are a few rules that the method follows:
* You are expected to override `hashCode()` if you override `equals()`
* The result of `hashCode()` should not change in a program
* if `.equals()` returns true, the hash codes should be equal
* if `.equals()` returns false, the hash codes do not have to be distinct. However, doing so will help the performance of hash tables.

Finally, the `.finalize()` method is called by the garbage collector when it determines there are no more references to the object. It can be overriden to perform cleanup activities before garbage collection, although it has been deprecated in newer versions of Java.

### Pass-by-Value
The Java language passes variables into methods by value, not by reference. It's important to note that when objects are stored in variables, the variable is like a "pointer" or "reference" to the object. When object reference variables are passed to a method, it is not possible to change the reference itself, because the **value** of the reference is passed. If this topic is confusing, see [this question and answer](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value).

### Order of Initialization
There are many different ways to initialize the state of a class or object in Java, including via static and instance initialization blocks, constructors, and static / instance variable assignments. It is important to know the order in which these constructs will execute:
1. Static Variables
2. Static Initializers
3. Instance Variables
4. Instance Initializers
5. Constructors

```java
    class Application {
        static {
            System.out.println("Inside the static initializer");
        }

        {
            System.out.println("Inside the instance initializer");
        }

        public Application() {
            System.out.println("Inside the constructor");
        }

        public static void main(String[] args) {
            new Application();
            // Will print out, in this order:
            // Inside the static initializer
            // Inside the instance initializer
            // Inside the constructor
        }
    }
```

### Strings
In Java, Strings are **not** primitives - they are immutable, constant objects derived from the [`String`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) class. To be immutable means that the state or value of the object cannot be altered once created - this is accomplished by having internal, private and final fields and not implementing any "setter" methods which would alter the state of those fields.

Because Strings are immutable, all of the methods in the String class return a **new** String - the original is not modified. For example:
```java
String str1 = "my string";
str1.concat(" is the best!");
System.out.println(str1);
```
will print out `my string`. Why? Because the `.concat()` method **returns** a completely different string which we are not assigning to any variable, and the original object is not changed (it is immutable). Thus, `str1` still refers to the String "my string". In order to make the code print "my string is the best!", we would need to change line 2: `str1 = str1.concat(" is the best!");` which **re-assigns** the reference variable `str1` to the new String returned from the method (the original String hasn't changed, however).

#### String Pool
When Strings are created they are placed in a special location within the heap called the String Pool. When String literals are created, if there is an existing String that matches in the String Pool, the reference variable will point to the existing value. Duplicates will not exist in the String Pool. This is important because Strings take up a lot of memory. Being able to reuse the same value throughout your application is advantageous.

One way to circumvent the above process is to use the `new` keyword along with the String constructor, which will explicitly create a new String object in memory, even if one already exists in the String Pool.

```java
String a = "foo";
String b = "foo";
String c = new String("foo");
System.out.println(a == b); // true
System.out.println(a == c); // false
```

#### `String`, `StringBuffer`, and `StringBuilder`
Since Strings are immutable, it becomes inefficient to use them if we are making many new Strings constantly, for example if we are generating new Strings in a `for` or `while` loop. Instead, we can use the `StringBuilder` and `StringBuffer` classes, both of which are **mutable**. [`StringBuilder`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) contains helpful methods like `.append()` and `.insert()` which mutate its internal sequence of characters. [`StringBuffer`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html) is like `StringBuilder` but is synchronized, which is useful for multi-threaded applications.

| Class | Immutable? | Thread-safe? | Speed |
| ----  | ---------- | ------------ | ----- |
| String | Y | Y | Slowest |
| StringBuilder | N | N | Fastest |
| StringBuffer | N | Y | Fast |

[`StringTokenizer`](https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html) is a related class which can parse a String and splits it based on a delimiter.

### Control Flow Statements
Java, like most other languages, has a few keywords that define statements which control the flow of program execution:
* `if/else if/else`
* `for`
* `while`
* `do-while`
* `switch`

#### If statements
The basic syntax of `if` statements:
```java
if (condition) { // this is the only block that is required - others are optional
  statement1;
} else if (condition2) {
  statement2;
} else {
  statement3;
}
```

#### For loops
For-loops are used to iterate over data structures. They include 3 statements in parentheses - a declaration, condition, and statement (typically increment or decrement).
```java
for (int i=0; i < myData.length; i++) {
  // typical for loop
  System.out.println(myData[i]);
}
```

Any object which implements the `Iterable` interface can be iterated over using an **enhanced for-loop**. The syntax is given in an example:

```java
List<String> myList = getListOfStrings();
for (String myStr : listOfStrings) {
  System.out.println(myStr);
}
```

#### While statements
While statements test a condition - if the condition evaluates to true the block of code is run, otherwise the block is skipped. The block is looped through as long as the condition remains `true`.
```java
while (true) {
  // infinite loop!
}
```

An alternative to `while` loops is the `do-while` loop. This guarantees that the block will always run at least once:
```java
do {
  // always runs at least once!
} while(condition); // condition evaluated after the block of code
```

#### Switch statements
`switch` statements attempt to match some variable with the value it contains. This type of statement works with `byte`, `short`, `char`, and `int` primitives, along with enumerated types (`enum`s) and - since Java 7 - `String`s. The basic syntax is:

```java
switch(variable) {
  case 'A': System.out.println("Case A matches!"); break; // break is REQUIRED, unless you want control flow to "fall through" to the next case
  case 'B': System.out.println("Case B matches!"); break;
  case 'C': System.out.println("Case C matches!"); break;
  default: System.out.println("this will run if other cases don't match"); break;
}
```

### Operators
There are several different operators in Java. We have already seen the assignment operator (`=`) which assigns a reference variable to a primitive value or object. [This article](https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html) explains in detail many of the other operators, some of which we will discuss below.

#### Increment and decrement operators
In order to increment or decrement integral values, we can use the common **postfix** operators: `x++` and `x--`, where `x` is a `byte`, `short`, `int`, or `long`. A similar operator is the **prefix** increment or decrement: `++x` and `--x`. The difference is that the prefix operator will change the value *before* the rest of the expression is evaluated, while the postfix operator changes the value *after* the entire expression is evaluated.
```
int a = 5;
int b = a++; // assign b=5, then increment a to 6
int c = ++a; // increment a to 7, then assign c=7
System.out.println(a); // 7
System.out.println(b); // 5
System.out.println(c); // 7
```

#### Logical operators
There are a few logical operators you should be aware of: `&&` is the logical AND operator - it compares two boolean values. If both are true, the expression becomes true. Otherwise, the expression becomes false.

The logical OR operator `||` compares two boolean values - if **either** of the values are true, the expression evaluates to true. Otherwise, the expression is false.

Finally, the logical NOT operator `!` reverses the state of the boolean - so true becomes false and false becomes true.

We can combine logical operations like so:
```java
boolean a = true;
boolean b = false;
if (!(a && b)) {
  System.out.println("a and b are NOT both true");
}
```

#### Ternary Operator
The **ternary operator** uses the following syntax: `x = condition ? expr1 : expr2`. If the condition is true, `x` is assigned the value of `expr1`; if the condition is false, `expr2` is assigned.
```java
boolean skyIsBlue = true;
boolean twoAndTwoIsFour = true;
boolean makesSense = (skyIsBlue && twoAndTwoIsFour) ? true : false ;
```

### Wrapper Classes
Wrapper classes are classes that let you treat primitives as Objects. This is necessary - for example - for certain methods which only accept objects and not primitives. **Boxing** is the process of converting a primitive to its wrapper class. Java has a feature called **autoboxing** which will automatically convert primitives to wrapper classes implicitly. **Unboxing** is the reverse - converting a wrapper class to its primitive. Below the wrapper classes are listed:

| Primitive | Wrapper Class |
| --------- | ------------- |
| boolean   | Boolean       |
| byte      | Byte          |
| short     | Short         |
| char      | Character     |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |

Wrapper classes have static helper methods like `.parseX()` and `.valueOf()` for explicit primitive conversion.

```java
public class AutoboxingExample {

  public static void main(String[] args) {
    int n = 5;
    someMethod(n); // autoboxing is done here!
	// 8
  }
  
  public static void someMethod(Integer i) {
    System.out.println(i + 3);
  }
}
```

### Arrays
An array is a contiguous block of memory storing a group of sequentially stored elements of the same type. Arrays in Java are of a fixed size and cannot be resized after declaration. Arrays are declared with square brackets after the type of the array like so:
```java
int[] myInts = new int[]{1, 2, 3, 4};
String languages[] = {"Java", "JavaScript", "SQL"};
```

Items in an array are referenced via their index in square bracket notation, which begins with `0` for the first element. Arrays also have a `length` property specifying the length of the array. This is helpful when iterating over arrays with a `for` loop:
```java
String[] myArr = {"first", "second", "third"};
for (int i = 0; i < myArr.length; i++) {
  System.out.println(myArr[i]);
}
```

### Varargs
Instead of writing our `main` method the standard way, we can use an alternative notation:
```java
public static void main(String... args) { }
```

Here we are using the `varargs` construct `...` which replaces the array notation. `varargs` stands for "variable arguments", and allows us to set an argument to a method whose size is determined at runtime. Java will create an array under the hood to fit the arguments provided. You can only ever have 1 varargs parameter in a method, and it **MUST** be the last parameter defined (otherwise, how would the JVM know the difference between the last value in varargs and the next parameter of the method?). You can omit the vararg value when invoking the method and Java creates an array of size 0.

```java
public class VarargsExample {
  public static void someMethod(int a, int... manyInts) {
    System.out.println("First argument: " + a);
	System.out.println("Next argument: ");
	for (int i = 0; i < manyInts.length; i++) {
	  System.out.println(manyInts[i]);
	}
  }
  
  public static void main(String[] args) {
    VarargsExample.someMethod(1, 3, 4, 5, 6);
	// First argument: 1
	// Next argument:
	// 3
	// 4
	// 5
	// 6
  }
}
```

### Annotations
Java [annotations](https://en.wikipedia.org/wiki/Java_annotation) are special constructs you may see throughout Java code, which use the `@` symbol followed by the name of the annotation. These annotations provide metadata about the source code to the compiler and the JVM. They can be placed on classes, methods, interfaces, and other constructs - however some annotations are restricted to only being placed on certain types or class members.

Annotations can be used to enforce rules in the code, or to abstract some functionality provided by a library or framework. Java frameworks and libraries often process annotations using the Reflection API (covered in another module) to dynamically provide functionality to developers.

Java has a few built-in annotations you should be familiar with:
* `@Override` - declares the method must override an inherited method (otherwise, a compilation error occurs)
* `@Deprecated` - marks a method as obsolete (compilation warning if used anywhere)
* `@SuppressWarnings` - instructs compiler to supress compilation warnings
* `@FunctionalInterface` - designates an interface to be a functional interface (covered in another module)

[1]: https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
[2]: https://en.wikipedia.org/wiki/Heap_(data_structure)
 
# Module - OOP Concepts

This page covers all the topics in the OOP module.

## The Four Pillars of OOP
There are four principles that are often referenced when talking about object-oriented programming. They are as follows:
* Abstraction
* Polymorphism
* Inheritance
* Encapsulation

An easy way to remember these is with the acronym **A PIE**. These concepts provide guidance when designing object-oriented programs. Let's walk through each of these "pillars" of OOP one by one.

### Inheritance
We start with inheritance as it is easiest to understand conceptually. In Java (and other OOP languages), classes contain a blueprint for the state and behavior of objects. Most languages have a method whereby classes (and thus, objects) can **inherit** the state and behavior (read: fields and methods) of other classes. The class from which other classes inherit from is called a "base" or "parent" class, and the class which inherit the parent is called a "child" or "sub"-class. 

In Java, all non-`private` fields and methods are inherited from a parent class when using the `extends` keyword in the class declaration. For example, we could have an `Animal` class as our base class which has a field `numOfLegs` and a method `speak`, and a `Dog` class which extends `Animal`. Thus `Dog` will also have the `numOfLegs` field and `speak` method:
```java
public class Animal {
  public int numOfLegs;
  
  public void speak() {
    System.out.println("*generic animal noise*");
  }
}

public class Dog extends Animal {}
```

`Dog` will get the `speak` method from `Animal`, but can **override** it and implement its own method which is specific to `Dog` if desired. This will be covered later with polymorphism.

The benefit of inheritance lies mainly in the **re-usability of code** - our `Dog` class does not need to redeclare the methods and fields it gets from `Animal`. Thus, we can abide by the common programming guideline **DRY (don't repeat yourself)**.

#### Interfaces and the Diamond Problem
Another way for classes to inherit is through **interfaces**. Interfaces are like a contract which specify behaviors that other classes must provide. Interfaces only supply method signatures which other classes must implement and provide method bodies for. Thus, methods in interfaces are implicitly `public` and `abstract`, even when those keywords are not used. Interfaces can also have variables, which are implicitly `public static final` - meaning they are attached ot the interface itself and are constants that cannot be reassigned. Below is an example of an interface:

```java
public interface Purchaseable {
  int maxPrice; // this is implicitly static!
  
  boolean buy(Item i); // NOTE: no method body. This method is public abstract even though we did not use the keywords
}
```

In Java, classes can only extend from one other class - **there is no multiple inheritance via classes. However, we *can* have multi-level inhertance** - for example, class `C` extends `B` which extends `A`. If multiple inheritance were allowed, imagine what would happen if a class were to extend multiple other classes which both contain the same method. Which method implementation would the subclass inherit? This ambiguity is called the "diamond problem", shown below.

![diamond problem](https://cdn.journaldev.com/wp-content/uploads/2013/07/diamond-problem-multiple-inheritance.png)

In Java we can have multiple inheritance and still bypass the diamond problem by using interfaces. A class can implement an arbitrary number of interfaces. There is no ambiguity because interfaces do not have method bodies (with the exception of Java 8 `default` and `static` interface methods) - the implementing class resolves any ambiguity because it must implement the methods defined in the interfaces.

### Abstraction
**Abstraction** is a programming principle in which we centralize common characteristics and generalize behavior into conceptual classes. In the example above, the `Animal` class contains characteristics and behaviors common to all animals.

Through abstraction, we hide underlying complexity through a simplified interface. Think of a car - you do not need to know how the car works, just how to use the accelerator, brake, and steering wheel. Thus, a car "abstracts" away the internal details of the engine, motor, driveshaft, and other parts. If our `Animal` class were part of a library for creating animals in Java, the user of the library wouldn't need to know exactly how each animal speaks, because the `speak` method is defined on the `Animal` class. We can also use the generic `Animal` type for reference variables without worrying about which specific animal the object is.

```java
Animal a = new Dog();
a.speak();
```

In the example above, `a` is of type `Animal`, not `Dog`. The advantage of writing code this way is that later if we decide we instead need to create a `Cat` here, we can easily change the constructor being invoked. Because the `.speak()` method belongs to the `Animal` class, it is gauranteed to exist for all animals. (Here we are assuming `Cat` would extend `Animal`.)

In Java, we achieve abstraction through abstract classes and interfaces. Abstract classes are classes which cannot be instantiated and are declared with the `abstract` keyword. Generally, it wouldn't make sense to instantiate instantiate our `Animal` class - instead, we use it as a general type and instantiate specific animals. So we could make the `Animal` class abstract instead of concrete.

#### Abstract Classes and Interfaces
Abstract classes, as mentioned above, are more general classes which cannot be instantiated. They instead act as templates for other classes to extend from. Abstract classes can have both concrete and abstract methods - the `abstract` methods must be implemented by concrete subclasses.

Interfaces also cannot be instantiated. They instead serve as contracts for methods that classes must implement. In order to inherit from interfaces, a class declares that it `implements` some interface, or multiple interfaces. Methods declared on an interface are implicitly `public` and `abstract`. Interfaces can have variables, but they are implicitly `public`, `static`, and `final`. Since Java 8, interfaces can also provide method implementations if the method is marked `static` or `default`.

Abstract classes are better suited for defining *common characteristics* of objects and are named as nouns by convention, whereas interfaces are better for defining common *behavior* the implementing class promises to provide.

### Polymorphism
By definition, **polymorphism** means "taking on many forms". In the realm of programming, it describes how objects can behave differently in different contexts. The most common examples of polymorphism in Java are method overloading and overriding.

#### Method Overloading
**Method overloading** is when there exist two or more methods in a class with the same method name, but different method signatures by changing the parameter list. For example:
```java
public class MyClass {
  public static void main(String[] args) {
    MyClass mc = new MyClass();
	mc.foo("str", 1); // prints "version 1"
	mc.foo("str");    // prints "version 2"
  }
  public void foo(String a, int b) {
    System.out.println("version 1");
  }
  
  public void foo(String a) {
    System.out.println("version 2");
  }
}
```

We can change the number of parameters (like above), the types of the parameters, or the order in which the parameters are passed. Which version of the method is executed is determined by the parameters passed when the method is invoked. Note that varying the return type of the method is **not** permitted - this will not compile.

Because the argument list is known at compilation, the compiler knows which version of the method will be executed. Therefore, method overloading is a type of **compile-time** - or **static** - polymorphism.

#### Method Overriding
**Method overriding** is when a method in a child class has the same method signature as a method in the parent class, but with a different implementation. Thus, child classes can change the default behavior given by a parent's method. Overriding methods makes class hierarchies more flexible and dynamic. Let's change our `Dog` class we used before and have it override the `speak` method from `Animal`:
```java
public class Dog extends Animal {
  public static void main(String[] args){ 
    Animal d = new Dog();
	d.speak(); // Woof!
  }
  
  public void speak() {
    System.out.println("Woof!");
  }
}
```

When we declare the reference variable `d`, it uses the class `Animal` as its type but refers to an actual *instance* of a `Dog` in memory. So we can call the `speak` method declared in `Animal`, but since `d` refers to a `Dog` object, it will use that `Dog`'s implementation of `speak`. This is referred to as **virtual method invocation** and is key to method overriding. The `Animal` class (if it is abstract) does not even need to define any implementation for `speak`, since the method to be executed will be determined at runtime depending on the object referred to in memory. This is the reason why method overriding is classified as **runtime** - or **dynamic** - polymorphism.

One more item to note with method overriding is that `static` methods cannot be overriden. Instead, if a subclass implements the same `static` method as its parent, the method is hidden. **Method hiding** replaces the parent method in the calls defined in the child class.

#### Covariant return types
When overriding a method, we also have the option of changing the return type - _provided that the overriden return type **is a subtype of the original type**_. This is called **covariant return types**. We can also choose to change the access modifier of an overriden method - _provided that the new modifier for the overriding method provides **more, not less, access** than the overriden method_. An example is below:
```java
public class Thing {}
public class SpecificThing extends Thing {}

public class Foo {
  protected Thing get() {
    return new Thing();
  }
}

public class Bar extends Foo {
  public SpecificThing get() {
    return new SpecificThing();
  }
}
```

### Encapsulation
Finally, **encapsulation** is the OOP principle of containing related state and behavior together inside a class, and also hiding and preventing change to an object's data members. When an object is encapsulated, it controls the access to its internal state. This prevents arbitrary external interference, which could bring the object into an invalid or inconsistent state.

In Java, encapsulation is achieved through declaring data members as `private`, with public "getter" and "setter" methods.

```java
public class Person {
  private int age;
  
  public int getAge() {
    return this.age;
  }
  
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
	}
  }
}
```

In the `Person` class above, we prevent anything outside the class from changing the `age` of the person. We allow access to the field through the `getAge()` method, and we allow manipulation of the field through the `setAge()` method. Note that inside setter methods we can and should perform validation, like we do above - checking that the input number is a valid age (greater than 0).

## SOLID
There are another set of design principles that are important for OOP languages and programs, which are defined by the acronym SOLID:
* **S**ingle responsibility principle
* **O**pen-closed principle
* **L**iskov substitution principle
* **I**nterface segregation principle
* **D**ependency inversion principle

### Single Responsibility Principle
This principle, articulated by Robert Martin, says that

> A class should have only a single responsibility, that is, only changes to one part of the software's specification should be able to affect the specification of the class.

This means that a class has a specific purpose, is responsible for one single piece of functionality, and should have only one "reason to change". This principle relates to encapsulation in that only fields and methods related to the "single responsibility" should be contained in the class.

### Open-closed Principle
This principle states

> Software entities should be open for extension, but closed for modification.

This means that entities like classes should be able to have its behavior extended without modifying the class itself. This is primarily accomplished through inheritance - allowing child classes to add onto the functionality of a base class.

### Listkov Substitution Principle
This principle was articulated by Barbara Liskov and is paraphrased as:

> Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program. 

We've already seen how important this is with polymorphism and abstraction - substituting a `Cat` for a `Dog` in our program should be straightforward, if both extend from the `Animal` class and our program uses the methods defined there.

### Interface Segregation Principle
This principle states that

> Many client-specific interfaces are better than one general-purpose interface.

This prevents clients from having to depend on methods they do not use. Breaking up our interfaces into smaller, more specific ones decouples our code and makes refactoring easier.

### Dependency Inversion Principle
Put succintly,

> One should depend upon abstractions, not concretions.

In other words, instead of having concrete dependencies in our classes, we should instead depend on abstractions like interfaces. This makes our code more loosely coupled and adds a layer of abstraction which increases the re-usability of higher-level modules. 
# Module - Java Exceptions

## Exceptions
When an exceptional condition occurs in the course of a Java program, a special class called an `Exception` can be **thrown**, which indicates that something went wrong during the execution of the program. If the exception is not handled anywhere in the program, it will propagate up through the call stack until it is handled by the JVM which then terminates the program.

### Exception Class Hierarchy
![Exceptions hierarchy](https://i.pinimg.com/originals/a6/ab/f3/a6abf35c5fbbb57ebd4e949945839f31.jpg)

The exception class hierarchy starts with the `Throwable` class which inherits from `Object`. Any object which is a `Throwable` can be "thrown" in a program by the JVM or by the programmer using the `throws` keyword. The `Exception` and `Error` classes both extend `Throwable`. An `Error` represents something that went so horribly wrong with your application that you should not attempt to recover from. Some examples of errors are:
* `ExceptionInInitializerError`
* `OutOfMemoryError`
* `StackOverflowError`

`Exception` is a general exception class which provides an abstraction for all exceptions. There are many subclasses of `Exception`, as shown above.

#### Unchecked vs Checked Exceptions
The `Exception` class and all of its subclasses, except for `RuntimeException`, are known as "checked exceptions". These represent occasions where it is reasonable to anticipate an unexpected condition, like a file not existing when attempting to write to it (which would result in a `FileNotFoundException`). **Checked exceptions are required to be handled or declared by the programmer** - otherwise, the code will not compile.

`RuntimeException` is a special type of exception - it, and all of its subclasses - are known as "unchecked exceptions". An **unchecked exception** is an exception that **is not required to be handled or declared** like checked exceptions are. Some examples include:
* `ArithmeticException` for illegal math operations
* `IndexOutOfBoundsException` for if you reference an index that is greater than the length of an array
* `NullPointerException` for if you attempt to perform an operation on a reference variable that points to a `null` value

#### Handling / Declaring Exceptions
When risky code is written that has the possibility of throwing an exception, it can be dealt with in one of two ways:
1. Handling means that the risky code is placed inside a try/catch block
2. Declaring means that the type of exception to be thrown is listed in the method signature with the `throws` keyword. This is also called "ducking" the exception - you let the code which calls the method deal with it.

## `try/catch/finally` Blocks
In order to handle exceptions that could be thrown in our application, a `try/catch` block can be used. The `try` block encloses the code that may throw an exception, and the `catch` block defines an exception to catch and then runs the code inside only if that type of exception is thrown. We can optionally include a `finally` block which will run whether an exception is thrown or not. A simple example is shown below:
```java
try {
  object.someRiskyMethodCall();
} catch(Exception e) {
  System.out.println("phew! that was close!");
} finally {
  System.out.println("I'll run whether there was a problem or not!");
}
```

### `try/catch/finally` Block Rules
Catch and finally blocks have several different rules which must be followed:
* Multiple catch blocks are allowed. More specific exceptions must come before more general exception types.
* Multi-catch blocks (catching more than one exception in a given block) are allowed, exception types are separated by `||`
* The `finally` block is optional
* A `try/finally` block only IS allowed, but a `try` block by itself is not
* A `finally` block will always execute, unless of course `System.exit()` is called

## Custom Exceptions
A programmer can create custom exceptions in Java by extending any exception class. If you extend `RuntimeException`, however, you will be creating an unchecked exception. This is a good idea if you do **not** want other code to have to handle your exception being thrown. If you do always want to require your exception to be handled, then create a checked exception by extending any existing one, or the `Exception` class itself.

```java
public class MyCheckedException extends Exception {}
public class MyUncheckedException extends RuntimeException {}

public class ExceptionThrower {

  public static void main(String[] args) {
    try {
	  throw new MyCheckedException("uh oh");
	} catch(MyCheckedException e) {} // we're just ignoring it here
	
    if ( 100 > 1) {
	  throw new MyUncheckedException("you're not required to handle me!");
	}
  }
  
  public static void declareChecked() throws MyCheckedException {
    throw new MyCheckedException("this one is declared!");
  }
}
``` 
# Module - JUnit

Writing application code is just one aspect of application development. How do we ensure that code we write works as we intend it to, without negative side-effects, and meets our functional and non-functional product requirements? The answer is to *test* the code we wrote.

## Introduction to Testing

Testing is a very broad term and encompasses many different strategies, levels, and techniques. You've probably done **manual testing** before simply by running your application code, providing some user input, and observing the resulting behavior of the system and noting any deviations from expectations. This kind of testing is effective in certain scenarios, but it doesn't scale well when you need to test the functionality of an application with 100s, 1000s, or 10s of thousands of lines of code, and be able to do so repeatedly in timely fashion.

To effectively test a non-trivial application, we can actually write test code which will test the functionality of our application code. When we are testing the smallest individual components of the application in isolation from other parts of the system, this is called **unit testing**.

## Unit Testing
Unit testing is the testing of individual software components in isolation from the rest of the system. This is done by writing unit tests which execute the code we want to inspect. When the code under test deviates from an expected outcome or behavior, the test will fail. If a test passes, it means the application performs as expected (unless there is a problem with the test itself). In Java, the most common unit testing framework is called JUnit.

## JUnit
JUnit is a Java framework for unit testing. JUnit has several annotations within the `org.junit` package that developers can use to create tests and setup test environments:
* `@Test` - declares a method as a test method
* `@BeforeClass` - declares a setup method that runs once, before all other methods in the class
* `@Before` - declares a setup method that runs before each test method
* `@After` - declares a tear-down method that runs before each test method
* `@AfterClass` - declares a tear-down method that runs once, after all other methods in the class

When writing a test method, JUnit helps us check the functionality of the code being tested by providing static `Assert` methods, of which there are many. A few include:
* `assertTrue()`
* `assertFalse()`
* `assertEquals()`
* `assertNotEquals()`
* `assertThat()`

Assertions verify that the state of the application meets what is expected. For example, to test a simple addition method:

```java
@Test
public void additionTest() {
  Assert.assertEquals(4, Calculator.addNumbers(2,2));
}
```

If the `.addNumbers()` method returns anything other than `4`, the test will fail. This will alert us that something is wrong in the logic of the method and we can then debug the issue. When we think we've fixed the problem, just run the test again and check that it passes.

**Note:** to avoid needing to reference `Assert` every time, we can use a `static import org.junit.Assert.*;` statement to import all `static` members of the `Assert` class.

### Ignoring Tests

To prevent a test from running, use the `@Ignore` annotation. Use this sparingly, however, because ignoring valid tests only means that you are pretending a problem does not exist. If tests are constantly ignored, you will have no guarantee that the application functionality has not regressed.

### Testing Best Practices
When it comes to testing code, a few best practices to follow include:
* [Utilize dependency injection](https://en.wikipedia.org/wiki/Dependency_injection)
* [Write testable code](https://www.toptal.com/qa/how-to-write-testable-code-and-why-it-matters)
* Use a mocking library like [Mockito](https://site.mockito.org/) for dependencies
* Measure your code coverage with a tool like [Jacoco](https://www.eclemma.org/jacoco/trunk/doc/maven.html)
* Externalize test data when possible (i.e. read in the test data from an external file or generate it dynamically)
* Generally, you want to use **only 1 assert statement per test** - this ensures you can pinpoint the defect when debugging
* Write deterministic tests (they shouldn't fail sometimes and pass other times - otherwise known as "flaky" tests)

## TDD
When developing software, it is important to ensure that most if not all of the code being written is tested to verify the functionality of the code. One way to ensure this is to follow a process called **test-driven development**, or TDD.

### TDD Process
The TDD process consists of writing unit tests first, **before** the application code has been written. Then, code can be written to make the test pass and the process can be completed for each piece of functionality required. Thus, the process is:
1. Write a unit test
2. Run the test => test will fail
3. Fix the test by writing application code
4. Retest until the test passes
5. Repeat

Following the TDD process can be useful for ensuring that a valid unit tests always exists for any class or method that is written. Later, when refactoring code, the unit tests give us confidence that we can change the source code without breaking existing functionality. If we mess up somewhere, when the unit tests are run we can pinpoint exactly where the problem lies. This makes debugging much easier.
 
# Module - Java File I/O

## File I/O
"I/O" refers to the nature of how data is accessed, either by reading it from a resource (input) or writing it to a resource (output). In Java, File I/O objects fall into one of two categories:
* `Streams` are for reading or writing **bytes**
* `Reader/Writer` are for reading or writing **characters**

Some Common File I/O classes are
* `FileInputStream` - reads raw bytes from a file
* `FileOutputStream` - writes raw bytes to a file
* `FileReader` - reads characters from a file
* `FileWriter` - writes characters to a file
* `BufferedReader` - reads a file line by line, needs an instance of a `FileReader` with a path to the resource to be read in the constructor
* `BufferedWriter` - writes to a file line by line, needs an instance of a `FileWriter` with a path to the destination file in the constructor
* `Scanner` - can read from an `InputStream`, useful methods for character reading

Character files are read line by line, either until a carriage return (`\r`) or a newline (`\n`), depending on your operating system. When using I/O classes to read and write, you should **always close your resources** with the `.close()` method. This prevents exceptions from being thrown later, memory leaks, and system overutilization of unused resources.

### Reading User Input from Console
The `Scanner` class can be used to read user input from the command line:

```java
Scanner sc = new Scanner(System.in);
while (true) {
  String input = sc.readLine();
  System.out.println("Your input: " + input);
}
```

When the code above is run, the program acts to "echo" back any input given from `stdin`.

## Serialization
Serialization is the process of writing the state of an object to a byte stream; the reverse is called deserialization. In order for an object to be serialized, it must implement the `Serializable` interface.

### Marker Interfaces
`Serializable` is a **marker interface**, which is an interface with no methods. The point of such an interface is to *provide metadata* to the compiler - in this case, it tells the compiler that this class can be serialized.

### Serializing an object
To serialize an Object, you need a `FileOutputStream` instance inside the constructor of an `ObjectOutputStream`, passing in the file path of where you want the Object to be serialized
* Call the `ObjectOutputStream.writeObject(yourObject)` method

### Deserializing an object
To deserialize an Object, you need a `FileInputStream` instance inside the constructor of an `ObjectInputStream`, passing in the file path of where the serialized object is
* Call the `ObjectInputStream.readObject()` method, casting it to a bean of your type
 
# Module - Java Collections

## Collections Framework
The Collections framework in Java is a set of classes and interfaces that implement commonly used data structures. A collection is a single object which acts as a container for other objects. The Collections API is organized in a class hierarchy shown in simplified version below:

![Collection API class hierarchy](https://javaconceptoftheday.com/wp-content/uploads/2014/11/CollectionHierarchy.png)

The important interfaces in the Collections API are:
* `Iterable` - guarantees the collection can be iterated over
* `List` - an ordered collection
* `Set` - a collection does not contain duplicates
* `Queue` - a collection that operates on a first-in-first-out (FIFO) basis
* `Map` - contains key/value pairs. Does not extend `Iterable`.

## Iterable and Iterator
The `Iterable` interface defines a data structure which can be directly traversed using the `.iterator()` method, which returns an `Iterator`. This can be useful for fine-grained control over iteration. The `Iterator` interface contains methods for traversal, including:
* `hasNext()`
* `next()`
* `remove()`

For example:

```java
Set<String> names = new ArrayList<>();
// add names...
Iterator<String> it = names.iterator();
while (it.hasNext()) {
  String name = it.next();
  doSomething(name);
}
```

### Enhanced For Loop
Any object which implements the `Iterable` interface can also be iterated over using a special kind of `for`-loop: the "enhanced" for loop. The syntax is as follows:
```java
Set<String> names = new ArrayList<>();
// add names...
for (String name : names) {
  System.out.println(name);
}
```

The downside of the enhanced for loop is that the index of iteration is not tracked, so fine-grain control over execution is not possible. However, this simplified syntax is beneficial for many simple iterations.

## Generics
Generics are constructs introduced in Java 5 which enforce compile time safety by allowing you to use parameterized types. They are covered here because the are frequently and heavily used with collections. Generics can be declared on a class (generic types), method parameters (generic methods), or return types.

Before Java 5, you had to write something like this and hope other developers understood to only put Strings inside: 
```
List names = new ArrayList();
names.add("Alice"); // good use
name.add(new Object()); // uh oh - we want to prevent this from happening
```

With generics, you can restrict a class to only accept objects of a given type and the compiler will prevent you from using any other type:
```
List<String> names = new ArrayList<>(); // using a List of Strings only
names.add("Alice"); // nice!
names.add(new Object()); // now we get a compilation error to stop this - generics save the day!
```

### Generic Classes
To make a class (or interface) generic, use the angle brackets when declaring it, and use an arbitrary "generic type" which is determined by the invoking code. The generic type can then be reused throughout the class to enforce type safety.

```java
public class MyGenericClass<T> {
  private T instance;
  
  // simple generic setter method
  public void setObject(T object) {
    this.instance = object;
  }
}
```

### Naming Convention for Generics
Technically, type parameters can be named anything you want. The convention is to use single, uppercase letters to make it obvious that they are not real class names.
* E => Element
* K => Map Key
* V => Map Value
* N => Number
* T => Generic data type
* S, U, V, and so on => For multiple generic data types

## List Interface
A `List` is a collection that is ordered and preserves the order in which elements are inserted into the list. Contrary to sets, duplicate entries are allowed. Also, elements are accessed by their index, which begins with 0 for the first element in the list.

### ArrayList
An `ArrayList` is a concrete class which implements `List`. It is a data structure which contains an array within it, but can resize dynamically. Once it reaches maximum capacity, an `ArrayList` will increase its size by 50% by copying its elements to a new (internal) array. Traversal is fast (constant time) because elements can be randomly accessed via index, just like an array. Insertion or removal of elements is slow, however (linear time, since there is a risk of having to resize the underlying array).

### LinkedList
A `LinkedList` implements both the `List` and `Queue` interfaces, so it has all methods in both interfaces. The data structure is composed of nodes internally, each with a reference to the previous node and the next node - i.e. a doubly-linked list. Because of this structure, insertion or removal of elements is fast (no risk to resize, just change the nearest references), but traversal is slow for an arbitrary index.

### Vector
`Vector` is an older class which implements `List` - it is essentially a thread-safe implementation of an `ArrayList`.

### Stack
`Stack` is an older implementation of the stack data structure (last-in-first-out, or LIFO). Generally you should use an `ArrayDeque` for implementing a stack.

## Set Interface
`Set` is an interface which defines a data structure which:
* is NOT index driven
* only allows unique elements
* generally DOES NOT preserve the order in which elements were inserted

### HashSet
A `HashSet` implements `Set` and is backed by a `HashMap`. It:
* Guarantees no ordering when iterating
* Allows one `null` value
* Allows fast insertion and traversal
* Does not maintain order in which you insert elements

### TreeSet
A `TreeSet` is a `Set` whose elements maintain sorted order when inserted. Internally, it is backed by a Sorted Tree. Insertion and removal of elements is slow, because the elements must maintain sorted order. It cannot contain any `null` values, since `null` cannot be compared to any object.

## Queue Interface
A `Queue` is a data structure used when elements should be added and removed in a specific order. Unless specified, elements are ordered FIFO (first-in-first-out). Some useful methods declared are:
* `offer()`
* `peek()`
* `poll()`

### ArrayDeque
Pronounced as 'array-deck', this concrete class can be implemented for either the queue or stack data structure. It is an implementation of a pure double-ended queue (elements can be added or removed from either end of the queue). An `ArrayDeque` stores elements in a resizable array internally, and it has a few extra useful methods defined:
* `pop()`
* `push()`
* `peekFirst()`
* `peekLast()`
* `pollFirst()`
* `pollLast()`
* `offerFirst()`
* `offerLast()`

| Operation | Throws Exception | Returns null |
| --------- | ---------------- | ------------ |
| Insert    | `boolean add(E e)`|`boolean offer(E e)`|
| Remove    | `E remove()` | `E poll()` |
| Examine   | `E element()`| `E peek()`|

## Map Interface
Map does not implement the Collection interface, however it is considered to be part of the Collections framework. It is used to identify a value by a key, and each entry in a map is a key-value pair. Because it does not implement `Iterable`, Maps cannot be iterated over directly. Instead, one must either:
* use the `entrySet()` method to iterate over the set of `Map.Entry`
* use the `keySet()` method to iterate over the set of keys
* use the `values()` method to return a `Collection` of values which can then be iterated over

### HashMap
`HashMap` is a Map which:
* Stores elements in key-value pairs
* Insertion/Retrieval of element by key is fast
* Tradeoff is that it does not maintain the order of insertion
* Permits one null key and null values

### TreeMap
`TreeMap` is a Map whose:
* Keys are stored in a Sorted Tree structure
* Main benefit is that keys are always in a sorted order
* Insertion/Retrieval are slow
* Cannot contain null keys as null cannot be compared for sorting

### HashTable
`HashTable` is an older, thread-safe implementation of a `HashMap`. It does not allow null keys or null values.

## Collections Class
The [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) class - not to be confused with the Collection interface - defines many `static` helper methods which operate on any given collection. Use this class for help with sorting, searching, reversing, or performing other operations on collections.

## Comparable and Comparator Interfaces
[`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) is an interface which defines the natural ordering for a class. A class must implement `Comparable` if it is to be sorted by the `compareTo()` method.
```java
public interface Comparable<T> {
	public int compareTo(T o);
}
```

The `compareTo()` method returns an `int` which is:
* Zero, if the two objects are equal
* Negative, if this object is smaller than that
* Positive, if this object is greater than that

[`Comparator`](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html) is an interface which allows you to define a total ordering on some collection of objects. A class that is to be sorted by `compare()` does not have to implement `Comparator`.
```java
public interface Comparator<T> {
	public int compare(T firstObject, T secondObject);
}
``` 
# Module - Java Threads

## Intro to Concurrency
**Concurrency** refers to breaking up a task or piece of computation into different parts that can be executed independently, out of order, or in partial order without affecting the final outcome. One way - but not the only way - of achieving concurrency is by using multiple threads in the same program.

Operating systems use concurrency to manage the many different programs that run on them. The GUI - graphical user interface - for example, is run at the same time as other processes. Without this, any process that took too long in the background, like reading / writing to files or making an HTTP request, would block the GUI and prevent any other user input.

### Multi-core Processing
Most computers these days have multiple cores or CPUs, which means that calculations at the hardware level can be done in parallel. Without multiple cores, operating systems can still achieve concurrency with a process called **time splicing** - this means running one process for a short time, then switching to another, and back very rapidly. This ensures that no process or application is completely blocked.

On multi-core systems, different processes can be run on different CPUs entirely. This enables true parallelization and is a key benefit of writing multithreaded programs.

## Introduction to Threads
A thread is a subset of a process that is also an independent sequence of execution, but threads of the main process run in the same memory space, managed independently by a scheduler. So, we can think of a thread as a "path of execution", but they can access the same objects in memory.

Every thread that is created in a program is given its own call stack, where it stores local variables references. However, all threads share the same heap, where the objects live in memory. Thus, two threads could have separate variable references on two different stacks that still point to the same object in the heap.

### Multithreading
Multithreading extends the idea of multitasking into applications where you can subdivide operations in a single application into individual, parallel threads. Each thread can have its own task that it performs. The OS divides processing time not just with applications, but between threads. Multi-core processors can actually run multiple different processes and threads concurrently, enabling true parallelization.

In Java, multithreading is achieved via the [`Thread`](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html) class and/or the [`Runnable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) interface.

#### A Note on Best Practices
In general, it is best to avoid implementing multithreading yourself if possible. The benefit of multithreaded applications is better performance due to non-blocking execution. However, you should always measure or attempt to estimate the performance benefit you will get by using threads versus the tradeoff in complexity and subtle bugs that might be generated. Usually there are frameworks, tools, or libraries that have implemented the problem you are trying to solve, and you can leverage those instead of trying to build your own solution. For example, web servers like Apache Tomcat have multithreading built-in and provide APIs for dealing with network requests without having to worry about threads.

### Thread methods
A few important methods in the `Thread` class include:
* getters and setters for id, name, and priority
* `interrupt()` to explicitly interrupt the thread
* `isAlive()`, `isInterrupted()` and `isDaemon()` to test the state of the thread
* `join()` to wait for the thread to finish execution
* `start()` to actually begin thread execution after instantiation

A few important `static` methods are also defined:
* `Thread.currentThread()` which returns the thread that is currently executing
* `Thread.sleep(long millis)` which causes the currently executing thread to temporarily stop for a specified number of milliseconds

### Lifecycle of a Thread
At any given time, a thread can be in one of these states:
1. **New**: newly created thread that has not started executing
2. **Runnable**: either running or ready for execution but waiting for its resource allocation
3. **Blocked**: waiting to acquire a monitor lock to enter or re-enter a synchronized block/method
4. **Waiting**: waiting for some other thread to perform an action without any time limit
5. **Timed_Waiting**: waiting for some other thread to perform a specific action for a specified time period
6. **Terminated**: has completed its execution

![Thread lifecycle](https://www.javatpoint.com/images/thread-life-cycle.png)

### Thread Priorities
Priorities signify which order threads are to be run. The Thread class contains a few `static` variables for priority:
* MIN_PRIORITY = 1
* NORM_PRIORITY = 5, default
* MAX_PRIORITY = 10

### Creating Threads
There are two options to create and execute a `Thread` in Java:
1. Create a class that implements the `Runnable` functional interface
* implement the `run()` method
* pass an instance of your class to a `Thread` constructor
* call the `start()` method on the thread
	
```java
	public class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Inside the MyRunnable class");
		}
	}
```

2. Create a class that extends `Thread`
* implement the `run()` method
* instantiate your class
* call the `start()` method
	
```java
	public class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("Inside the MyThread class");
		}
	}
```

```java
	public class ThreadDemo {
		public static void main(String[] args) {
			Thread myRunnable = new Thread(new MyRunnable());
			Thread myThread = new MyThread();
			myRunnable.start();
			myThread.start();
		}
	}
```

### Runnable and Lambda Expressions
Because `Runnable` is a *functional* interface, we can use a lambda expression to define thread behavior inline instead of implementing the interface in a separate class. We pass a lambda expression as the `Runnable` type required in the `Thread` constructor. For example:

```java
public class ThreadLambda {
  public static main(String[] args) {
    Thread willRun = new Thread(() -> {
	  System.out.println("Running!");
	});
	willRun.start();
  }
}
```

## Deadlock
The term "deadlock" describes a situation where 2 or more threads are blocked trying to access the same resource, waiting for the other. Neither thread can continue execution, so the program halts indefinitely.

### `synchronized` keyword
In a multithreaded environment, a race condition occurs when 2 or more threads attempt to access the same resource. Using the `synchronized` keyword on a piece of logic enforces that only one thread can access the resource at any given time. `synchronized` blocks or methods can be created using the keyword. Also, one way a class can be "thread-safe" is if all of its methods are `synchronized`.

## Producer-Consumer Problem

TODO
 
 
# Module - Design Patterns

This module covers all the topics defined [here](./README.md).

## Design Patterns
Design patterns are established general solutions to commonly occuring software development problems. They can be broadly categorized into:
* Creational
* Structural
* Behavioral

## Singleton Pattern
A Singleton is a design pattern which allows the creation of an object in memory only once in an application and can be shared across multiple classes. It can be useful for services in an application, or other resources like a connection or thread pool.

To make a class into a Singleton, use:
1. `private static` variable of the class' type
2. `private` constructor - to prevent arbitrary object creation
3. `public static getInstance()` method, which will either instantiate the object or return the instance in memory
```java
    public class Singleton {
        // Private static variable of the class' type
        private static Singleton instance;

        // Private Constructor
        private Singleton() {}

        // Public static getInstance method
        public static Singleton getInstance() {
            if (instance == null) 
                instance = new Singleton();
            return instance;
        }
    }
```

## Factory Pattern
Factory is a design pattern which creates objects in which the precise type may not be known until runtime. To make a factory, use:
1. Abstract data type
2. Classes that inherit the abstract data type (the objects whose instantiation details may not be known until runtime)
3. Static method that returns a concrete instance, whose return type is the abstract data type in (1)
```java
    // Abstract Data Type
    public interface Dessert {}

    // Classes that inherit the abstract data type
    public class Cake implements Dessert {}

    public class Cookie implements Dessert {}

    public class IceCream implements Dessert {}

    // Good practice to throw an exception if the desired concrete instance is not found
    public class DessertNotFoundException extends RuntimeException {}

    // Factory class that returns the concrete instance
    public class DessertFactory {
        public static Dessert getDessert(String dessertType) {
            switch(dessertType) {
                case "cake":
                    return new Cake();
                case "cookie":
                    return new Cookie();
                case "ice cream":
                    return new IceCream();
                default:
                    throw new DessertNotFoundException(dessertType + " not found!");
            }
        }

        public class Demo {
            public static void main(String[] args) {
                Dessert d1 = DessertFactory.getDessert("cake");
                Dessert d2 = DessertFactory.getDessert("cookie");
                Dessert d3 = DessertFactory.getDessert("ice cream");
                Dessert d4 = DessertFactory.getDessert("candy");    // Throws DessertNotFoundException
            }
        }
    }
```

## Dependency Injection
Another important design pattern which is widely used in frameworks across many languages is [**dependency injection**](https://en.wikipedia.org/wiki/Dependency_injection#Setter_injection) (DI), which is one form of a broader concept called [**inversion of control**](https://en.wikipedia.org/wiki/Inversion_of_control) (IOC). DI means that the *dependencies* of a class or object are *declared by the class and then injected* from its context instead of instantiating and relying directly on it.

There are several ways to inject dependencies:
1. [Constructor injection](https://en.wikipedia.org/wiki/Dependency_injection#Constructor_injection)
2. [Setter injection](https://en.wikipedia.org/wiki/Dependency_injection#Setter_injection)
3. [Interface injection](https://en.wikipedia.org/wiki/Dependency_injection#Interface_injection)

We'll show an example of constructor injection with two classes. If class `Foo` depends on a class `Bar`, the `Foo` class would NOT directly instantiate a `Bar` object. Instead, it would declare an instance variable of type `Bar` and have it injected. The code which uses `Foo` is then responsible for **injecting** an instance of `Bar` for `Foo` to use.

#### Before DI
```java
public class Foo {
  public void useBar() {
    Bar b = new Bar();
	b.doSomething();
  }
}
```

#### After DI
```java
public class Foo {
  Bar b;
  
  public Foo(Bar b) {
    this.b = b;
  }
  
  public void useBar() {
    b.doSomething();
  }
}

public class FooDriver {
  public static void main(String[] args) {
    Bar b = new Bar();
	Foo f = new Foo(b);
	f.useBar();
  }
}
```

### Benefits of DI
Dependency injection has many benefits, including:
* decoupling of code
* independent development - coding to interfaces allows concurrent development
* abstraction - no need to rely on concrete implementation
* easier to test - allows creation of stubs and mocks
* configuration can be externalized 
# Module - Log4j

Log4j is a reliable, fast, and flexible logging framework for Java supported by Apache. It's commonly used to record application events, log granular debugging information for developers, and write exception events to files.

## Why do we need logging?
Logging records events that occur during software execution. As users execute programs on the client side, the system accumulates log entries for support teams. In general, it allows for developers to access information about applications to which we do not have direct access. Without logs, we would have no idea of knowing what went wrong when an application crashes, or track and monitor application performance.

Also, a logging framework like Log4j is critical because it allows us to use various logging levels and configure a threshold to determine which messages will be recorded in the application log files.

## Log4j Usage
Log4j has a simple class architecture as shown below:

![log4j classes](https://logging.apache.org/log4j/2.x/images/Log4jClasses.jpg)

The main components of the hierarchy are:
* `Logger` - logs the messages
* `Appender` - publishes logs to destination(s)
* `Layout` - formats logging information
* `Configuration` - stores settings
* `Filter` - used to filter out logs that do not meet the threshold

### Log4j Logging Levels
Below are the Log4j log levels, in order of least to most restrictive:
1. **ALL** => all levels
2. **DEBUG** => designates fine-grained informational events that are most useful to debug an application
3. **INFO** => informational messages that highlight the progress of the application at the coarse grained level
4. **WARN** => designates potentially harmful situations
5. **ERROR** => designates error events that might still allow the application to continue running
6. **FATAL** => severe error events that presumably lead the application to abort
7. **OFF** => highest possible level, intended to turn off logging

### How do logging levels work?
A log request of level *x* in a logger with level *y* is enabled with *x >= y*. For the standard levels, we have that 
    ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF

### Configuration
Log4j (specifically Log4j2) can be configured using XML, JSON, YML, or Properties files, as described in [their documentation](https://logging.apache.org/log4j/2.x/manual/configuration.html).

### Simple Example
To use Log4j2, first include the library as a dependency. If you're using Maven, simply add the following to your `pom.xml` file:
```xml
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.11.2</version>
</dependency>
```

Assuming you've setup some configuration file, you can go ahead and use loggers in your code:

```java
public class Foo {
  private static Logger log = LogManager.getLogger(Foo.class);
  
  public static void main(String[] args) {
    log.info("Hello world!");
	log.warn("Uh oh");
	log.error("This is not good!");
  }
  
}
``` 
# Module - Maven

[Maven](https://maven.apache.org/) is a dependency manager and build automation tool for Java programs. Maven project configuration and dependencies are handled via the Project Object Model, defined in the `pom.xml` file. This file contains information about the project used to build the project, including project dependencies and plugins.

Maven identifies projects through **project coordinates** defined in the `pom.xml` file - these are:
* `group-id` - for example: "com.revature"
* `artifact-id` - for example: "myproject"
* `version` - for example: "0.0.1-SNAPSHOT"

Together, these uniquely identify a specific version of a program.

Some other important tags within the `pom.xml` file include:
* `<project>` - this is the root tag of the file
* `<modelVersion>` - defining which version of the page object model to be used
* `<name>` - name of the project
* `<properties>` - project-specific settings
* `<dependencies>` - this is where you put your Java dependencies you want to use. Each one needs a `<dependency>`, which has:
  * `<groupId>`
  * `<artifactId>`
  * `<version>`
* `<plugins>` - for 3rd party plugins that work with Maven

When Maven "builds" a Java project, it must first search for any dependencies declared in the `pom.xml` file. Maven dependencies are stored both locally and in a central repository. The local repository is in the `$HOME/.m2/repository` folder (can be changed in `$MAVEN_HOME/conf/settings.xml`), while the central repository is accessible at https://mvnrepository.com. If Maven cannot find a given dependency locally, it searches the central repository for the artifact and then downloads it to the local repository.

A Maven "build" means to take the project source code, along with any dependencies like libraries or frameworks, compile it, and bundle it all together into an artifact - this could be a `.war` file, a `.jar` file, or an `.ear` file. WAR stands for "web archive", JAR stands for "Java archive", and EAR stands for "Enterprise Application archive". This artifact can then be either directly run or deployed onto a web container (in the case of a web application).

## Maven Build Lifecycle
When Maven builds your project, it goes through several steps called **phases**. The default maven build lifecycle goes through the following phases:
1. Validate => project is correct and all necessary information is available 
2. Compile => compiles project source code 
3. Test => tests all compiled code 
4. Package => packages all compiled code to WAR/JAR file 
5. Integration => performs all integration tests on WAR/JAR
6. Verify => runs checks on the results of integration tests 
7. Install => installs WAR/JAR to local repository 
8. Deploy => copies final WAR/JAR to the remote repository 

Each phase in turn is composed of plugin goals that are bound to zero or more build phases. A "goal" represents a specific task which contributes to the building or managing of the project.

For more information, see the [Maven documentation](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html).

## Using the `mvn` command

To use the Maven CLI (command-line interface), first test that you have Maven installed:
```
mvn --version
```

Now, once you are in your project directory, you can run any phase in the default build lifecycle. Maven will look for the `pom.xml` file and use that to run the phase.

```
cd /path/to/myproject/
mvn package
```

To execute a specific Maven goal, use the `plugin:goal` syntax:

```
mvn dependency:copy-dependencies
```

Multiple phases or goals can be run sequentially. Again, see the Maven documentation for more information. 
# Module - Advanced Java

These notes cover topics defined [here](./README.md).

## Generics - Advanced
When using generics, sometimes you don't want to specify a specific type or concrete class - you may want your class to be able to accept a range of type parameters. To do this, you'll use a wildcard character, represented by a question mark `?`. The [Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html) on wildcards provides examples of how to use wildcards, along with upper and lower-bounded wildcards.

## Java 7 Features
Java 7 was released in 2011 and contains several new features that help speed development.

### `try-with-resources`
When using `try/catch` blocks, often times some object used in the code is a resource that should be closed after it is no longer needed to prevent memory leaks - for example a `FileReader`, `InputStream`, or a JDBC `Connection` object. With Java 7, we can use a `try-with-resources` block which will automatically close the resource for us:

#### Old way
```java
try {
  InputStream is = new FileInputStream("./some/file.ext");
  String s = is.read();
} catch(IOException e) {
} finally {
  is.close();
}
```

#### New way
```java
try(InputStream is = new FileInputStream("./some/file.ext")) {
  String s = is.read();
} catch(IOException e) {}
```

Whatever is placed within the parenthesis of the `try` statement will be closed automatically - thus, we don't need to explicitly call it within our `finally` block above. This new format requires the object in the `try` statement to **implement the [AutoCloseable](https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html) interface**.

### Diamond operator
Another nifty feature of Java 7 is the diamond operator - `&lt;&gt;`. To demonstrate, let's look at a line of Java code:

```java
List<String> strings = new ArrayList<String>();
```

In this one line, we've repeated the type information for the `List` in two places - on the left and right side of the assignment operation. The diamond operator simplifies this syntax by allowing the compiler to *infer* the type of the `List` from the left-hand side. The new syntax is:

```java
List<String> strings = new ArrayList<>(); // cool! less verbose
```

## Java 8 Features
Java 8 was released in 2014 and is one of the biggest updates to the language. It contains many new features that overhaul the way Java developers can write code.

### Date and Time API
Before Java 8, dates and times were represented using the `java.util.Date` and `java.util.Calendar` classes. There were several issues with these APIs, including lack of thread safety, timezones, and ease of use. Java 8 introduced a new API through the `java.time` package, which includes:
* `LocalDate` - only contains date information
* `LocalTime` - only contains time information
* `LocalDateTime` - contains a date and time
* `ZonedDateTime` - for working with time zones
* `Period` - represents a quantity of time (years, months, days)
* `Duration` - represents quantity of time (seconds, nanoseconds)
* `DateTimeFormatter` - for representing dates/times in a given format

More detailed explanations of the new Date and Time API is given in the [Javadocs](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html).

### Lambda Expressions
Lambda expressions are one of the biggest new features of Java 8, and they introduce some important aspects of **functional programming** to Java. The most basic syntax of a lambda expression is:

```java
parameter(s) -> expression
```

For example, we can use the `.forEach` method of the `Iterable` interface, which accepts a lambda expression as its argument:

```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
names.forEach(str -> System.out.println(str));
```

This will print out the names just as if we had used a `for` loop. The lambda syntax could also be done with an explicit type declaration for the parameter, but the compiler can infer the type from the value used. For multiple parameters, parentheses are required around them. Also, curly braces are optional for single statements but required for multiple. Finally, the `return` keyword is also optional for a single expression because the value will be returned by default.

#### `.forEach()` method
The `forEach()` method actually accepts what is called a functional interface as its parameter (specifically a `Consumer`), which the lambda expression then implements at runtime. The `forEach()` method then loops through `names` and passes each element to the lambda expression to be "consumed".

#### Functional Interfaces
[Functional interfaces](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) are interfaces that **have only one abstract method**. This method is what lambdas are implementing when they are declared - the parameter types and return types of the lambda must match the functional interface method declaration. The Java 8 JDK comes with many built-in functional interfaces, listed in the Javadocs link above.

We can also use functional interfaces as types to which we can assign lambda functions, like so:

```java
interface MyFunctionalInt {
  int doMath(int number);
}

public class Execute {
  public static void main(String[] args) {
    MyFunctionalInt doubleIt = n -> n * 2;
	MyFunctionalInt subtractIt = n -> n - 2;
	int result1 = doubleIt.doMath(2);
	int result2 = subtractIt.doMath(8);
	System.out.println(result1); // 4
	System.out.println(result2); // 6
  }
}
```

### Stream API
The Java 8 [Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) is a functional-style way of defining operations on a stream of elements. Streams are an abstraction which allow defining operations which do not modify the source data and are lazily executed. Streams **do not store data**, they simply define operations like filtering, mapping, or reducing, and can be combined with other operations and then executed. Some built-in `Stream`s are located in the `java.util.stream` package.

Streams are divided into *intermediate* and *terminal* operations. Intermediate streams return a new stream and are always lazy - they don't actually execute until a terminal operation is called. Terminal operations trigger the execution of the stream pipeline, which allows efficiency by perfoming all operations in a single pass over the data.

Finally, reduction operations take a sequence of elements and combine them into a single result. Stream classes have the `reduce()` and `collect()` methods for this purpose, with many built-in operations defined in the `Collectors` class.

```java
List<Student> students = new ArrayList<>();
// add students...
List<Double> grades = students.stream()
                          .filter(s -> s.isAttending())
						  .mapToDouble(s -> s.getGrade)
						  .collect(Collectors.toList());
```

### Optional Class
[The `Optional` class](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html) was introduced in Java 8 to reduce the need for excessive `null` value checking. An `Optional` is a kind of wrapper object which may or may not contain a value, with a few helper methods to handle existing or non-existent values (see Javadocs above).

Optionals are useful as replacements for `null` values when returning an "empty" response from a method. For example:

```java
public class OptionalExample {
  public Optional<String> getAmbiguousString(boolean b) {
    if (true) {
	  return Optional.of("awesome string!");
	} else {
	  return Optional.empty();
	}
  }
  
  public static void main(String[] args) {
    Optional<String> optString = getAmbiguousString(false);
	String theString = optString.orElse(""); // specify a fallback value
	System.out.println(theString);
	// we can use the String without fear of NullPointerException now
  }
}
```

### `default` and `static` methods in interfaces
Java 8 also adds new functionality to interfaces, by allowing interface methods to have implementations in some situations. By declaring a method as `default` in an interface, a "default" implementation of that method can be defined. The purpose of this is to allow additions to interfaces without breaking and having to change code in any of the classes which implement the interface. Thus, the `default` keyword allows updating existing interfaces in a way that is backwards compatible.

Methods can also now be declared as `static` in interfaces with an implementation. Since static methods belong to the interface, no overriding is necessary (or allowed, since it would simply be method hiding). `static` methods in interfaces are generally used as helper methods to assist with reusability of code.

The new features of interfaces in Java 8 bring them closer to the functionality of abstract classes, but there are still key differences. First, constructors are still not allowed in interfaces while they are in abstract classes. Secondly, interfaces allow for multiple inheritance while abstract classes cannot.

However, when two interfaces with `default` methods of the same method signature are implemented, the "diamond problem" - or multiple inheritance problem - can occur. The compiler will complain about duplicate default method inheritance, which can be resolved by overriding the default method with a custom implementation in the class. 
# Module - JDBC

JDBC stands for Java Database Connectivity. It is a relatively low-level API used to write Java code that interacts with relational databases via SQL.

## JDBC Introduction
The [JDBC classes and interfaces](https://docs.oracle.com/javase/8/docs/api/index.html?java/sql/package-summary.html) are located in the `java.sql` and `javax.sql` packages. There are several key classes and interfaces that are commonly encountered when writing JDBC code:
* `DriverManager` class - to make a connection with a database driver
* `DataSource` interface - for retrieving connections, an alternative to `DriverManager`
* `Connection` interface - represents a physical connection with a database
* `SQLException` class - a general exception thrown when something goes wrong when accessing the database
* `Statement` interface - used for executing static SQL statements
* `PreparedStatement` interface - represents pre-compiled SQL statements
* `CallableStatement` interface - used to execute stored procedures
* `ResultSet` interface - represents data returned from the database

## Creating a Database Connection
In order to interact with a database, we need to do several things:
1. Register the JDBC driver
2. Open a connection using:
  - Database URL
  - Username
  - Password
3. Execute some SQL statement using either:
  - `Statement`
  - `PreparedStatement`
  - `CallableStatement`
4. Retrieve the results that are returned in a `ResultSet` object

### Database JDBC Drivers
Because JDBC is a Java language API, it is database agnostic. It uses database drivers which implement the interfaces defined in the JDBC API for the given database. For example, to connect with an Oracle database, you would use an [OJDBC driver](https://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html). Other database vendors have different drivers which implement the JDBC API.

Many JDBC drivers are available through Maven's central repository and can be added as a dependency in the `pom.xml` file. Oracle is a special exception due to license restrictions. You must accept the licese agreement, download, and install it to your local Maven repository ([tutorial here](https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/) before you can add it to the `pom.xml` file.

Finally, in your application code, you can register the driver using:
```
try {
   Class.forName("oracle.jdbc.driver.OracleDriver");
}
catch(ClassNotFoundException e) {
   System.out.println("Can't load driver class!");
}
```

This step is only necessary for drivers prior to JDBC 4.0 (released with Java SE 6). After JDBC 4.0, drivers will be autoloaded if they are included in the classpath.

### Creating a Connection
Now we can use the `DriverManager` class to get a `Connection` to the database, given that we have the JDBC URL, username, and password. Generally these parameters should be stored in an external configuration file that can be loaded dynamically and changed without affecting the application code.

```java
try (Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD)) {
  // more code goes here
} catch (SQLException e) {}
```

Alternatively, the `DataSource` interface could be used to make connections and is covered extensively in this [Oracle tutorial](https://docs.oracle.com/javase/tutorial/jdbc/basics/sqldatasources.html).

It's always a good idea to close your resources - here we've used the `try-with-resources` syntax to automatically close the `Connection` being created after the block ends.

#### Autocommit mode
By default, when a connection is created it is in auto-commit mode, so every SQL statement acts as a transaction and is committed immediately after execution. In order to manually group statements into a transaction, simply call:

```java
Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
conn.setAutoCommit(false);
// execute some SQL statements...
con.commit();
```

#### JDBC String

The database URL is an address pointing to the database to be used, also known as the JDBC String. The format of this URL varies between database vendors, as shown in the table below:

| RDBMS | JDBC driver | URL format |
| ----- | ----------- | ---------- |
| MySQL | `com.mysql.jdbc.Driver` | jdbc:mysql://hostname/databaseName |
| Oracle | `oracle.jdbc.driver.OracleDriver` | jdbc:oracle:thin:@hostname:portNumber:databaseName |
| SQLServer | `com.microsoft.sqlserver.jdbc.SQLServerDriver` | jdbc:sqlserver://serverName:portNumber;property=value |
| PostgreSQL | `org.postgresql.Driver` | jdbc:postgresql://hostname:port/databaseName |

### Executing SQL
Once we have the `Connection` object, we can write our SQL and execute it:

```java
Statement stmt = conn.createStatement();
String sql = "SELECT * FROM employees";
ResultSet rs = stmt.executeQuery(sql);
```

Alternatively, a `PreparedStatement` can be used. This interface gives us the flexibility of specifying parameters with the `?` symbol. It also protects against [SQL injection](https://en.wikipedia.org/wiki/SQL_injection) when user input is used by pre-compiling the SQL statement.

```java
PreparedStatement ps = conn.prepareStatement();
String sql = "SELECT * FROM employees WHERE age > ? AND location = ?";
ps.setInt(1, 40);
ps.setString(2, "New York");
ResultSet rs = ps.executeQuery(sql);
```

The `Statement` and `PreparedStatement` also have additional methods for sending SQL, including:
* `.execute()` - for any kind of SQL statement, returns a `boolean`
* `.executeUpdate()` - for DML statements, returns an `int` which is the number of rows affected

### Retreiving Results
Results from an SQL query are returned as a `ResultSet`, which can be iterated over to extract the data:

```java
List<Employee> empList = new ArrayList<>();
while (rs.next()) {
  int id = rs.getInt("id");
  String name = rs.getString("first_name");
  empList.add(new Employee(id, name));
}
```

## Data Access Objects
When writing JDBC code, the application business logic may get mixed in with JDBC boilerplate code for querying the database, resulting in hard to read spaghetti code. One way to address this problem is to logically separate the code that accesses the database into Data Access Objects - this is referred to as the **DAO design pattern**.

To use the DAO design pattern, define an interface which declares methods through which the database will be queried. Then, concrete implementation classes can implement the interface and contain the data access logic to return the required data.

For example, if we have an Employee table in our database we'd like to query, we would create a `EmployeeDAO` interface:

```java
public interface EmployeeDAO {
  // define some CRUD operations here
  public List<Employee> getAllEmployees();
  public List<Employee> getEmployeesByLocation(String location);
  public void updateEmployeeById(int id);
  public void deleteEmployeeById(int id);
  public void addEmployee(Employee e);
}
```

This interface would be implemented for a specific database - e.g. Oracle:

```java
public class EmployeeDAOImplOracle implements EmployeeDAO {
  public List<Employee> getAllEmployees() {
    List<Employee> list = new ArrayList<>();
    // JDBC code here...
	return list;
  };
  public List<Employee> getEmployeesByLocation(String location) {
    List<Employee> list = new ArrayList<>();
    // JDBC code here...
	return list;
  };
  public void updateEmployeeById(int id) {
    // JDBC code here...
  };
  public void deleteEmployeeById(int id) {
    // JDBC code here...
  };
  public void addEmployee(Employee e) {
    // JDBC code here...
  };
}
```

Now whenever we need to query the Employee table in the database, we have a simple, clean interface which abstracts the data access logic:

```java
EmployeeDAO dao = new EmployeeDAOImplOracle();
List<Employee> allEmpls = dao.getAllEmployees();
allEmpls.forEach( e -> System.out.println(e));

List<Employee> NYEmpls = dao.getEmployeesByLocation("New York");
NYEmpls.forEach( e -> System.out.println(e));
```

Also, we can simply swap out the concrete class `EmployeeDAOImplOracle` for another database-specific class if we need to at some point in the future, since we rely only on the `EmployeeDAO` interface. The implementation doesn't even need to be talking to a database - it could be reading and writing to files for all we know! We don't care **how** the data is being read or written, we just care **what operations** are defined for the object. That is the benefit the DAO design pattern brings to the table.
 
