package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal(new Cat());
        Animal dog = new Animal(new Dog());
        cat.behavior();
        dog.behavior();
    }
}
