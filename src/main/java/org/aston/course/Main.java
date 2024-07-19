package org.aston.course;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String[] words = {"Green", "Blue", "Red", "Purple", "Yellow", "White", "Black", "Gray", "Green", "Blue"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        ArrayWork.printUniqueValues(arr);
        ArrayWork.printCountOfValues(arr);

        System.out.println("Task 2:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+375331233232", "Ivanov");
        phoneBook.add("+375333211212", "Petrov");
        phoneBook.add("+375334443322", "Gustoy");
        phoneBook.add("+375339090909", "Ivanov");

        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}