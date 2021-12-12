# Synchronization

Synchronization is the capability to control the access of multiple threads to any shared resource.

### Synchronized keyword
In a multithreaded environment, a race condition occurs when 2 or more threads attempt to access the same resource. Using the `synchronized` keyword on a piece of logic enforces that only one thread can access the resource at any given time. `synchronized` blocks or methods can be created using the keyword. Also, one way a class can be "thread-safe" is if all of its methods are `synchronized`.

``` java
synchronized(objectidentifier) {
   // Access shared variables and other shared resources
}
```