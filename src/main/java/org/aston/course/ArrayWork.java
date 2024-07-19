package org.aston.course;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayWork {

    public static void printUniqueValues(ArrayList<String> array) {
        Set<String> unique = Set.copyOf(array);
        for (String s : unique) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printCountOfValues(ArrayList<String> array) {
        Stream<String> stream = array.stream();
        stream.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
