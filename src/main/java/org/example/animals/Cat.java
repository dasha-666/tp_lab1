package org.example.animals;

public class Cat extends Animals {
    private static int MaxRunDistance = 200;
    private static int MaxSwimDistance = 0;
    private static int count = 0;

    public Cat(String name, int age) {
        super(name, age, MaxRunDistance, MaxSwimDistance);
        count++;
    }
    public static int getCount() {
        return count;
    }
}


