package org.example.animals;

public class Tortoise extends Reptiles{
    private static int Life_Expectancy;
    private static int MaxSwimDistance = 1000;
    private static int MaxRunDistance = 0;
    private static int count = 0 ;
    public Tortoise(String name, int age, int life_Expectancy) {
        super(name, age, life_Expectancy, MaxRunDistance,MaxSwimDistance);
        count++;
    }
}
