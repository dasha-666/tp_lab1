package org.example.animals;

public abstract class Animals{
    private String name;
    private int age;
    private int MaxRunDistance;
    private int MaxSwimDistance;
    private static int count = 0;

    public Animals(String name, int age, int MaxRunDistance, int MaxSwimDistance) {
        this.name= name;
        this.age = age;
        this.MaxRunDistance = MaxRunDistance;
        this.MaxSwimDistance = MaxSwimDistance;
        count++;
    }

    public void Run(int dist) {
        if (MaxRunDistance == 0) {
            System.out.println(name + " Не бегает");
        }
        else if (dist > MaxRunDistance)  {
            System.out.println(name + " Не смог пробежать");
        }
        else {
            System.out.println(name + " пробежал " + dist);
        }
    }
    public void Swim(int dist) {
        if (MaxSwimDistance == 0) {
            System.out.println(name + " Не плавает");
        }
        else if (dist > MaxSwimDistance)  {
            System.out.println(name + " Не смог проплыть");
        }
        else {
            System.out.println(name + " проплыл " + dist);
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMaxRunDistance() {
        return MaxRunDistance;
    }

    public static int getCount() {
        return count;
    }

    public void eat(Animals animal) {
    }
}
