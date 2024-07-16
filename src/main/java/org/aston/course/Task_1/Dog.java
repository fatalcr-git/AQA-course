package org.aston.course.Task_1;

public class Dog extends Animal {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.println(name + " не может пробежать " + distance + " м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIM_DISTANCE) {
            System.out.println(name + " не может проплыть " + distance + " м.");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}