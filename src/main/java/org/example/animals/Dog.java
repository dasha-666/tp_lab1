package org.example.animals;

public class Dog extends Animals{
    private static int MaxRunDistance = 500;
    private static int MaxSwimDistance = 10;
    private static int count = 0;

    public Dog(String name, int age) {
        super(name, age, MaxRunDistance, MaxSwimDistance);
        count++;
    }
    public static int getCount() {
        return count;
    }
}
