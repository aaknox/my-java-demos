# Exercise 1

Company XYZ likes your work so much on the parameterized Container class, that they've hired you to update another one of their classes, MultiContainer. This one supports multiple items within the container. All of those items are stored in a field (instance variable) labeled list.

What you'll need to do is review the MultiContainer class and complete the following:

*   Make the MultiContainer class make use of generics by parameterizing the whole class.
*   Write a method to add an element to the list field.
*   Write a method to remove a specified element from the list field.
*   Write a method to retrieve an element from the list field by supplying an index (int).
*   Write a method to set a specific element from the list field to a supplied one.
*   Write a method to print all elements from the list field.
    

Your class MultiContainer should begin with the following template, which you should edit to suite your needs.:

```java
import java.util.ArrayList;
import java.util.List;

//TODO Update this class to make use of generics
public class MultiContainer {
    
    List list = new ArrayList<>();

    //TODO Create a method to add an element to the list

    //TODO Create a method to remove an element from the list

    //TODO Create a method to retrieve an element from the list by supplying an index (int)

    //TODO Create a method to set a specific element (identified by a supplied index) to a supplied element
    // HINT: You need to supply two parameters to this method, one is the int to identify the index,
    // the other is the parameterized element

    //TODO Create a method to print all elements in the list
}
```

**CHECK YOUR WORK**

Within the **Reference** section we've supplied a solution that we developed that you can use to check your work against.


# Further Thoughts

We could've tried using an array as the backing field for our items instead of a List, but generic arrays cannot be created literally.

You would run into a compiler error if you wrote:

```java
E\[\] e = new E\[8\];
```

This is one of the restrictions that Java enforces with arrays and generics. There is a way around this and that is by use of the Reflection class `Array`. That is beyond the scope of this class, however, so we won't go into any specifics. The main thing you should note is that generic arrays cannot be created in a straightforward manner. You have to make use of special classes that fall under the Reflection category to create a parameterized array.