package com.revature.oop.abstraction;

public interface Ectothermic {
    void coolDown();

    void heatUp();
    
    //Note that we define a method of the same signature in Amphibious
    void sameMethodSignature(); 
}