package com.company;

public class Monkey implements IStrategy{
    @Override
    public void aggressiveBehavior(){
        System.out.print("Monkey: Jumps" + "\n");
    }
}
