## Casting
[Casting](https://en.wikipedia.org/wiki/Type_conversion) is the process of converting a data type to another data type. This is also called **type casting**. Casting is necessary is some situations like when receiving a data type that needs to have some actions performed on it that its original form cannot handle.

If the original data type has a smaller size value than the needed type, Java will automatically do the conversion. In the example an int (size of 32 bits) is being cast to a double (size of 64 bits). Due to this the conversion is able to be done without the loss of any data.

```java
public class AutomaticCasting {

  public static void main(String[] args){
    int n = 10;
    double d = n; //This is now converted from an int to a double.
  }
}
```

However cases where the original data type is larger than the needed type, you will have to explicitly convert them using a parenthesis. However there can be data loss using this method.

```java
public class ExplicitCasting {

  public static void main(String[] args){
    double d = 10.60;
    int n = (int) d; //Casting is happening here
    // The 0.60 is lost in conversion.
  }
}
```

In some cases you will have to use the data type's own methods to convert. Some of these methods are listed in the table below.

| Original |   Target  |           Method         |
| ---------| --------- |--------------------------|
| String   | int       |Integer.parseInt(String); |
| int      | String    |String.valueOf(int);      |

You are also able to cast subclass objects to their superclasses which is called upcasting and cast superclass objects to their subclasses (This has some limitations and prerequisites).
