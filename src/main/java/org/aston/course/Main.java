package org.aston.course;

import org.aston.course.Task_1.Animal;
import org.aston.course.Task_1.Bowl;
import org.aston.course.Task_1.Cat;
import org.aston.course.Task_1.Dog;
import org.aston.course.Task_2.Circle;
import org.aston.course.Task_2.Rectangle;
import org.aston.course.Task_2.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Task1();
        System.out.println("Task2");
        Task2();
    }

    public static void Task1() {
        Dog dogBobik = new Dog("Bobik");
        Cat catShark = new Cat("Shark");
        dogBobik.run(30);
        catShark.swim(30);

        Bowl bowl = new Bowl();
        bowl.addFood(25);
        ArrayList<Cat> catArr = new ArrayList<>();
        catArr.add(catShark);
        catArr.add(new Cat("Miki"));
        catArr.add(new Cat("Linky"));
        for (Cat cat : catArr) {
            cat.eat(bowl);
            cat.printInfoAboutSatiety();
        }
        System.out.println("Animal count: " + Animal.getAnimalCount());
        System.out.println("Cat count: " + Cat.getCatCount());
        System.out.println("Dog count: " + Dog.getDogCount());
    }

    public static void Task2() {
        Circle circle = new Circle(12, "black", "black");
        Rectangle rectangle = new Rectangle(10, 10, "purple", "purple");
        Triangle triangle = new Triangle(3,3,3, "red", "red");

        System.out.println("Circle:");
        circle.printInfo();
        System.out.println("Rectangle:");
        rectangle.printInfo();
        System.out.println("Triangle:");
        triangle.printInfo();
    }
}