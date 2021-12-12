Given the classes:
  
**Simulator.java**

```java
public class Simulator {

  public static void main(String[] args) {
    Instrument[] instruments = new Instrument[2];

    instruments[0] = new Trumpet();
    instruments[1] = new DrumKit();

    for(Instrument i: instruments) {
      i.makeSound();
    }
  }
}
```

  
**Instrument.java**

```java
public abstract class Instrument {

  public abstract void makeSound();

}
```

  
**Trumpet.java**

```java
public class Trumpet extends Instrument {

  @Override
  public void makeSound() {
    System.out.println("blurm blurm");
  }
}
```

  
 

**DrumKit.java**

```java
public class DrumKit extends Instrument {

  @Override
  public void makeSound() {
    System.out.println("boom boom");
  }
}
```

What your task now is to add a new Instrument and make it print a message to the console.

You’ll need to complete two steps:

1.  Create a subclass of Instrument and override the makeSound() method to print a phrase of your own.
    
2.  Update Simulator.java to have a 3rd element in the Instrument array which is an instance of your new class from Step 1.
    
