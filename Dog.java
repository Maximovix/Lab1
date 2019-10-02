package com.company;

public class Dog implements IStrategy {
    @Override
    public void aggressiveBehavior(){
        System.out.print("Dog: Bite"+ "\n");
    }
}
