package org.aston.course.Task_1;

public class Animal {
    protected String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println(name + "пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + "пробежал " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
