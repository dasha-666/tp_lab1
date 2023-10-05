package org.example.animals;

public class Tiger extends Animals {
    private static int MaxRunDistance = 2000;
    private static int MaxSwimDistance = 1000;
    private static int count = 0;

    public Tiger(String name, int age) {
        super(name, age, MaxRunDistance, MaxSwimDistance);
        count++;
    }
    public static int getCount() {
        return count;
    }
}


