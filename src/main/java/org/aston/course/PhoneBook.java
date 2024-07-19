package org.aston.course;

import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    Map<String, String> phoneMap = new HashMap<>();

    public void add(String phoneNumber, String lastName) {
        phoneMap.put(phoneNumber, lastName);
    }

    public void printNumberByLastName(String lastName) {
        for (var entry : phoneMap.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public String get(String lastName) {
        StringBuilder output = new StringBuilder(new String()).append(lastName).append(":");
        for (var entry : phoneMap.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                output.append("\n").append(entry.getKey());
            }
        }
        return output.toString();
    }
}
