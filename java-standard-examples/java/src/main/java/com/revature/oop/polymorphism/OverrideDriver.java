/**
 * @author Robert Connell
 *
 */
package com.revature.oop.polymorphism;

public class OverrideDriver {

    public static void main(String[] args) {
        Overriding or1 = new Overriding();
        Parent p1 = new Overriding();
        Parent p2 = new Parent();
        // Doesn't work (compile)
        // Overriding or3 = new Parent();
        // The following will cause ClassCastException
        // Overriding or3 = (Overriding) new Parent();

        // We can cast objects to get the parent's variables
        System.out.println("Overriding x variable: " + or1.x);
        // This the parent's variable due to casting.
        //(i.e. the reference type determines what fields we access)
        System.out.println("Parent x variable: " + p1.x);
        System.out.println("Parent x variable: " + p2.x);
        //Explicit down casting will give us the child's field value.
        System.out.println("Overriding x variable: " + ((Overriding) p1).x);
        //The term for what we did with the variables here is "variable hiding".
        //It should be avoided since it makes the code difficult to follow. 
        
        // We can't use casting to get the parent's method when the actual object is a
        // child.
        // Methods can be overriden, but never casted.
        System.out.println("Overriding getObj() method: " + or1.getObj());
        System.out.println("Overriding getObj() method: " + p1.getObj());
        System.out.println("Parent getObj() method: " + p2.getObj());

        // Since we don't inherit static methods, we can only hide them, not override
        // them.
        // Since they belong to the class, we can technically "cast" to get them, but it isn't
        // necessarily
        // the same as traditional casting.
        System.out.println("Overriding static method: " + or1.hiding());
        System.out.println("Parent static method: " + p1.hiding());
        System.out.println("parent static method: " + p2.hiding());
        System.out.println("Overriding static method: " + ((Overriding) p1).hiding());
        // Note, it's best to only access static fields and methods via the class name (not a reference variable.) 
        // This is why our IDE will typically give us a warning about using variables like p1, p2 and or1 to
        // access static fields.

        // The variable inherited will be the same throughout all instances due to inheritance.
        final String i = "inherited boolean: ";
        System.out.println(i + or1.inherited);
        System.out.println(i + p1.inherited);
        System.out.println(i + p2.inherited);
    }
}