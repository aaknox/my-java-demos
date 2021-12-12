Work on Your Own
================

Now that we've walked you through an exercise, it's time for you to try one on your own. You can check your work with our posted solution at the end of the assignment.

**Exercise 1**

For this exercise, you need to write a do-while loop that prints the odd numbers 1 through 49, inclusively, each on a separate line.

**Exercise 2**

For this exercise, you must write a do-while loop that prints the letters of the alphabet. You must use a single **char** variable that you manipulate to print to the console. (You shouldn't have 26 lines of code that each print a letter...)

When you are done, please Mark this activity Complete.

Solutions
=========

**Exercise 1**

public class Exercise1Solution {

public static void main(String\[\] args) {

int i = 1;

   do{

     System.out.println(i);

     i+=2;

   } while (i < 50);

}

}

**Exercise 2**

public class Exercise2Solution {

public static void main(String\[\] args) {

char letter = 'a';

char end = 'z';

   do{

     System.out.println(letter);

     letter++;

   } while (letter <= end);

}

}