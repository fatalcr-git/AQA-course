package org.aston.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    Map<String, List<String>> phoneMap = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneMap.containsKey(lastName)) {
            phoneMap.get(lastName).add(phoneNumber);
        } else {
            phoneMap.put(lastName, new ArrayList<>());
            phoneMap.get(lastName).add(phoneNumber);
        }
    }

    public String get(String lastName) {
        List<String> output = phoneMap.get(lastName);
        return output.toString();
    }
}