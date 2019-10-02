package com.company;

public class Animal{
    private IStrategy strategy;

    Animal(IStrategy strategy){
        this.strategy = strategy;
    }

    public void behavior(){
        strategy.aggressiveBehavior();
    }
}
