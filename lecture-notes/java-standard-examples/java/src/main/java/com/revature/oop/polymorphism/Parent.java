/**
 * @author Robert Connell
 */
package com.revature.oop.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    protected int x;
    protected String name;
    protected boolean inherited = true;

    protected Object getObj(){
        System.out.println("can we change the return type?");
        return new Object();
    }

    protected void changeThrows() throws IOException {
        System.out.println("can we change the exception?");
    }

    protected void changeAccess(){
        System.out.println("can we change the access?");
    }
    public static String hiding(){
        return "hide me!";
    }

    public Parent(){
        x=5;
        name="parent";
    }

}