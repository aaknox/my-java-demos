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
