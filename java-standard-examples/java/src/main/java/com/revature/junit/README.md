# Junit
## Purpose:
This example will demonstrate Junit, its usage, and an overview of Test Driven Development.
## Topics:
* Junit
* Junit annotations
* TDD
## Resources:
[MathOps](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/junit/MathOps.java) `com.revature.junit.MathOps.java`

[TestMathOps](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/junit/TestMathOps.java) `com.revature.junit.TestMathOps.java`

[ParameterizedMathTest](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/junit/ParameterizedMathTest.java) `com.revature.junit.ParameterizedMathTest.java`

## Training Notes:
### Step 1
Create the `MathOps` class and create the add method. Create the `TestMathOps` class and demonstrate the usage of the annotations and assert methods. Run the test and show the output.
### Step 2
Explain Test Driven Development practices and its advantages (code modularity, find defects early, etc.) and disadvantages (slower development pace, major refactoring requirements, etc.). 
> For more on TDD pros and cons, here is a resource: https://leantesting.com/test-driven-development/
### Step 3
Create test methods for `subtract` and `divide` methods before writing them in `MathOps`.
> It sometimes helps associates realize the importance of testing by writing a method incorrectly, either intentionally or not, and seeing the test fail.
### Step 4
Create the `ParameterizedMathTest` class and explain the `RunWith` and `Parameter` annotations. Build the class and its test method. 
> Note: Conclude Junit by challenging associates to create their own tests for various methods with different return types and use various assert methods.