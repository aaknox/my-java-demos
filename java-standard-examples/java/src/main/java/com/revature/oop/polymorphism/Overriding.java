package com.revature.oop.polymorphism;
/**
 * @author Robert Connell
 * 
 * This class will inherit from Parent class and override the methods in there.
 */

import java.io.FileNotFoundException;

public class Overriding extends Parent{
    //These fields have the same name as the parent, what will happen?
    protected int x;
    protected String name;
    //(Variable hiding)
    
    //We can change the return type as long as it is a child of the parent's method's return type.
    //This is known as covariant return types.
    @Override //this will assist in overriding methods because of compiler failure due to improper override
    protected String getObj(){
        return "yep";
    }

    //We can change the access modifier as long as we make it more accessible.
    @Override
    public void changeAccess() {
        System.out.println("yep we sure can!");
    }

    // We can change the throws declaration to have either less exceptions or children of the 
    // parent's method's exceptions, but we cannot add to them.
    // @Override
    // protected void changeThrows() throws Exception{
    //     System.out.println("nope");
    // }

    @Override
    protected void changeThrows() throws FileNotFoundException {
        System.out.println("yep");
    }

    //We cannot override static or private methods, but we can hide static ones.
    public static String hiding(){
       return "hidden";
    }

    //  x, for any instance of Overriding will get a default value instead of the parent's value.
    // In other words for any object of type Overriding, x will have the default value zero- not 5
    // since x in the Overriding class hides x in the Parent class. 
    
    //  Because of inheritance, all instances of a child class have access to the inherited fields, and 
    //  if we don't reassign their values, then we will inherit the value they are assigned in Parent.
 
    public Overriding(){
        this.name="child";
    }

}