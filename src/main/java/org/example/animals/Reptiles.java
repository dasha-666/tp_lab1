package org.example.animals;

public abstract class Reptiles extends Animals{
    private int Life_Expectancy;

    public Reptiles(String name, int age, int life_Expectancy, int MaxRunDistance, int MaxSwimDistance) {
        super(name, age, MaxRunDistance , MaxSwimDistance);
        Life_Expectancy = life_Expectancy;
    }

    public void lifespan() {
        System.out.println("Продолжительность жизни " + this.getName() + ": "+ Life_Expectancy);
    }
}