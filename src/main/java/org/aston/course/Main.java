package org.aston.course;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String[] words = {"Green", "Blue", "Red", "Purple", "Yellow", "White", "Black", "Gray", "Green", "Blue"};
        System.out.println(ArrayWork.getUniqueValues(words));
        System.out.println(ArrayWork.getCountOfValues(words));


        System.out.println("Task 2:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov","+375331233232");
        phoneBook.add("Petrov","+375333211212");
        phoneBook.add("Ivanov","+375334443322");
        phoneBook.add("Gustoy","+375339090909");

        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}