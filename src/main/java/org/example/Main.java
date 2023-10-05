package org.example;

import org.example.animals.*;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat("Kiska", 1),
                new Dog("Shavka", 6),
                new Tiger("Polosatik", 2),
                new Crocodile("Koshelek", 20, 30),
                new Lizard("Zhivchik", 1, 50),
                new Tortoise("Marina", 40, 80)};
        for (Animals a : animals) {
            a.Swim(10);
            a.Run(100);
        }
        new Cat("Orun", 5);
        animals[0].Swim(100);
        ((Reptiles)animals[3]).lifespan();
        ((Reptiles)animals[4]).lifespan();
        ((Reptiles)animals[5]).lifespan();
        animals[3].eat(animals[0]);
        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество тигров: " + Tiger.getCount());
        System.out.println("Количество Пресмыкающиеся: " + Reptiles.getCount());
        System.out.println("Количество животных: " + Animals.getCount());
    }

}
