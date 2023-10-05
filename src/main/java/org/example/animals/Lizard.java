package org.example.animals;

public class Lizard extends Reptiles {
    private static int Life_Expectancy = 2;
    private static int MaxSwimDistance = 10;
    private static int MaxRunDistance = 20;
    private static int count = 0;
    public Lizard(String name, int age, int Life_Expectancy) {
        super(name, age, Life_Expectancy, MaxRunDistance,MaxSwimDistance);
        count++;
    }
}
