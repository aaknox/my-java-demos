# Design Patterns - Factory
## Purpose:
The factory design pattern is intended to provide encapsulation to the creation of instances. This example will show how to achieve this pattern.
## Topics:
* Factory design pattern
## Resources:
[Currency](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/Currency.java) `com.revature.designpatterns.factory.Currency.java`

[Bitcoin](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/Bitcoin.java) `com.revature.designpatterns.factory.Bitcoin.java`

[Euro](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/Euro.java) `com.revature.designpatterns.factory.Euro.java`

[USDollar](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/USDollar.java) `com.revature.designpatterns.factory.USDollar.java`

[Yuan](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/Yuan.java) `com.revature.designpatterns.factory.Yuan.java`

[CurrencyFactory](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/CurrencyFactory.java) `com.revature.designpatterns.factory.CurrencyFactory.java`

[FactoryDriver](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/designpatterns/factory/FactoryDriver.java) `com.revature.designpatterns.factory.FactoryDriver.java`
## Getting Started:
### Step 1
Begin the inheritance tree by creating the `Currency` interface.
### Step 2
Create the inheriting classes and implement the `getSymbol()` method.
### Step 3
Create the `CurrencyFactory` class and write the `createCurrency()` method. Explain the switch statement while writing each case.
### Step 4
Create the `FactoryDriver` class and implement the main method while getting feedback from associates to ensure understanding.