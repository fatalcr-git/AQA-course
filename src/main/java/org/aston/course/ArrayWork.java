package org.aston.course;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayWork {

    public static List<String> getUniqueValues(String[] array) {
        var unique = new HashSet<>(Arrays.asList(array));
        return new ArrayList<>(unique);
    }

    public static Map<String, Integer> getCountOfValues(String[] array) {
        Stream<String> stream = Arrays.stream(array);
        Map<String, Integer> map = new HashMap<>();
        map = stream.collect(Collectors.toMap(s->s, s-> 1, Integer::sum));
        return map;
    }
}
