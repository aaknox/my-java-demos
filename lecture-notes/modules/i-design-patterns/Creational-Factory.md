## Factory Pattern
Factory is a design pattern which creates objects in which the precise type may not be known until runtime.
There are several reasons to use the factory pattern:
1. If you don't know the exact types needed before running the code.
2. If you want to hide the creational logic, which prevents end user creating things that they shouldn't.
3. If you need an easy way to extend internal components.
4. Depending on implementation, the factory pattern can be used to reuse objects, instead of making new ones, which saves space.

Some extra benefits of using the factory pattern:
1. Single responsibility is upheld by putting all of the construction code in a single function.
2. Open/Closed principle is upheld by allowing new subclasses to easily implement and be added, without negatively affecting any of the already written classes.
3. Abstracts the actual creation of the objects away from the user.

To make a factory, use:
1. Create the abstract data type
2. Create several classes that inherit the abstract data type (the objects whose instantiation details may not be known until runtime)
3. Set up a static method whose return type is the abstract data type in (1), which will return the concrete instance
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