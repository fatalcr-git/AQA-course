package org.aston.course.Task_1;

public class Cat extends Animal {

    private final int MAX_RUN_DISTANCE = 200;
    private final int FOOD_TO_FULL = 10;

    private boolean isFull = false;
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 0 || distance > MAX_RUN_DISTANCE) {
            System.out.println(name + " не может пробежать " + distance + " м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(Bowl bowl) {
        if (isFull) {
            return;
        }
        if (bowl.removeFood(FOOD_TO_FULL)) {
            isFull = true;
        }
    }

    public void printInfoAboutSatiety() {
        String infoAboutSatiety = isFull ? "Сытый" : "Не поел";
        System.out.println(name + " " + infoAboutSatiety);
    }
}
