package com.collections.practise;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");


        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");


        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(5);  // Ignored, as sets don't allow duplicates

        if (numbers.contains(10)) {
            System.out.println("Set contains 10!");
        }


        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);

        System.out.println(ages);

        System.out.println(numbers);
        System.out.println(names);
        System.out.println(list_Strings);
    }
}
