## Hello World Starter Demo

This is a very simple example serving as a first introduction to Java syntax, the compiler, and running a Java application. 

The example is designed to be written twice: once for use with the command line and again in the IDE. 

**Topics**: Java Syntax, Main Method, Java Compiler, Java Bytecode, System.out.println, Java packages, Comments, Constructors  

**How to teach**: 

***Command Line Example***:
1. Open text editor (e.g. Notepad) and create a new file called Hello.java

2. Declare a new public class; explain that a class file can only have one public class and it must match the filename. 
    ```
    public class Hello {}
    ```

3. Give the class a main method and explain what a main method does.
    ```
    public static void main(String[] args){}
    ```

4. Inside the main method create sysout statement to print "Hello World!"
    ```
    System.out.println("Hello World!");
    ```

5. Save and close Hello.java

6. Open command line console (e.g. Git Bash) in the folder where Hello.java is saved. 

7. Explain compiler and compile Hello.java with command line.
    ```
    javac Hello.java
    ```

8. Open Hello.class with text editor to show bytecode is not human readable.
    * You can use javap -c <class file> and show how we can read the byte code instructions.

9. Close text editor and run Hello.class from command line. 
    ``` 
    java Hello 
    ```

***IDE Example***:

1. Open IDE explaining what it is. 

2. Create new java project. 

3. Create new package. 

4. Create new class HelloWorld in the package. 

5. Explain package declaration and the default no-name package. 

6. add a main method with a sysout "Hello World!" as before in steps 3 and 4. 

7. Add comments to class to explain Java comments. 
    ``` 
    // - line comment
	/*
	*  - multi line comment
	*/
	
	/**
	 * Java doc comment - these will show up when documentation is generated from this source code
	 */
     ```
     

8. Run as Java Application to show it works and the IDE console. 

9. Add a HelloWorld Constructor that prints "HelloWorld class constructor" when called. 
    ```
     public HelloWorld() {
		System.out.println("HelloWorld class constructor");
	}
    ```

10. Create a new HelloWorld object in the main class. 

11. Run again to show constructor call. 