## Reflection API

It is an API for modifying the behavior of methods and classes at runtime. It's called "reflection" because you're reflecting/introspecting into the code (so that it can modify itself). 

### Classes in the API:
- Class 
- Method
- Modifier
- Parameter


**NOTE:** You can do things like check an if a class has a specific annotation, method or method signature, or modifier on a method. Frameworks like Spring heavily rely on Reflection to function such as detecting methods and loading classes dynamically. Even JUnit uses Reflection to detect methods with the `@Test` annotation on them. 