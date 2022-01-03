## Singleton Pattern
A Singleton is a design pattern which allows the creation of an object in memory only once in an application and can be shared across multiple classes. It can be useful for services in an application, or other resources like a connection or thread pool.

There are many benefits to using a Singleton:
1. There will only be 1 instance, which allows coordination across a system.
2. There is a clear way to fetch the correct instance. `getInstance()`
3. Programmer has complete control over instantiation.
4. global access point
5. The singleton is not created until it is used, often referred to as lazy instantiation.

There are also many drawbacks to using a Singleton:
1. Harder to work with in multithreading.
2. Different components can be given too much control over other components.

To make a class into a Singleton, use:
1. `private static` variable of the class' type
2. `private` constructor - to prevent arbitrary object creation
3. `public static getInstance()` method, which will either instantiate the object or return the instance in memory
```java
    public class Singleton {
        // Private static variable of the class' type
        private static Singleton instance;
        private int number;
        // Private Constructor
        private Singleton() {
            number = 0;
        }

        // Public static getInstance method
        public static Singleton getInstance() {
            if (instance == null) 
                instance = new Singleton();
            return instance;
        }
        //this method is called from an instance of the class.
        //However because there is only 1 instance, whenever this is called it will affect all pointers to the instance.
        public void printer(){
            this.number++;
            system.out.println("printer has been called " + this.number + " times.");

        }
    }

    class Main{
        public static void main(String[] args){
            Singleton mySingle = Singleton.getInstance(); //When this is called the first time the singleton does not exist, so it gets created.
            mySingle.printer(); // output: printer has been called 1 times
            Singleton yourSingle = Singleton.getInstance(); //This time when getInstance is called there already exists an instance, so it just returns the reference to the singleton.
            yourSingle.printer(); // output: printer has been called 2 times
            System.out.println(mySingle == yourSingle); //This will output true, because mySingle points to the same object as yourSingle
        }
    }
```
There are many situations to use a Singleton:
1. many other creational patterns need to limit the number of objects.
2. Facade (another common design pattern) objects are often singletons.
3. State objects may break if there are duplicates.
4. Objects used by many different pieces, such as game boards or memory.
5. And many more.
