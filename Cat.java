package com.company;

public class Cat implements IStrategy {
    @Override
    public void aggressiveBehavior(){
        System.out.print("Cat: Scratch"+ "\n");
    }
}
