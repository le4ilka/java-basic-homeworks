package ru.olga.java.basic.homeworks.homework10_col2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, ArrayList<String>> phoneBook = new HashMap<>();


    public void add(String name, String... number) {
        phoneBook.put(name, new ArrayList<>(Arrays.asList(number)));
    }

    public ArrayList<String> find(String name) {
        return phoneBook.get(name);
    }

    public boolean containsPhoneNumber(String number) {
        for (Map.Entry<String, ArrayList<String>> o : phoneBook.entrySet()) {
            if (o.getValue().contains(number)) {
                return true;
            }
        }
        return false;
    }
}
