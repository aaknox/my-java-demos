## Exercises

The following are practice exercises which should help reinforce the concepts in the Java Core module:

### Palindromes
Write a Java program that detects whether a String (or multiple Strings) passed to it is a palindrome. For each String, print either `true` or `false`. For example, you would use the program like so on the command line:

```
java PalindromeDetector revature racecar programming bllyllb
# false
# true
# false
# true
```

### Constructors
Write a class that contains at least 3 different constructors. Instantiate 3 different objects using each constructor, and print out a statement that identifies each constructor.

### Control flow
Write a program that will print out integers indefinitely starting from 100 where the difference between subsequent integers is doubled each time, starting with 1. So, the first number would be 100, then 101, 103, 107, 115, 131, ...

**Note**: use `Ctrl+C` to stop a process that is running on the command line.

### Name checking
Write a program that checks all Strings passed to it and prints `true` if any of them contain the substring `Revature`. For example:

```
java NameCheck apple bear cart
# false

java NameCheck yellow zebra Revature!!!! orange
# true

java NameCheck umbrella lion octopus Revature
# true

java NameCheck question R3vatuR3 squirrel
# false
```

### Calculator
Write a program that allows the user to declare a math operation and then provide the operands and prints the result. For example:

```
java Calculator add 4 9
# 15

java Calculator subtract 4 9
# -5

java Calculator multiply 4 9
# 45

java Calculator divide 4 9
# 0.4444444444...
```

For extra work, allow your program to work with integer inputs as well as decimals.