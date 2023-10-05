package org.example.animals;

public class Crocodile extends Reptiles {
    private static int MaxSwimDistance = 500;
    private static int MaxRunDistance = 50;
    private static int count = 0;
    public Crocodile(String name, int age, int Life_Expectancy) {
        super(name, age, Life_Expectancy, MaxRunDistance,MaxSwimDistance);
        count++;    }
    public void eat(Animals animal) {
        System.out.println(getName() + " съел " + animal.getName());
    }
}
